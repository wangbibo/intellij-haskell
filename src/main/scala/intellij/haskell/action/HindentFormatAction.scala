/*
 * Copyright 2016 Rik van der Kleij
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package intellij.haskell.action

import com.intellij.openapi.actionSystem.{AnAction, AnActionEvent}
import com.intellij.psi.PsiFile
import com.intellij.psi.codeStyle._
import intellij.haskell.settings.HaskellSettingsState
import intellij.haskell.util.{HaskellEditorUtil, HaskellFileUtil}
import intellij.haskell.{HaskellLanguage, HaskellNotificationGroup}

import scala.sys.process.ProcessLogger

class HindentFormatAction extends AnAction {

  override def update(actionEvent: AnActionEvent) {
    HaskellEditorUtil.enableAction(onlyForProjectFile = true, actionEvent)
  }

  override def actionPerformed(actionEvent: AnActionEvent): Unit = {
    ActionUtil.findPsiFile(actionEvent).foreach(psiFile => {
      HindentFormatAction.format(psiFile)
    })
  }
}

object HindentFormatAction {
  final val HindentName = "hindent"

  private[action] def format(psiFile: PsiFile): Unit = {
    val lineLength = CodeStyleSettingsManager.getInstance(psiFile.getProject).getCurrentSettings.getRightMargin(HaskellLanguage.Instance)
    val indentOptions = CodeStyleSettingsManager.getInstance(psiFile.getProject).getCurrentSettings.getCommonSettings(HaskellLanguage.Instance).getIndentOptions
    val virtualFile = HaskellFileUtil.findVirtualFile(psiFile)

    HaskellFileUtil.saveFile(virtualFile)

    HaskellSettingsState.getHindentPath match {
      case Some(hindentPath) =>
        val command = Seq(hindentPath, "--line-length", lineLength.toString, "--indent-size", indentOptions.INDENT_SIZE.toString)

        import scala.sys.process._
        val processBuilder = command #< virtualFile.getInputStream
        val processLogger: OnlyErrorProcessLogger = new OnlyErrorProcessLogger
        val formattedSourceCode = processBuilder.lineStream_!(processLogger).mkString("\n")

        if (processLogger.hasErrors) {
          HaskellNotificationGroup.notifyBalloonError(s"Error while formatting by `$HindentName`. See Event Log for errors")
        } else {
          HaskellFileUtil.saveFileWithContent(psiFile.getProject, virtualFile, formattedSourceCode)
        }
      case _ => HaskellNotificationGroup.logWarning("Can not format code because path to `hindent` is not configured in IntelliJ")
    }
  }

  private class OnlyErrorProcessLogger extends ProcessLogger {
    var hasErrors = false

    override def out(s: => String): Unit = ()

    override def err(s: => String): Unit = {
      hasErrors = true
      HaskellNotificationGroup.logError(s)
    }

    override def buffer[T](f: => T): T = f
  }

}
