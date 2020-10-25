// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: C:/Users/Sebas/Desktop/Lexico.flex

import java_cup.runtime.Symbol;


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
    "\1\0\1\u0100\36\u0200\1\u0300\336\u0200\1\u0400\u1000\u0200";

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
    "\11\0\2\1\2\0\1\1\22\0\1\1\5\0\1\2"+
    "\1\0\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\12\13\1\14\1\15\1\16\1\17\1\20\2\0"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\2\32\1\33\1\34\1\35\1\36\1\37\1\32"+
    "\1\40\1\41\1\42\1\43\1\32\1\44\3\32\1\45"+
    "\1\0\1\46\1\0\1\47\1\0\32\32\1\50\1\51"+
    "\1\52\43\0\1\32\7\0\1\32\3\0\1\32\5\0"+
    "\1\32\6\0\1\32\10\0\1\32\235\0\1\32\u01ba\0"+
    "\1\32\23\0\1\32\u01cc\0\1\32\2\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1280];
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
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\1\1\15\1\16"+
    "\1\17\1\20\11\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\0\1\27\1\0\1\30\1\0\1\31\1\32\1\33"+
    "\5\21\1\34\4\21\3\0\3\21\1\35\2\21\1\36"+
    "\2\21\2\0\1\37\1\21\1\40\1\21\1\0\5\21"+
    "\2\0\2\21\1\0\1\21\1\41\1\21\1\42\1\21"+
    "\3\0\1\21\1\0\2\21\1\43\1\0\1\44\1\0"+
    "\1\45\1\0\1\21\1\46\3\0\1\21\3\0\1\21"+
    "\3\0\1\47\2\0\1\35\3\0\1\50\3\0\1\51";

  private static int [] zzUnpackAction() {
    int [] result = new int[122];
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
    "\0\0\0\53\0\126\0\53\0\53\0\53\0\53\0\53"+
    "\0\53\0\201\0\254\0\53\0\327\0\u0102\0\53\0\u012d"+
    "\0\u0158\0\u0183\0\u01ae\0\u01d9\0\u0204\0\u022f\0\u025a\0\u0285"+
    "\0\u02b0\0\u02db\0\u0306\0\53\0\53\0\u0331\0\53\0\53"+
    "\0\u035c\0\254\0\254\0\53\0\u0387\0\53\0\53\0\53"+
    "\0\u03b2\0\u03dd\0\u0408\0\u0433\0\u045e\0\u01ae\0\u0489\0\u04b4"+
    "\0\u04df\0\u050a\0\u0535\0\u0560\0\u058b\0\u05b6\0\u05e1\0\u060c"+
    "\0\u0637\0\u0662\0\u068d\0\u01ae\0\u06b8\0\u06e3\0\u070e\0\u0739"+
    "\0\53\0\u0764\0\u01ae\0\u078f\0\u07ba\0\u07e5\0\u0810\0\u083b"+
    "\0\u0866\0\u0891\0\u08bc\0\u08e7\0\u0912\0\u093d\0\u0968\0\u0993"+
    "\0\u01ae\0\u09be\0\u01ae\0\u09e9\0\u0a14\0\u0a3f\0\u0a6a\0\u0a95"+
    "\0\u0ac0\0\u0aeb\0\u0b16\0\u01ae\0\u0b41\0\53\0\u0b6c\0\u01ae"+
    "\0\u0b97\0\u0bc2\0\u01ae\0\u0bed\0\u0c18\0\u0c43\0\u0c6e\0\u0c99"+
    "\0\u0cc4\0\u0cef\0\u0d1a\0\u0d45\0\u0d70\0\u0d9b\0\u01ae\0\u0dc6"+
    "\0\u0df1\0\53\0\u0e1c\0\u0e47\0\u0e72\0\53\0\u0e9d\0\u0ec8"+
    "\0\u0ef3\0\53";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[122];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\2\23"+
    "\1\31\5\23\1\32\1\23\1\33\3\23\1\34\1\35"+
    "\1\2\1\36\1\37\1\40\54\0\1\3\120\0\1\41"+
    "\16\0\1\42\50\0\1\43\1\0\1\15\56\0\1\44"+
    "\45\0\1\45\4\0\1\46\52\0\1\47\52\0\1\50"+
    "\46\0\1\23\5\0\24\23\2\0\1\23\16\0\1\23"+
    "\5\0\4\23\1\51\17\23\2\0\1\23\16\0\1\23"+
    "\5\0\7\23\1\52\14\23\2\0\1\23\16\0\1\23"+
    "\5\0\4\23\1\53\17\23\2\0\1\23\16\0\1\23"+
    "\5\0\14\23\1\54\7\23\2\0\1\23\16\0\1\23"+
    "\5\0\12\23\1\55\11\23\2\0\1\23\16\0\1\23"+
    "\5\0\5\23\1\56\1\57\5\23\1\60\7\23\2\0"+
    "\1\23\16\0\1\23\5\0\17\23\1\61\4\23\2\0"+
    "\1\23\16\0\1\23\5\0\21\23\1\62\2\23\2\0"+
    "\1\23\27\0\1\63\72\0\1\64\6\0\12\45\1\65"+
    "\40\45\13\0\1\23\5\0\6\23\1\66\15\23\2\0"+
    "\1\23\16\0\1\23\5\0\1\67\23\23\2\0\1\23"+
    "\16\0\1\23\5\0\2\23\1\70\21\23\2\0\1\23"+
    "\16\0\1\23\5\0\3\23\1\71\20\23\2\0\1\23"+
    "\16\0\1\23\5\0\15\23\1\72\6\23\2\0\1\23"+
    "\16\0\1\23\5\0\22\23\1\73\1\23\2\0\1\23"+
    "\16\0\1\23\5\0\21\23\1\74\2\23\2\0\1\23"+
    "\16\0\1\23\5\0\10\23\1\75\13\23\2\0\1\23"+
    "\16\0\1\23\5\0\17\23\1\76\4\23\2\0\1\23"+
    "\34\0\1\77\51\0\1\100\22\0\12\45\1\65\5\45"+
    "\1\101\32\45\13\0\1\23\5\0\10\23\1\102\13\23"+
    "\2\0\1\23\16\0\1\23\5\0\17\23\1\103\4\23"+
    "\2\0\1\23\16\0\1\23\5\0\12\23\1\104\11\23"+
    "\2\0\1\23\14\0\1\105\1\0\1\23\5\0\3\23"+
    "\1\106\20\23\2\0\1\23\16\0\1\23\5\0\1\107"+
    "\23\23\2\0\1\23\16\0\1\23\5\0\1\110\23\23"+
    "\2\0\1\23\16\0\1\23\5\0\14\23\1\111\7\23"+
    "\2\0\1\23\16\0\1\23\5\0\10\23\1\112\13\23"+
    "\2\0\1\23\32\0\1\113\54\0\1\114\34\0\1\23"+
    "\5\0\14\23\1\115\7\23\2\0\1\23\16\0\1\23"+
    "\5\0\1\116\23\23\2\0\1\23\42\0\1\117\26\0"+
    "\1\23\5\0\4\23\1\120\17\23\2\0\1\23\16\0"+
    "\1\23\5\0\21\23\1\121\2\23\2\0\1\23\16\0"+
    "\1\23\5\0\12\23\1\122\11\23\2\0\1\23\16\0"+
    "\1\23\5\0\21\23\1\123\2\23\2\0\1\23\16\0"+
    "\1\23\5\0\14\23\1\124\7\23\2\0\1\23\34\0"+
    "\1\125\54\0\1\126\30\0\1\127\1\0\1\23\5\0"+
    "\24\23\2\0\1\23\16\0\1\23\5\0\17\23\1\130"+
    "\4\23\2\0\1\23\43\0\1\131\25\0\1\23\5\0"+
    "\2\23\1\132\21\23\2\0\1\23\16\0\1\23\5\0"+
    "\4\23\1\133\17\23\2\0\1\23\16\0\1\23\5\0"+
    "\6\23\1\134\15\23\2\0\1\23\45\0\1\135\35\0"+
    "\1\136\64\0\1\137\26\0\1\23\5\0\4\23\1\140"+
    "\17\23\2\0\1\23\41\0\1\141\27\0\1\23\5\0"+
    "\12\23\1\142\11\23\2\0\1\23\16\0\1\23\5\0"+
    "\20\23\1\143\3\23\2\0\1\23\41\0\1\144\54\0"+
    "\1\145\41\0\1\146\36\0\1\23\5\0\1\147\23\23"+
    "\2\0\1\23\54\0\1\150\37\0\1\151\54\0\1\152"+
    "\25\0\1\23\5\0\17\23\1\153\4\23\2\0\1\23"+
    "\40\0\1\154\44\0\1\155\44\0\1\156\44\0\1\23"+
    "\5\0\4\23\1\157\17\23\2\0\1\23\46\0\1\160"+
    "\47\0\1\161\46\0\1\162\52\0\1\163\37\0\1\164"+
    "\56\0\1\165\61\0\1\166\56\0\1\167\50\0\1\170"+
    "\66\0\1\171\5\0\1\172\45\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3870];
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
    "\1\0\1\11\1\1\6\11\2\1\1\11\2\1\1\11"+
    "\14\1\2\11\1\1\2\11\1\0\1\1\1\0\1\11"+
    "\1\0\3\11\12\1\3\0\11\1\2\0\1\11\3\1"+
    "\1\0\5\1\2\0\2\1\1\0\5\1\3\0\1\1"+
    "\1\0\3\1\1\0\1\11\1\0\1\1\1\0\2\1"+
    "\3\0\1\1\3\0\1\1\3\0\1\1\2\0\1\11"+
    "\3\0\1\11\3\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[122];
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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexico(java.io.Reader in) {
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
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { throw new Error("Caracter no permitido: <" + yytext() + "> en la linea " + yyline);
            }
            // fall through
          case 42: break;
          case 2:
            { 
            }
            // fall through
          case 43: break;
          case 3:
            { System.out.println("Token AND, encontrado Lexema "+ yytext());
            }
            // fall through
          case 44: break;
          case 4:
            { System.out.println("Token PARENTESIS_ABRIR, encontrado Lexema "+ yytext());
            }
            // fall through
          case 45: break;
          case 5:
            { System.out.println("Token PARENTESIS_CERRAR, encontrado Lexema "+ yytext());
            }
            // fall through
          case 46: break;
          case 6:
            { System.out.println("Token MULTIPLICAR, encontrado Lexema "+ yytext());
            }
            // fall through
          case 47: break;
          case 7:
            { System.out.println("Token SUMA, encontrado Lexema "+ yytext());
            }
            // fall through
          case 48: break;
          case 8:
            { System.out.println("Token COMA, encontrado Lexema "+ yytext());
            }
            // fall through
          case 49: break;
          case 9:
            { System.out.println("Token RESTA, encontrado Lexema "+ yytext());
            }
            // fall through
          case 50: break;
          case 10:
            { System.out.println("Token PUNTO, encontrado Lexema "+ yytext());
            }
            // fall through
          case 51: break;
          case 11:
            { System.out.println("Token DIVISION, encontrado Lexema "+ yytext());
            }
            // fall through
          case 52: break;
          case 12:
            { System.out.println("Token CONST_INT, encontrado Lexema "+ yytext());
            }
            // fall through
          case 53: break;
          case 13:
            { System.out.println("Token P_COMA, encontrado Lexema "+ yytext());
            }
            // fall through
          case 54: break;
          case 14:
            { System.out.println("Token MENOR_QUE encontrado, Lexema "+ yytext());
            }
            // fall through
          case 55: break;
          case 15:
            { System.out.println("Token IGUAL, encontrado Lexema "+ yytext());
            }
            // fall through
          case 56: break;
          case 16:
            { System.out.println("Token MAYOR_QUE encontrado, Lexema "+ yytext());
            }
            // fall through
          case 57: break;
          case 17:
            { System.out.println("Token ID encontrado, Lexema "+ yytext());
            }
            // fall through
          case 58: break;
          case 18:
            { System.out.println("Token CORCHETE_ABRIR, encontrado Lexema "+ yytext());
            }
            // fall through
          case 59: break;
          case 19:
            { System.out.println("Token CORCHETE_CERRAR, encontrado Lexema "+ yytext());
            }
            // fall through
          case 60: break;
          case 20:
            { System.out.println("Token LLAVE_ABRIR, encontrado Lexema "+ yytext());
            }
            // fall through
          case 61: break;
          case 21:
            { System.out.println("Token PIPE, encontrado Lexema "+ yytext());
            }
            // fall through
          case 62: break;
          case 22:
            { System.out.println("Token LLAVE_CERRAR, encontrado Lexema "+ yytext());
            }
            // fall through
          case 63: break;
          case 23:
            { System.out.println("Token CONST_REAL, encontrado Lexema "+ yytext());
            }
            // fall through
          case 64: break;
          case 24:
            { System.out.println("Token ASIGN encontrado, Lexema "+ yytext());
            }
            // fall through
          case 65: break;
          case 25:
            { System.out.println("Token MENOR_IGUAL_QUE encontrado, Lexema "+ yytext());
            }
            // fall through
          case 66: break;
          case 26:
            { System.out.println("Token COMPARAR, encontrado Lexema "+ yytext());
            }
            // fall through
          case 67: break;
          case 27:
            { System.out.println("Token MAYOR_IGUAL_QUE encontrado, Lexema "+ yytext());
            }
            // fall through
          case 68: break;
          case 28:
            { System.out.println("Token IF encontrado, Lexema "+ yytext());
            }
            // fall through
          case 69: break;
          case 29:
            { System.out.println("Token END, encontrado Lexema "+ yytext());
            }
            // fall through
          case 70: break;
          case 30:
            { System.out.println("Token INT, encontrado Lexema "+ yytext());
            }
            // fall through
          case 71: break;
          case 31:
            { /**/
            }
            // fall through
          case 72: break;
          case 32:
            { System.out.println("Token CHAR, encontrado Lexema "+ yytext());
            }
            // fall through
          case 73: break;
          case 33:
            { System.out.println("Token FLOAT, encontrado Lexema "+ yytext());
            }
            // fall through
          case 74: break;
          case 34:
            { System.out.println("Token PRINT encontrado, Lexema "+ yytext());
            }
            // fall through
          case 75: break;
          case 35:
            { System.out.println("Token STRING, encontrado Lexema "+ yytext());
            }
            // fall through
          case 76: break;
          case 36:
            { System.out.println("Token WHILE encontrado, Lexema "+ yytext());
            }
            // fall through
          case 77: break;
          case 37:
            { System.out.println("Token DECLARE encontrado, Lexema "+ yytext());
            }
            // fall through
          case 78: break;
          case 38:
            { System.out.println("Token FUNC_IGUALES, encontrado Lexema "+ yytext());
            }
            // fall through
          case 79: break;
          case 39:
            { System.out.println("Token ENDDECLARE encontrado, Lexema "+ yytext());
            }
            // fall through
          case 80: break;
          case 40:
            { System.out.println("Token BEGIN, encontrado Lexema "+ yytext());
            }
            // fall through
          case 81: break;
          case 41:
            { System.out.println("Token CONST_STRING, encontrado Lexema "+ yytext());
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
