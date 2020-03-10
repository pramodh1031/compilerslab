
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Mar 10 11:59:43 IST 2020
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Mar 10 11:59:43 IST 2020
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\010\002\000\002\005\005\000\002\002" +
    "\004\000\002\002\004\000\002\002\003\000\002\003\003" +
    "\000\002\003\003\000\002\003\003\000\002\003\003\000" +
    "\002\004\006\000\002\004\006\000\002\004\006\000\002" +
    "\006\010\000\002\006\010\000\002\006\010" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\042\000\016\004\004\007\013\010\014\012\012\015" +
    "\010\020\015\001\002\000\004\010\042\001\002\000\020" +
    "\004\ufffc\007\ufffc\010\ufffc\011\ufffc\012\ufffc\015\ufffc\020" +
    "\ufffc\001\002\000\020\004\ufffb\007\ufffb\010\ufffb\011\ufffb" +
    "\012\ufffb\015\ufffb\020\ufffb\001\002\000\020\004\ufffd\007" +
    "\ufffd\010\ufffd\011\ufffd\012\ufffd\015\ufffd\020\ufffd\001\002" +
    "\000\004\010\037\001\002\000\020\004\004\007\013\010" +
    "\014\011\001\012\012\015\010\020\015\001\002\000\020" +
    "\004\ufff9\007\ufff9\010\ufff9\011\ufff9\012\ufff9\015\ufff9\020" +
    "\ufff9\001\002\000\004\010\023\001\002\000\020\004\ufffa" +
    "\007\ufffa\010\ufffa\011\ufffa\012\ufffa\015\ufffa\020\ufffa\001" +
    "\002\000\004\010\020\001\002\000\004\002\017\001\002" +
    "\000\004\002\uffff\001\002\000\004\007\021\001\002\000" +
    "\004\022\022\001\002\000\020\004\ufff7\007\ufff7\010\ufff7" +
    "\011\ufff7\012\ufff7\015\ufff7\020\ufff7\001\002\000\004\013" +
    "\024\001\002\000\004\010\025\001\002\000\010\023\026" +
    "\024\030\025\027\001\002\000\004\022\033\001\002\000" +
    "\004\022\032\001\002\000\004\022\031\001\002\000\020" +
    "\004\ufff4\007\ufff4\010\ufff4\011\ufff4\012\ufff4\015\ufff4\020" +
    "\ufff4\001\002\000\020\004\ufff3\007\ufff3\010\ufff3\011\ufff3" +
    "\012\ufff3\015\ufff3\020\ufff3\001\002\000\020\004\ufff5\007" +
    "\ufff5\010\ufff5\011\ufff5\012\ufff5\015\ufff5\020\ufff5\001\002" +
    "\000\020\004\ufffe\007\ufffe\010\ufffe\011\ufffe\012\ufffe\015" +
    "\ufffe\020\ufffe\001\002\000\004\011\036\001\002\000\004" +
    "\002\000\001\002\000\004\007\040\001\002\000\004\022" +
    "\041\001\002\000\020\004\ufff6\007\ufff6\010\ufff6\011\ufff6" +
    "\012\ufff6\015\ufff6\020\ufff6\001\002\000\004\007\043\001" +
    "\002\000\004\022\044\001\002\000\020\004\ufff8\007\ufff8" +
    "\010\ufff8\011\ufff8\012\ufff8\015\ufff8\020\ufff8\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\042\000\014\002\010\003\006\004\004\005\015\006" +
    "\005\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\012\003" +
    "\033\004\004\006\005\010\034\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 2;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
 
    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return getScanner().next_token(); 
    }
}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {

 Map<String,String> hash = new HashMap<String,String>(); 
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // val ::= ID SPACE EQ SPACE ST SEMI 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
						if(hash.get(e)==null)
						{
						System.out.println("ID is not declared, Please declare before using variable");
						}
						else if(hash.get(e)!="STR")
						{
						System.out.println(e+" is not declared as STR");
						}
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("val",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // val ::= ID SPACE EQ SPACE FL SEMI 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
						if(hash.get(e)==null)
						{
						System.out.println("ID is not declared, Please declare before using variable");
						}
						else if(hash.get(e)!="FLOAT")
						{
						System.out.println(e+" is not declared as FLOAT");
						}
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("val",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // val ::= ID SPACE EQ SPACE NUM SEMI 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
						if(hash.get(e)==null)
						{
						System.out.println("ID is not declared, Please declare before using variable");
						}
						else if(hash.get(e)!="INT")
						{
						System.out.println(e+" is not declared as INT");
						}
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("val",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // decln ::= STR SPACE ID SEMI 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
					if(hash.get(e)==null)
						{
						System.out.println("Valid Declaration, Adding STR to HashMap with " + e);
						hash.put(e.toString(),"STR");
						}
					else{
						System.out.println("Error : Dupicate Declaration " + e + ", Declaration is not considered");					
						}
					  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decln",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // decln ::= FLOAT SPACE ID SEMI 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
					if(hash.get(e)==null)
						{
						System.out.println("Valid Declaration, Adding FLOAT to HashMap with " + e);
						hash.put(e.toString(),"FLOAT");
						}
					else{
						System.out.println("Error : Dupicate Declaration " + e + ", Declaration is not considered");					
						}
					  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decln",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // decln ::= INT SPACE ID SEMI 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
					if(hash.get(e)==null)
						{
						System.out.println("Valid Declaration, Adding INT to HashMap with " + e);
						hash.put(e.toString(),"INT");
						}
					else{
						System.out.println("Error : Dupicate Declaration " + e + ", Declaration is not considered");					
						}
					  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decln",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // stmt ::= NL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // stmt ::= SPACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // stmt ::= val 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // stmt ::= decln 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // prog ::= stmt 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("prog",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // prog ::= prog stmt 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("prog",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // $START ::= s EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // s ::= prog NT$0 EOFILE 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		System.exit(0);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("s",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // NT$0 ::= 
            {
              Object RESULT =null;
 System.out.println("Completed Parsing");System.exit(0); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
