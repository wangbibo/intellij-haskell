/* The following code was generated by JFlex 1.4.3 on 7/14/14 12:15 PM */

package com.powertuple.intellij.haskell;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.powertuple.intellij.haskell.psi.HaskellTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 7/14/14 12:15 PM from the specification file
 * <tt>/home/rik/idea/intellij-haskell/src/com/powertuple/intellij/haskell/_HaskellLexer.flex</tt>
 */
public class _HaskellLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\1\1\10\0\1\1\1\3\1\0\1\27\1\2\21\0\1\1\1\1"+
    "\1\55\1\30\1\56\1\57\1\60\1\61\1\26\1\71\1\72\1\62"+
    "\1\17\1\73\1\23\1\63\1\64\1\11\7\14\2\6\1\100\1\74"+
    "\1\65\1\101\1\66\1\67\1\103\4\10\1\22\1\10\10\5\1\16"+
    "\10\5\1\13\2\5\1\75\1\20\1\76\1\70\1\54\1\77\1\31"+
    "\1\7\1\44\1\40\1\21\1\37\1\43\1\41\1\36\2\4\1\35"+
    "\1\50\1\42\1\15\1\51\1\33\1\46\1\32\1\45\1\34\1\47"+
    "\1\52\1\12\1\53\1\4\1\24\1\102\1\25\1\104\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\4\1\5\2\6\1\4"+
    "\1\7\1\10\1\4\1\11\1\12\1\13\2\1\14\4"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\4\0\1\45\1\46\2\0\1\4\1\47\1\50"+
    "\2\0\1\51\1\0\1\52\1\53\2\4\1\54\1\55"+
    "\2\4\1\56\12\4\1\57\1\60\1\61\1\62\2\46"+
    "\1\0\1\63\1\64\1\4\1\0\1\4\1\65\17\4"+
    "\1\66\1\67\7\4\1\70\2\4\1\71\1\4\1\72"+
    "\1\73\4\4\1\74\6\4\1\75\1\4\1\76\2\4"+
    "\1\77\1\100\1\101\3\4\1\102\1\4\1\103\2\4"+
    "\1\104\1\105\1\4\1\106\1\4\1\107\1\110\1\111";

  private static int [] zzUnpackAction() {
    int [] result = new int[168];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\105\0\212\0\317\0\105\0\u0114\0\u0159\0\u019e"+
    "\0\u01e3\0\u0228\0\u026d\0\u02b2\0\u02f7\0\u033c\0\u0381\0\105"+
    "\0\u03c6\0\u040b\0\u0450\0\u0495\0\u04da\0\u051f\0\u0564\0\u05a9"+
    "\0\u05ee\0\u0633\0\u0678\0\u06bd\0\u0702\0\u0747\0\u0114\0\105"+
    "\0\105\0\105\0\105\0\105\0\105\0\u078c\0\105\0\u07d1"+
    "\0\105\0\105\0\105\0\105\0\105\0\105\0\105\0\105"+
    "\0\105\0\105\0\u0816\0\u085b\0\105\0\105\0\105\0\u08a0"+
    "\0\u08e5\0\u092a\0\u096f\0\u0114\0\u09b4\0\u02b2\0\u09f9\0\u0a3e"+
    "\0\u0a83\0\105\0\u0ac8\0\u03c6\0\105\0\u040b\0\105\0\u0114"+
    "\0\u0b0d\0\u0b52\0\u0114\0\u0b97\0\u0bdc\0\u0c21\0\u0114\0\u0c66"+
    "\0\u0cab\0\u0cf0\0\u0d35\0\u0d7a\0\u0dbf\0\u0e04\0\u0e49\0\u0e8e"+
    "\0\u0ed3\0\105\0\105\0\105\0\105\0\u0f18\0\u0f5d\0\u0f5d"+
    "\0\u092a\0\u096f\0\u0fa2\0\u0fe7\0\u102c\0\u0114\0\u1071\0\u10b6"+
    "\0\u10fb\0\u1140\0\u1185\0\u11ca\0\u120f\0\u1254\0\u1299\0\u12de"+
    "\0\u1323\0\u1368\0\u13ad\0\u13f2\0\u1437\0\u0114\0\u0ac8\0\u147c"+
    "\0\u14c1\0\u1506\0\u154b\0\u1590\0\u15d5\0\u161a\0\u0114\0\u165f"+
    "\0\u16a4\0\u0114\0\u16e9\0\u0114\0\u0114\0\u172e\0\u1773\0\u17b8"+
    "\0\u17fd\0\u1842\0\u1887\0\u18cc\0\u1911\0\u1956\0\u199b\0\u19e0"+
    "\0\u0114\0\u1a25\0\u0114\0\u1a6a\0\u1aaf\0\u0114\0\u0114\0\u0114"+
    "\0\u1af4\0\u1b39\0\u1b7e\0\u0114\0\u1bc3\0\u0114\0\u1c08\0\u1c4d"+
    "\0\u0114\0\u0114\0\u1c92\0\u0114\0\u1cd7\0\u0114\0\u0114\0\u0114";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[168];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\6"+
    "\1\7\1\11\1\6\1\7\1\10\1\12\1\7\1\13"+
    "\1\14\1\15\1\7\1\16\1\17\1\20\1\21\1\3"+
    "\1\22\1\23\1\6\1\24\1\6\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\6\1\33\1\34\2\6\1\35"+
    "\1\6\1\36\1\6\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63"+
    "\1\64\1\65\1\66\1\67\106\0\1\3\25\0\1\3"+
    "\60\0\1\5\105\0\13\6\2\0\2\6\3\0\1\6"+
    "\2\0\24\6\34\0\2\7\1\0\2\7\1\0\2\7"+
    "\1\0\2\7\2\0\2\7\6\0\24\7\36\0\1\10"+
    "\2\0\1\10\2\0\1\10\3\0\1\70\2\71\70\0"+
    "\1\10\2\0\1\10\2\72\1\10\2\73\1\0\1\70"+
    "\2\71\66\0\13\6\2\0\2\6\3\0\1\6\2\0"+
    "\6\6\1\74\15\6\36\0\1\75\2\0\1\75\2\0"+
    "\1\75\3\0\1\76\64\0\3\77\1\0\101\77\4\0"+
    "\13\6\2\0\2\6\3\0\1\6\2\0\4\6\1\100"+
    "\17\6\36\0\1\75\2\0\1\75\2\0\1\75\3\0"+
    "\1\76\2\0\1\101\42\0\1\102\41\0\1\103\61\0"+
    "\2\104\2\0\14\104\1\0\5\104\1\105\1\0\55\104"+
    "\2\106\2\0\14\106\1\0\6\106\1\0\1\107\54\106"+
    "\4\0\13\6\2\0\2\6\3\0\1\6\2\0\1\6"+
    "\1\110\22\6\34\0\13\6\2\0\2\6\3\0\1\6"+
    "\2\0\3\6\1\111\20\6\34\0\13\6\2\0\1\112"+
    "\1\6\3\0\1\6\2\0\24\6\34\0\13\6\2\0"+
    "\2\6\3\0\1\6\2\0\6\6\1\113\2\6\1\114"+
    "\5\6\1\115\4\6\34\0\11\6\1\116\1\6\2\0"+
    "\2\6\3\0\1\6\2\0\24\6\34\0\11\6\1\117"+
    "\1\6\2\0\1\120\1\6\3\0\1\6\2\0\1\121"+
    "\23\6\34\0\13\6\2\0\2\6\3\0\1\6\2\0"+
    "\5\6\1\122\16\6\34\0\13\6\2\0\1\123\1\6"+
    "\3\0\1\6\2\0\24\6\34\0\13\6\2\0\2\6"+
    "\3\0\1\6\2\0\1\124\3\6\1\125\17\6\34\0"+
    "\13\6\2\0\2\6\3\0\1\6\2\0\10\6\1\126"+
    "\11\6\1\127\1\6\34\0\11\6\1\130\1\6\2\0"+
    "\2\6\3\0\1\6\2\0\24\6\34\0\13\6\2\0"+
    "\2\6\3\0\1\6\2\0\10\6\1\131\13\6\113\0"+
    "\1\132\44\0\1\133\161\0\1\134\72\0\1\135\16\0"+
    "\3\136\1\0\101\136\6\0\1\137\2\0\1\137\2\0"+
    "\1\137\2\0\1\140\3\0\1\140\67\0\4\141\2\0"+
    "\1\141\4\0\2\141\6\0\1\141\5\0\2\141\3\0"+
    "\1\141\51\0\1\142\2\0\1\142\76\0\1\75\2\0"+
    "\1\75\2\0\1\75\3\0\1\70\2\71\70\0\1\136"+
    "\2\0\1\136\2\0\1\136\74\0\13\6\2\0\2\6"+
    "\3\0\1\6\2\0\1\6\1\143\22\6\30\0\2\101"+
    "\2\0\101\101\23\103\1\144\61\103\4\0\13\6\2\0"+
    "\2\6\3\0\1\6\2\0\1\145\23\6\34\0\13\6"+
    "\2\0\2\6\3\0\1\6\2\0\14\6\1\146\7\6"+
    "\34\0\13\6\2\0\2\6\3\0\1\6\2\0\1\6"+
    "\1\147\4\6\1\150\15\6\34\0\13\6\2\0\2\6"+
    "\3\0\1\6\2\0\20\6\1\151\3\6\34\0\13\6"+
    "\2\0\2\6\3\0\1\6\2\0\15\6\1\152\6\6"+
    "\34\0\13\6\2\0\2\6\3\0\1\6\2\0\6\6"+
    "\1\153\6\6\1\154\6\6\34\0\13\6\2\0\2\6"+
    "\3\0\1\6\2\0\14\6\1\155\7\6\34\0\13\6"+
    "\2\0\2\6\3\0\1\6\2\0\7\6\1\156\14\6"+
    "\34\0\13\6\2\0\2\6\3\0\1\6\2\0\21\6"+
    "\1\157\2\6\34\0\13\6\2\0\2\6\3\0\1\6"+
    "\2\0\1\6\1\160\22\6\34\0\13\6\2\0\2\6"+
    "\3\0\1\6\2\0\1\161\23\6\34\0\13\6\2\0"+
    "\1\162\1\6\3\0\1\6\2\0\24\6\34\0\13\6"+
    "\2\0\2\6\3\0\1\6\2\0\20\6\1\163\3\6"+
    "\34\0\13\6\2\0\2\6\3\0\1\6\2\0\7\6"+
    "\1\164\14\6\34\0\13\6\2\0\1\165\1\6\3\0"+
    "\1\6\2\0\24\6\36\0\1\136\2\0\1\136\2\0"+
    "\1\136\4\0\2\71\70\0\1\137\2\0\1\137\2\0"+
    "\1\137\74\0\13\6\2\0\1\166\1\6\3\0\1\6"+
    "\2\0\24\6\30\0\23\103\1\144\1\103\1\167\57\103"+
    "\4\0\13\6\2\0\2\6\3\0\1\6\2\0\4\6"+
    "\1\170\17\6\34\0\13\6\2\0\2\6\3\0\1\6"+
    "\2\0\14\6\1\171\7\6\34\0\13\6\2\0\2\6"+
    "\3\0\1\6\2\0\5\6\1\172\16\6\34\0\11\6"+
    "\1\173\1\6\2\0\2\6\3\0\1\6\2\0\24\6"+
    "\34\0\13\6\2\0\1\174\1\6\3\0\1\6\2\0"+
    "\24\6\34\0\13\6\2\0\2\6\3\0\1\6\2\0"+
    "\1\175\23\6\34\0\13\6\2\0\2\6\3\0\1\6"+
    "\2\0\5\6\1\176\16\6\34\0\13\6\2\0\2\6"+
    "\3\0\1\6\2\0\1\177\23\6\34\0\13\6\2\0"+
    "\2\6\3\0\1\6\2\0\5\6\1\200\16\6\34\0"+
    "\13\6\2\0\2\6\3\0\1\6\2\0\14\6\1\201"+
    "\7\6\34\0\13\6\2\0\1\202\1\6\3\0\1\6"+
    "\2\0\24\6\34\0\13\6\2\0\2\6\3\0\1\6"+
    "\2\0\1\6\1\203\22\6\34\0\13\6\2\0\2\6"+
    "\3\0\1\6\2\0\11\6\1\204\12\6\34\0\13\6"+
    "\2\0\1\205\1\6\3\0\1\6\2\0\24\6\34\0"+
    "\13\6\2\0\2\6\3\0\1\6\2\0\3\6\1\206"+
    "\20\6\34\0\13\6\2\0\2\6\3\0\1\6\2\0"+
    "\15\6\1\207\6\6\34\0\13\6\2\0\2\6\3\0"+
    "\1\6\2\0\5\6\1\210\16\6\34\0\13\6\2\0"+
    "\2\6\3\0\1\6\2\0\1\211\23\6\34\0\6\6"+
    "\1\212\4\6\2\0\2\6\3\0\1\6\2\0\24\6"+
    "\34\0\13\6\2\0\2\6\3\0\1\6\2\0\15\6"+
    "\1\213\6\6\34\0\13\6\2\0\2\6\3\0\1\6"+
    "\2\0\5\6\1\214\16\6\34\0\13\6\2\0\2\6"+
    "\3\0\1\6\2\0\3\6\1\215\20\6\34\0\13\6"+
    "\2\0\2\6\3\0\1\6\2\0\16\6\1\216\5\6"+
    "\34\0\13\6\2\0\2\6\3\0\1\6\2\0\11\6"+
    "\1\217\12\6\34\0\13\6\2\0\2\6\3\0\1\6"+
    "\2\0\22\6\1\220\1\6\34\0\13\6\2\0\2\6"+
    "\3\0\1\6\2\0\1\6\1\221\22\6\34\0\13\6"+
    "\2\0\2\6\3\0\1\6\2\0\4\6\1\222\17\6"+
    "\34\0\13\6\2\0\1\223\1\6\3\0\1\6\2\0"+
    "\24\6\34\0\13\6\2\0\2\6\3\0\1\6\2\0"+
    "\6\6\1\224\15\6\34\0\13\6\2\0\2\6\3\0"+
    "\1\6\2\0\11\6\1\225\12\6\34\0\13\6\2\0"+
    "\2\6\3\0\1\6\2\0\4\6\1\226\10\6\1\227"+
    "\6\6\34\0\13\6\2\0\2\6\3\0\1\6\2\0"+
    "\14\6\1\230\7\6\34\0\13\6\2\0\2\6\3\0"+
    "\1\6\2\0\12\6\1\231\11\6\34\0\13\6\2\0"+
    "\2\6\3\0\1\6\2\0\4\6\1\232\17\6\34\0"+
    "\13\6\2\0\2\6\3\0\1\6\2\0\5\6\1\233"+
    "\16\6\34\0\13\6\2\0\2\6\3\0\1\6\2\0"+
    "\12\6\1\234\11\6\34\0\13\6\2\0\2\6\3\0"+
    "\1\6\2\0\20\6\1\235\3\6\34\0\13\6\2\0"+
    "\1\236\1\6\3\0\1\6\2\0\24\6\34\0\13\6"+
    "\2\0\2\6\3\0\1\6\2\0\5\6\1\237\16\6"+
    "\34\0\13\6\2\0\2\6\3\0\1\6\2\0\13\6"+
    "\1\240\10\6\34\0\13\6\2\0\2\6\3\0\1\6"+
    "\2\0\11\6\1\241\12\6\34\0\13\6\2\0\2\6"+
    "\3\0\1\6\2\0\14\6\1\242\7\6\34\0\13\6"+
    "\2\0\2\6\3\0\1\6\2\0\11\6\1\243\12\6"+
    "\34\0\13\6\2\0\1\244\1\6\3\0\1\6\2\0"+
    "\24\6\34\0\13\6\2\0\1\245\1\6\3\0\1\6"+
    "\2\0\24\6\34\0\13\6\2\0\1\246\1\6\3\0"+
    "\1\6\2\0\24\6\34\0\13\6\2\0\2\6\3\0"+
    "\1\6\2\0\12\6\1\247\11\6\34\0\13\6\2\0"+
    "\2\6\3\0\1\6\2\0\7\6\1\250\14\6\30\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7452];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\12\1\1\11\17\1\6\11"+
    "\1\1\1\11\1\1\12\11\2\1\3\11\4\0\2\1"+
    "\2\0\2\1\1\11\2\0\1\11\1\0\1\11\22\1"+
    "\4\11\2\1\1\0\3\1\1\0\104\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[168];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
  public _HaskellLexer() {
    this((java.io.Reader)null);
  }


  public _HaskellLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _HaskellLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 158) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 57: 
          { return HS_CASE;
          }
        case 74: break;
        case 51: 
          { return HS_HEXADECIMAL;
          }
        case 75: break;
        case 39: 
          { return HS_COMMENT;
          }
        case 76: break;
        case 49: 
          { return HS_COLON_COLON;
          }
        case 77: break;
        case 61: 
          { return HS_CLASS;
          }
        case 78: break;
        case 73: 
          { return HS_QUALIFIED;
          }
        case 79: break;
        case 70: 
          { return HS_NEWTYPE;
          }
        case 80: break;
        case 35: 
          { return HS_AT;
          }
        case 81: break;
        case 47: 
          { return HS_DOT_DOT;
          }
        case 82: break;
        case 44: 
          { return HS_IF;
          }
        case 83: break;
        case 3: 
          { return HS_NEWLINE;
          }
        case 84: break;
        case 28: 
          { return HS_SEMICOLON;
          }
        case 85: break;
        case 60: 
          { return HS_INFIX;
          }
        case 86: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 87: break;
        case 43: 
          { return HS_AS;
          }
        case 88: break;
        case 38: 
          { return HS_FLOAT;
          }
        case 89: break;
        case 26: 
          { return HS_RIGHT_PAREN;
          }
        case 90: break;
        case 55: 
          { return HS_NCOMMENT;
          }
        case 91: break;
        case 36: 
          { return HS_TILDE;
          }
        case 92: break;
        case 9: 
          { return HS_DASH;
          }
        case 93: break;
        case 6: 
          { return HS_DECIMAL;
          }
        case 94: break;
        case 53: 
          { return HS_LET;
          }
        case 95: break;
        case 20: 
          { return HS_SLASH;
          }
        case 96: break;
        case 62: 
          { return HS_WHERE;
          }
        case 97: break;
        case 13: 
          { return HS_EXCLAMATION_MARK;
          }
        case 98: break;
        case 42: 
          { return HS_STRING_LITERAL;
          }
        case 99: break;
        case 48: 
          { return HS_LEFT_ARROW;
          }
        case 100: break;
        case 67: 
          { return HS_MODULE;
          }
        case 101: break;
        case 10: 
          { return HS_LEFT_BRACE;
          }
        case 102: break;
        case 56: 
          { return HS_DATA;
          }
        case 103: break;
        case 41: 
          { return HS_CHARACTER_LITERAL;
          }
        case 104: break;
        case 4: 
          { return HS_VAR_ID;
          }
        case 105: break;
        case 12: 
          { return HS_UNDERSCORE;
          }
        case 106: break;
        case 7: 
          { return HS_PLUS;
          }
        case 107: break;
        case 17: 
          { return HS_AMPERSAND;
          }
        case 108: break;
        case 34: 
          { return HS_VERTICAL_BAR;
          }
        case 109: break;
        case 59: 
          { return HS_TYPE;
          }
        case 110: break;
        case 15: 
          { return HS_DOLLAR;
          }
        case 111: break;
        case 14: 
          { return HS_HASH;
          }
        case 112: break;
        case 33: 
          { return HS_EQUAL;
          }
        case 113: break;
        case 66: 
          { return HS_HIDING;
          }
        case 114: break;
        case 16: 
          { return HS_PERCENTAGE;
          }
        case 115: break;
        case 32: 
          { return HS_COLON;
          }
        case 116: break;
        case 71: 
          { return HS_INSTANCE;
          }
        case 117: break;
        case 30: 
          { return HS_RIGHT_BRACKET;
          }
        case 118: break;
        case 25: 
          { return HS_LEFT_PAREN;
          }
        case 119: break;
        case 31: 
          { return HS_BACKQUOTE;
          }
        case 120: break;
        case 21: 
          { return HS_LT;
          }
        case 121: break;
        case 29: 
          { return HS_LEFT_BRACKET;
          }
        case 122: break;
        case 23: 
          { return HS_QUESTION_MARK;
          }
        case 123: break;
        case 63: 
          { return HS_INFIXL;
          }
        case 124: break;
        case 65: 
          { return HS_IMPORT;
          }
        case 125: break;
        case 72: 
          { return HS_DERIVING;
          }
        case 126: break;
        case 5: 
          { return HS_CON_ID;
          }
        case 127: break;
        case 46: 
          { return HS_DO;
          }
        case 128: break;
        case 19: 
          { return HS_DOT;
          }
        case 129: break;
        case 45: 
          { return HS_IN;
          }
        case 130: break;
        case 52: 
          { return HS_OCTAL;
          }
        case 131: break;
        case 64: 
          { return HS_INFIXR;
          }
        case 132: break;
        case 24: 
          { return HS_CARET;
          }
        case 133: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 134: break;
        case 69: 
          { return HS_DEFAULT;
          }
        case 135: break;
        case 50: 
          { return HS_DOUBLE_RIGHT_ARROW;
          }
        case 136: break;
        case 54: 
          { return HS_ELSE;
          }
        case 137: break;
        case 27: 
          { return HS_COMMA;
          }
        case 138: break;
        case 22: 
          { return HS_GT;
          }
        case 139: break;
        case 18: 
          { return HS_STAR;
          }
        case 140: break;
        case 8: 
          { return HS_BACKSLASH;
          }
        case 141: break;
        case 37: 
          { return HS_OF;
          }
        case 142: break;
        case 68: 
          { return HS_FOREIGN;
          }
        case 143: break;
        case 58: 
          { return HS_THEN;
          }
        case 144: break;
        case 40: 
          { return HS_RIGHT_ARROW;
          }
        case 145: break;
        case 11: 
          { return HS_RIGHT_BRACE;
          }
        case 146: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
