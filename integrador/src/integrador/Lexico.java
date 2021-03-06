// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: C:/Users/Sebas/Desktop/Lexico.flex

package integrador;

import java_cup.runtime.*;
import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\36\u0200\1\u0300\267\u0200\10\u0400\37\u0200\1\u0500"+
    "\u1000\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\2\2\22\0\1\1\1\0"+
    "\1\4\5\0\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\12\15\1\16\1\0\1\17\1\20\1\21"+
    "\2\0\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\2\31\1\33\1\34\1\35\1\36\1\37"+
    "\1\31\1\40\1\41\1\42\6\31\1\43\1\0\1\44"+
    "\1\0\1\45\1\0\1\46\2\31\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\2\31\1\55\1\31\1\56\1\57"+
    "\2\31\1\60\1\61\1\62\1\63\1\31\1\64\3\31"+
    "\1\65\1\0\1\66\7\0\1\3\33\0\2\31\6\0"+
    "\2\31\2\0\2\31\4\0\2\31\5\0\2\31\7\0"+
    "\1\31\235\0\1\31\u01ba\0\1\31\13\0\2\3\6\0"+
    "\1\31\317\0\u0100\3\375\0\1\31\2\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1536];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\1\1\11\1\12\1\1\1\13\1\1"+
    "\1\14\10\15\1\16\1\17\5\15\1\20\1\21\1\0"+
    "\1\22\1\23\1\0\1\24\1\0\1\25\1\26\1\27"+
    "\1\30\6\15\1\31\5\15\1\32\2\15\2\0\5\15"+
    "\1\33\3\15\1\34\3\15\1\35\1\0\2\15\1\0"+
    "\1\15\1\36\5\15\1\37\1\15\3\0\1\35\2\15"+
    "\1\0\1\15\1\40\1\15\1\41\1\15\1\42\1\43"+
    "\1\35\4\0\1\15\1\0\2\15\1\44\2\0\1\35"+
    "\1\0\1\45\1\0\1\15\1\46\4\0\1\15\2\0"+
    "\1\15\2\0\1\47\1\0\1\50\1\0\1\51";

  private static int [] zzUnpackAction() {
    int [] result = new int[135];
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
    "\0\0\0\67\0\156\0\245\0\67\0\67\0\67\0\67"+
    "\0\67\0\67\0\334\0\67\0\u0113\0\u014a\0\u0181\0\u01b8"+
    "\0\u01ef\0\u0226\0\u025d\0\u0294\0\u02cb\0\u0302\0\u0339\0\u0370"+
    "\0\u03a7\0\67\0\67\0\u03de\0\u0415\0\u044c\0\u0483\0\u04ba"+
    "\0\67\0\67\0\245\0\245\0\334\0\334\0\67\0\u04f1"+
    "\0\67\0\67\0\67\0\67\0\u0528\0\u055f\0\u0596\0\u05cd"+
    "\0\u0604\0\u063b\0\u0226\0\u0672\0\u06a9\0\u06e0\0\u0717\0\u074e"+
    "\0\u0226\0\u0785\0\u07bc\0\u07f3\0\u082a\0\u0861\0\u0898\0\u08cf"+
    "\0\u0906\0\u093d\0\u0226\0\u0974\0\u09ab\0\u09e2\0\u0226\0\u0a19"+
    "\0\u0a50\0\u0a87\0\67\0\u0abe\0\u0af5\0\u0b2c\0\u0b63\0\u0b9a"+
    "\0\u0226\0\u0bd1\0\u0c08\0\u0c3f\0\u0c76\0\u0cad\0\u0226\0\u0ce4"+
    "\0\u0d1b\0\u0d52\0\u0d89\0\u0dc0\0\u0df7\0\u0e2e\0\u0e65\0\u0e9c"+
    "\0\u0226\0\u0ed3\0\u0226\0\u0f0a\0\u0226\0\u0226\0\u0f41\0\u0f78"+
    "\0\u0dc0\0\u0faf\0\u0fe6\0\u101d\0\u1054\0\u108b\0\u10c2\0\u0226"+
    "\0\u0f41\0\u10f9\0\u1130\0\u1167\0\u0226\0\u119e\0\u11d5\0\u0226"+
    "\0\u1130\0\u120c\0\u1243\0\u127a\0\u12b1\0\u12e8\0\u131f\0\u1356"+
    "\0\u138d\0\u13c4\0\u0226\0\u13fb\0\67\0\u1432\0\67";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[135];
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
    "\1\2\2\3\1\2\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\22\1\24\1\25\1\26\2\22"+
    "\1\27\4\22\1\30\1\22\1\31\1\22\1\32\1\33"+
    "\1\2\1\34\2\22\1\35\5\22\1\36\2\22\1\37"+
    "\1\22\1\40\1\41\1\42\70\0\2\3\64\0\2\43"+
    "\2\0\1\44\62\43\15\0\1\45\64\0\1\46\1\0"+
    "\1\15\71\0\1\47\62\0\1\50\3\0\1\51\1\52"+
    "\65\0\1\53\66\0\1\54\63\0\1\22\4\0\21\22"+
    "\2\0\20\22\17\0\1\22\4\0\4\22\1\55\14\22"+
    "\2\0\20\22\17\0\1\22\4\0\4\22\1\56\14\22"+
    "\2\0\20\22\17\0\1\22\4\0\13\22\1\57\5\22"+
    "\2\0\10\22\1\60\7\22\17\0\1\22\4\0\11\22"+
    "\1\61\7\22\2\0\20\22\17\0\1\22\4\0\13\22"+
    "\1\62\5\22\2\0\4\22\1\63\1\64\12\22\17\0"+
    "\1\22\4\0\16\22\1\65\2\22\2\0\20\22\17\0"+
    "\1\22\4\0\20\22\1\66\2\0\20\22\17\0\1\22"+
    "\4\0\21\22\2\0\11\22\1\67\6\22\17\0\1\22"+
    "\4\0\21\22\2\0\1\22\1\70\16\22\17\0\1\22"+
    "\4\0\21\22\2\0\13\22\1\71\4\22\17\0\1\22"+
    "\4\0\21\22\2\0\13\22\1\72\4\22\17\0\1\22"+
    "\4\0\21\22\2\0\6\22\1\73\11\22\2\0\14\50"+
    "\1\74\2\50\1\75\47\50\15\0\1\22\4\0\6\22"+
    "\1\76\12\22\2\0\20\22\17\0\1\22\4\0\2\22"+
    "\1\77\16\22\2\0\20\22\17\0\1\22\4\0\3\22"+
    "\1\100\15\22\2\0\20\22\17\0\1\22\4\0\21\22"+
    "\2\0\14\22\1\101\3\22\17\0\1\22\4\0\14\22"+
    "\1\102\4\22\2\0\20\22\17\0\1\22\4\0\20\22"+
    "\1\103\2\0\20\22\17\0\1\22\4\0\21\22\2\0"+
    "\16\22\1\104\1\22\17\0\1\22\4\0\10\22\1\105"+
    "\10\22\2\0\20\22\17\0\1\22\4\0\16\22\1\106"+
    "\2\22\2\0\20\22\17\0\1\22\4\0\21\22\2\0"+
    "\2\22\1\107\15\22\17\0\1\22\4\0\21\22\2\0"+
    "\10\22\1\110\7\22\17\0\1\22\4\0\21\22\2\0"+
    "\16\22\1\111\1\22\17\0\1\22\4\0\21\22\2\0"+
    "\7\22\1\112\10\22\2\0\14\50\1\74\2\50\1\75"+
    "\1\50\1\113\61\50\1\114\2\50\1\75\47\50\15\0"+
    "\1\22\4\0\10\22\1\115\10\22\2\0\20\22\17\0"+
    "\1\22\4\0\11\22\1\116\7\22\2\0\20\22\15\0"+
    "\1\117\1\0\1\22\4\0\3\22\1\120\15\22\2\0"+
    "\20\22\17\0\1\22\4\0\21\22\2\0\3\22\1\121"+
    "\14\22\17\0\1\22\4\0\1\122\20\22\2\0\20\22"+
    "\17\0\1\22\4\0\21\22\2\0\1\22\1\123\16\22"+
    "\17\0\1\22\4\0\13\22\1\124\5\22\2\0\20\22"+
    "\17\0\1\22\4\0\10\22\1\125\10\22\2\0\20\22"+
    "\17\0\1\22\4\0\21\22\2\0\14\22\1\126\3\22"+
    "\17\0\1\22\4\0\21\22\2\0\3\22\1\127\14\22"+
    "\17\0\1\22\4\0\21\22\2\0\10\22\1\130\7\22"+
    "\2\0\14\131\1\132\2\131\1\133\1\131\1\134\45\131"+
    "\15\0\1\22\4\0\13\22\1\135\5\22\2\0\20\22"+
    "\17\0\1\22\4\0\1\136\20\22\2\0\20\22\41\0"+
    "\1\137\44\0\1\22\4\0\4\22\1\140\14\22\2\0"+
    "\20\22\17\0\1\22\4\0\20\22\1\141\2\0\20\22"+
    "\17\0\1\22\4\0\21\22\2\0\10\22\1\142\7\22"+
    "\17\0\1\22\4\0\20\22\1\143\2\0\20\22\17\0"+
    "\1\22\4\0\13\22\1\144\5\22\2\0\20\22\17\0"+
    "\1\22\4\0\21\22\2\0\3\22\1\145\14\22\17\0"+
    "\1\22\4\0\21\22\2\0\3\22\1\146\14\22\2\0"+
    "\14\131\1\132\2\131\1\133\47\131\14\50\1\74\2\50"+
    "\1\75\1\50\1\147\45\50\14\131\1\150\2\131\1\133"+
    "\47\131\14\151\1\152\52\151\13\0\1\153\1\0\1\22"+
    "\4\0\21\22\2\0\20\22\17\0\1\22\4\0\16\22"+
    "\1\154\2\22\2\0\20\22\42\0\1\155\43\0\1\22"+
    "\4\0\2\22\1\156\16\22\2\0\20\22\17\0\1\22"+
    "\4\0\21\22\2\0\3\22\1\157\14\22\17\0\1\22"+
    "\4\0\6\22\1\160\12\22\2\0\20\22\2\0\14\161"+
    "\1\162\52\161\14\131\1\132\2\131\1\133\1\131\1\163"+
    "\45\131\21\0\1\161\104\0\1\164\44\0\1\22\4\0"+
    "\4\22\1\165\14\22\2\0\20\22\40\0\1\166\45\0"+
    "\1\22\4\0\11\22\1\167\7\22\2\0\20\22\17\0"+
    "\1\22\4\0\21\22\2\0\14\22\1\170\3\22\23\0"+
    "\1\113\45\0\14\171\1\172\52\171\40\0\1\173\56\0"+
    "\1\174\53\0\1\22\4\0\1\175\20\22\2\0\20\22"+
    "\23\0\1\147\103\0\1\176\70\0\1\177\43\0\1\22"+
    "\4\0\16\22\1\200\2\22\2\0\20\22\32\0\1\201"+
    "\60\0\1\202\61\0\1\22\4\0\4\22\1\203\14\22"+
    "\2\0\20\22\42\0\1\204\62\0\1\205\54\0\1\206"+
    "\100\0\1\207\32\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5225];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\6\11\1\1\1\11\15\1\2\11"+
    "\5\1\2\11\1\0\2\1\1\0\1\11\1\0\4\11"+
    "\17\1\2\0\15\1\1\11\1\0\2\1\1\0\11\1"+
    "\3\0\3\1\1\0\10\1\4\0\1\1\1\0\3\1"+
    "\2\0\1\1\1\0\1\1\1\0\2\1\4\0\1\1"+
    "\2\0\1\1\2\0\1\1\1\0\1\11\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[135];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
final int MAX_STRING = 32;
final int MAX_INT = Short.MAX_VALUE;
final float MAX_FLOAT = Float.MAX_VALUE;


private boolean verify_real(String x){
	boolean flag = true;
    float f = Float.parseFloat(x);
	if(f< -MAX_FLOAT || f>MAX_FLOAT){
        System.out.println("Numero Real detectado invalido: "+yytext()+"\nDebe ser menor a "+Float.toString(MAX_FLOAT));
        flag = false;
	}
	return flag;
}

private boolean verify_int(String x){
	boolean flag = true;
    int f = Integer.parseInt(x);
	if(f< -MAX_INT || f>MAX_INT){
        System.out.println("Numero Integer detectado invalido: "+yytext()+"\nDebe ser menor a "+Integer.toString(MAX_INT));
        flag = false;
	}
	return flag;
}

private boolean verify_string(String x){
	boolean flag = true;
    if(x.length() > MAX_STRING){
        /*Debería tirar una excepcion o algo*/
        System.out.println("Cadena detectada invalida: "+yytext()+"\nSu longitud debe ser de 30 caracteres o menos");
        flag = false;
	}
	return flag;
}
    TablaSimbolos Tabla;
    JTextArea textoArea;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
    public Lexico(java.io.Reader in, JTextArea t, TablaSimbolos tabla) {
    	this.Tabla = tabla;
    	this.textoArea = t;
        this.zzReader = in;
      }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
              {
                return new Symbol(sym.EOF);
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { throw new Error("Caracter no permitido: <"+yytext()+"> en linea "+yyline);
            }
            // fall through
          case 42: break;
          case 2:
            { 
            }
            // fall through
          case 43: break;
          case 3:
            { textoArea.append("Token PARENTESIS_ABRIR encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.PARENTESIS_ABRIR, yytext());
            }
            // fall through
          case 44: break;
          case 4:
            { textoArea.append("Token PARENTESIS_CERRAR encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.PARENTESIS_CERRAR, yytext());
            }
            // fall through
          case 45: break;
          case 5:
            { textoArea.append("Token MULTIPLICAR encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.MULTIPLICAR, yytext());
            }
            // fall through
          case 46: break;
          case 6:
            { textoArea.append("Token SUMA encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.SUMA, yytext());
            }
            // fall through
          case 47: break;
          case 7:
            { textoArea.append("Token COMA encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.COMA, yytext());
            }
            // fall through
          case 48: break;
          case 8:
            { textoArea.append("Token RESTA encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.RESTA, yytext());
            }
            // fall through
          case 49: break;
          case 9:
            { textoArea.append("Token DIVISION encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.DIVISION, yytext());
            }
            // fall through
          case 50: break;
          case 10:
            { if (verify_int(yytext())){                    
                    TokenObject TO = new TokenObject();
                    TO.nombre = "_" + yytext();
                    TO.token = "CONST_INT";
                    TO.tipo = "";
                    TO.valor = yytext();
                    TO.longitud = 0;
                    textoArea.append("Token CONST_INT encontrado, Lexema "+ yytext()+"\n");
                    Tabla.guardarTokenObject(TO);
                    return new Symbol(sym.CONST_INT, yytext());
                    }
            }
            // fall through
          case 51: break;
          case 11:
            { textoArea.append("Token MENOR_QUE encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.MENOR_QUE, yytext());
            }
            // fall through
          case 52: break;
          case 12:
            { textoArea.append("Token MAYOR_QUE encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.MAYOR_QUE, yytext());
            }
            // fall through
          case 53: break;
          case 13:
            { TokenObject TO = new TokenObject();
                TO.nombre = yytext();
                TO.token = "ID";
                TO.tipo = "";
                TO.valor = "";
                TO.longitud = 0;
                textoArea.append("Token ID encontrado, Lexema "+ yytext()+"\n");
                Tabla.guardarTokenObject(TO);
                return new Symbol(sym.ID, yytext());
            }
            // fall through
          case 54: break;
          case 14:
            { textoArea.append("Token CORCHETE_ABRIR encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.CORCHETE_ABRIR, yytext());
            }
            // fall through
          case 55: break;
          case 15:
            { textoArea.append("Token CORCHETE_CERRAR encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.CORCHETE_CERRAR, yytext());
            }
            // fall through
          case 56: break;
          case 16:
            { textoArea.append("Token LLAVE_ABRIR encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.LLAVE_ABRIR, yytext());
            }
            // fall through
          case 57: break;
          case 17:
            { textoArea.append("Token LLAVE_CERRAR encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.LLAVE_CERRAR, yytext());
            }
            // fall through
          case 58: break;
          case 18:
            { if (verify_string(yytext())){
                    TokenObject TO = new TokenObject();
                    TO.nombre = "_" + yytext();
                    TO.token = "CONST_STRING";
                    TO.tipo = "";
				    TO.valor = yytext();
                    TO.longitud = Tabla.tamanoCadena(TO.valor);
                    textoArea.append("Token CONST_STRING encontrado, Lexema "+ yytext()+"\n");
                    Tabla.guardarTokenObject(TO);
                    return new Symbol(sym.CONST_STRING, yytext());
                    }
            }
            // fall through
          case 59: break;
          case 19:
            { if (verify_real(yytext())){
                    TokenObject TO = new TokenObject();
                    TO.nombre = "_" + yytext();
                    TO.token = "CONST_REAL";
                    TO.tipo = "";
                    TO.valor = yytext();
                    TO.longitud = 0;
                    textoArea.append("Token CONST_REAL encontrado, Lexema "+ yytext()+"\n");
                    Tabla.guardarTokenObject(TO);
                    return new Symbol(sym.CONST_REAL, yytext());
                    }
            }
            // fall through
          case 60: break;
          case 20:
            { textoArea.append("Token ASIGN encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.ASIGN, yytext());
            }
            // fall through
          case 61: break;
          case 21:
            { textoArea.append("Token MENOR_IGUAL_QUE encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.MENOR_IGUAL_QUE, yytext());
            }
            // fall through
          case 62: break;
          case 22:
            { textoArea.append("Token DISTINTO encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.DISTINTO, yytext());
            }
            // fall through
          case 63: break;
          case 23:
            { textoArea.append("Token COMPARAR encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.COMPARAR, yytext());
            }
            // fall through
          case 64: break;
          case 24:
            { textoArea.append("Token MAYOR_IGUAL_QUE encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.MAYOR_IGUAL_QUE, yytext());
            }
            // fall through
          case 65: break;
          case 25:
            { textoArea.append("Token IF encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.IF, yytext());
            }
            // fall through
          case 66: break;
          case 26:
            { textoArea.append("Token OR encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.OR, yytext());
            }
            // fall through
          case 67: break;
          case 27:
            { textoArea.append("Token INT encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.INT, yytext());
            }
            // fall through
          case 68: break;
          case 28:
            { textoArea.append("Token AND encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.AND, yytext());
            }
            // fall through
          case 69: break;
          case 29:
            { /**/
            }
            // fall through
          case 70: break;
          case 30:
            { textoArea.append("Token ELSE encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.ELSE, yytext());
            }
            // fall through
          case 71: break;
          case 31:
            { textoArea.append("Token TRUE encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.TRUE, yytext());
            }
            // fall through
          case 72: break;
          case 32:
            { textoArea.append("Token FLOAT encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.FLOAT, yytext());
            }
            // fall through
          case 73: break;
          case 33:
            { textoArea.append("Token PRINT encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.PRINT, yytext());
            }
            // fall through
          case 74: break;
          case 34:
            { textoArea.append("Token FALSE encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.FALSE, yytext());
            }
            // fall through
          case 75: break;
          case 35:
            { textoArea.append("Token WHILE encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.WHILE, yytext());
            }
            // fall through
          case 76: break;
          case 36:
            { textoArea.append("Token STRING encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.STRING, yytext());
            }
            // fall through
          case 77: break;
          case 37:
            { textoArea.append("Token DECLARE encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.DECLARE, yytext());
            }
            // fall through
          case 78: break;
          case 38:
            { textoArea.append("Token IGUALES_FUNC encontrado, Lexema "+ yytext()+"\n");
            return new Symbol(sym.IGUALES_FUNC, yytext());
            }
            // fall through
          case 79: break;
          case 39:
            { textoArea.append("Token END_DECLARE encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.END_DECLARE, yytext());
            }
            // fall through
          case 80: break;
          case 40:
            { textoArea.append("Token END_PROGRAM encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.END_PROGRAM, yytext());
            }
            // fall through
          case 81: break;
          case 41:
            { textoArea.append("Token BEGIN_PROGRAM encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.BEGIN_PROGRAM, yytext());
            }
            // fall through
          case 82: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
