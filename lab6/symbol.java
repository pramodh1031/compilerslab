import java_cup.runtime.Symbol;
import java_cup.runtime.Scanner;


class Yylex implements java_cup.runtime.Scanner {
	private final int YY_BUFFER_SIZE = 512;
	private final int YY_F = -1;
	private final int YY_NO_STATE = -1;
	private final int YY_NOT_ACCEPT = 0;
	private final int YY_START = 1;
	private final int YY_END = 2;
	private final int YY_NO_ANCHOR = 4;
	private final int YY_BOL = 128;
	private final int YY_EOF = 129;
	private java.io.BufferedReader yy_reader;
	private int yy_buffer_index;
	private int yy_buffer_read;
	private int yy_buffer_start;
	private int yy_buffer_end;
	private char yy_buffer[];
	private boolean yy_at_bol;
	private int yy_lexical_state;

	Yylex (java.io.Reader reader) {
		this ();
		if (null == reader) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(reader);
	}

	Yylex (java.io.InputStream instream) {
		this ();
		if (null == instream) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(new java.io.InputStreamReader(instream));
	}

	private Yylex () {
		yy_buffer = new char[YY_BUFFER_SIZE];
		yy_buffer_read = 0;
		yy_buffer_index = 0;
		yy_buffer_start = 0;
		yy_buffer_end = 0;
		yy_at_bol = true;
		yy_lexical_state = YYINITIAL;
	}

	private boolean yy_eof_done = false;
	private final int YYINITIAL = 0;
	private final int yy_state_dtrans[] = {
		0
	};
	private void yybegin (int state) {
		yy_lexical_state = state;
	}
	private int yy_advance ()
		throws java.io.IOException {
		int next_read;
		int i;
		int j;

		if (yy_buffer_index < yy_buffer_read) {
			return yy_buffer[yy_buffer_index++];
		}

		if (0 != yy_buffer_start) {
			i = yy_buffer_start;
			j = 0;
			while (i < yy_buffer_read) {
				yy_buffer[j] = yy_buffer[i];
				++i;
				++j;
			}
			yy_buffer_end = yy_buffer_end - yy_buffer_start;
			yy_buffer_start = 0;
			yy_buffer_read = j;
			yy_buffer_index = j;
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}

		while (yy_buffer_index >= yy_buffer_read) {
			if (yy_buffer_index >= yy_buffer.length) {
				yy_buffer = yy_double(yy_buffer);
			}
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}
		return yy_buffer[yy_buffer_index++];
	}
	private void yy_move_end () {
		if (yy_buffer_end > yy_buffer_start &&
		    '\n' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
		if (yy_buffer_end > yy_buffer_start &&
		    '\r' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
	}
	private boolean yy_last_was_cr=false;
	private void yy_mark_start () {
		yy_buffer_start = yy_buffer_index;
	}
	private void yy_mark_end () {
		yy_buffer_end = yy_buffer_index;
	}
	private void yy_to_mark () {
		yy_buffer_index = yy_buffer_end;
		yy_at_bol = (yy_buffer_end > yy_buffer_start) &&
		            ('\r' == yy_buffer[yy_buffer_end-1] ||
		             '\n' == yy_buffer[yy_buffer_end-1] ||
		             2028/*LS*/ == yy_buffer[yy_buffer_end-1] ||
		             2029/*PS*/ == yy_buffer[yy_buffer_end-1]);
	}
	private java.lang.String yytext () {
		return (new java.lang.String(yy_buffer,
			yy_buffer_start,
			yy_buffer_end - yy_buffer_start));
	}
	private int yylength () {
		return yy_buffer_end - yy_buffer_start;
	}
	private char[] yy_double (char buf[]) {
		int i;
		char newbuf[];
		newbuf = new char[2*buf.length];
		for (i = 0; i < buf.length; ++i) {
			newbuf[i] = buf[i];
		}
		return newbuf;
	}
	private final int YY_E_INTERNAL = 0;
	private final int YY_E_MATCH = 1;
	private java.lang.String yy_error_string[] = {
		"Error: Internal error.\n",
		"Error: Unmatched input.\n"
	};
	private void yy_error (int code,boolean fatal) {
		java.lang.System.out.print(yy_error_string[code]);
		java.lang.System.out.flush();
		if (fatal) {
			throw new Error("Fatal Error.\n");
		}
	}
	private int[][] unpackFromString(int size1, int size2, String st) {
		int colonIndex = -1;
		String lengthString;
		int sequenceLength = 0;
		int sequenceInteger = 0;

		int commaIndex;
		String workString;

		int res[][] = new int[size1][size2];
		for (int i= 0; i < size1; i++) {
			for (int j= 0; j < size2; j++) {
				if (sequenceLength != 0) {
					res[i][j] = sequenceInteger;
					sequenceLength--;
					continue;
				}
				commaIndex = st.indexOf(',');
				workString = (commaIndex==-1) ? st :
					st.substring(0, commaIndex);
				st = st.substring(commaIndex+1);
				colonIndex = workString.indexOf(':');
				if (colonIndex == -1) {
					res[i][j]=Integer.parseInt(workString);
					continue;
				}
				lengthString =
					workString.substring(colonIndex+1);
				sequenceLength=Integer.parseInt(lengthString);
				workString=workString.substring(0,colonIndex);
				sequenceInteger=Integer.parseInt(workString);
				res[i][j] = sequenceInteger;
				sequenceLength--;
			}
		}
		return res;
	}
	private int yy_acpt[] = {
		/* 0 */ YY_NOT_ACCEPT,
		/* 1 */ YY_NO_ANCHOR,
		/* 2 */ YY_NO_ANCHOR,
		/* 3 */ YY_NO_ANCHOR,
		/* 4 */ YY_NO_ANCHOR,
		/* 5 */ YY_NO_ANCHOR,
		/* 6 */ YY_NO_ANCHOR,
		/* 7 */ YY_NO_ANCHOR,
		/* 8 */ YY_NO_ANCHOR,
		/* 9 */ YY_NO_ANCHOR,
		/* 10 */ YY_NO_ANCHOR,
		/* 11 */ YY_NO_ANCHOR,
		/* 12 */ YY_NO_ANCHOR,
		/* 13 */ YY_NO_ANCHOR,
		/* 14 */ YY_NOT_ACCEPT,
		/* 15 */ YY_NO_ANCHOR,
		/* 16 */ YY_NOT_ACCEPT,
		/* 17 */ YY_NO_ANCHOR,
		/* 18 */ YY_NOT_ACCEPT,
		/* 19 */ YY_NO_ANCHOR,
		/* 20 */ YY_NO_ANCHOR,
		/* 21 */ YY_NO_ANCHOR,
		/* 22 */ YY_NO_ANCHOR,
		/* 23 */ YY_NO_ANCHOR,
		/* 24 */ YY_NO_ANCHOR,
		/* 25 */ YY_NO_ANCHOR,
		/* 26 */ YY_NO_ANCHOR,
		/* 27 */ YY_NO_ANCHOR
	};
	private int yy_cmap[] = unpackFromString(1,130,
"0:10,1,0:21,5,0,20,0:9,3,0,17,0,16:10,0,2,0,4,0:3,19:26,0:6,12,18:4,9,15,18" +
",6,18:2,10,18,7,11,18:2,14,13,8,18:6,0:5,21:2")[0];

	private int yy_rmap[] = unpackFromString(1,28,
"0,1:5,2,3,1,4,5,1,4:2,6,7,5,8,9,10,11,12,13,14,15,4,16,17")[0];

	private int yy_nxt[][] = unpackFromString(18,22,
"-1,1,2,3,4,5,6,25:2,26,25:3,27,25:2,7,-1,25,-1,14,8,-1:28,25,15,25:9,-1,25:" +
"2,-1:18,7,16,-1:10,25:11,-1,25:2,-1:18,10,-1:11,18:10,-1:2,18,-1:9,25:2,9,2" +
"5:8,-1,25:2,-1:8,25:5,20,25:5,-1,25:2,-1:8,18:11,-1,18:2,11,-1:7,25:8,21,25" +
":2,-1,25:2,-1:8,25:6,22,25:4,-1,25:2,-1:8,23,25:10,-1,25:2,-1:8,25:2,12,25:" +
"8,-1,25:2,-1:8,25,24,25:9,-1,25:2,-1:8,25:9,13,25,-1,25:2,-1:8,25:4,17,25:6" +
",-1,25:2,-1:8,25:2,19,25:8,-1,25:2,-1:2");

	public java_cup.runtime.Symbol next_token ()
		throws java.io.IOException {
		int yy_lookahead;
		int yy_anchor = YY_NO_ANCHOR;
		int yy_state = yy_state_dtrans[yy_lexical_state];
		int yy_next_state = YY_NO_STATE;
		int yy_last_accept_state = YY_NO_STATE;
		boolean yy_initial = true;
		int yy_this_accept;

		yy_mark_start();
		yy_this_accept = yy_acpt[yy_state];
		if (YY_NOT_ACCEPT != yy_this_accept) {
			yy_last_accept_state = yy_state;
			yy_mark_end();
		}
		while (true) {
			if (yy_initial && yy_at_bol) yy_lookahead = YY_BOL;
			else yy_lookahead = yy_advance();
			yy_next_state = YY_F;
			yy_next_state = yy_nxt[yy_rmap[yy_state]][yy_cmap[yy_lookahead]];
			if (YY_EOF == yy_lookahead && true == yy_initial) {

return new Symbol(sym.EOFILE);
			}
			if (YY_F != yy_next_state) {
				yy_state = yy_next_state;
				yy_initial = false;
				yy_this_accept = yy_acpt[yy_state];
				if (YY_NOT_ACCEPT != yy_this_accept) {
					yy_last_accept_state = yy_state;
					yy_mark_end();
				}
			}
			else {
				if (YY_NO_STATE == yy_last_accept_state) {
					throw (new Error("Lexical Error: Unmatched Input."));
				}
				else {
					yy_anchor = yy_acpt[yy_last_accept_state];
					if (0 != (YY_END & yy_anchor)) {
						yy_move_end();
					}
					yy_to_mark();
					switch (yy_last_accept_state) {
					case 1:
						{System.out.println("NL");return new Symbol(sym.NL);}
					case -2:
						break;
					case 2:
						{System.out.println("SEMI: "+yytext());return new Symbol(sym.SEMI);}
					case -3:
						break;
					case 3:
						{System.out.println("COMMA: "+yytext());return new Symbol(sym.COMMA);}
					case -4:
						break;
					case 4:
						{System.out.println("EQ: "+yytext());return new Symbol(sym.EQ);}
					case -5:
						break;
					case 5:
						{System.out.println("SPACE: "+yytext());return new Symbol(sym.SPACE);}
					case -6:
						break;
					case 6:
						{System.out.println("ID: "+yytext());return new Symbol(sym.ID, new String(yytext()));}
					case -7:
						break;
					case 7:
						{System.out.println("NUM: "+yytext());return new Symbol(sym.NUM ,new Integer(yytext()));}
					case -8:
						break;
					case 8:
						
					case -9:
						break;
					case 9:
						{System.out.println("INT: "+yytext());return new Symbol(sym.INT);}
					case -10:
						break;
					case 10:
						{System.out.println("FL: "+yytext());return new Symbol(sym.FL ,new Float(yytext()));}
					case -11:
						break;
					case 11:
						{System.out.println("ST: "+yytext());return new Symbol(sym.ST, new String(yytext()));}
					case -12:
						break;
					case 12:
						{System.out.println("FLOAT: "+yytext());return new Symbol(sym.FLOAT);}
					case -13:
						break;
					case 13:
						{System.out.println("STR: "+yytext());return new Symbol(sym.STR);}
					case -14:
						break;
					case 15:
						{System.out.println("ID: "+yytext());return new Symbol(sym.ID, new String(yytext()));}
					case -15:
						break;
					case 17:
						{System.out.println("ID: "+yytext());return new Symbol(sym.ID, new String(yytext()));}
					case -16:
						break;
					case 19:
						{System.out.println("ID: "+yytext());return new Symbol(sym.ID, new String(yytext()));}
					case -17:
						break;
					case 20:
						{System.out.println("ID: "+yytext());return new Symbol(sym.ID, new String(yytext()));}
					case -18:
						break;
					case 21:
						{System.out.println("ID: "+yytext());return new Symbol(sym.ID, new String(yytext()));}
					case -19:
						break;
					case 22:
						{System.out.println("ID: "+yytext());return new Symbol(sym.ID, new String(yytext()));}
					case -20:
						break;
					case 23:
						{System.out.println("ID: "+yytext());return new Symbol(sym.ID, new String(yytext()));}
					case -21:
						break;
					case 24:
						{System.out.println("ID: "+yytext());return new Symbol(sym.ID, new String(yytext()));}
					case -22:
						break;
					case 25:
						{System.out.println("ID: "+yytext());return new Symbol(sym.ID, new String(yytext()));}
					case -23:
						break;
					case 26:
						{System.out.println("ID: "+yytext());return new Symbol(sym.ID, new String(yytext()));}
					case -24:
						break;
					case 27:
						{System.out.println("ID: "+yytext());return new Symbol(sym.ID, new String(yytext()));}
					case -25:
						break;
					default:
						yy_error(YY_E_INTERNAL,false);
					case -1:
					}
					yy_initial = true;
					yy_state = yy_state_dtrans[yy_lexical_state];
					yy_next_state = YY_NO_STATE;
					yy_last_accept_state = YY_NO_STATE;
					yy_mark_start();
					yy_this_accept = yy_acpt[yy_state];
					if (YY_NOT_ACCEPT != yy_this_accept) {
						yy_last_accept_state = yy_state;
						yy_mark_end();
					}
				}
			}
		}
	}
}
