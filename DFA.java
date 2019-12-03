import java.util.*;
public class DFA {
public static void main(String[] args) {
String s=new String();
Scanner d=new Scanner(System.in);
s=d.nextLine();
String[] ip=s.split(" ");
for(int i=0;i<ip.length;i++) {

int co=0;
for(int j=0;j<ip[i].length();j++) {
int te= (int) ip[i].charAt(j);
if(((te>=65&&te<=90)||(te>=97&&te<=122))&&j==0) {
co++;
}
else {
if(((te>=65&&te<=90)||(te>=97||te<=122)||(te>=48||te<=57))&&j>0) {
co++;
}
}

}
DFA w=new DFA();
if(ip[i].equals("main") || ip[i].equals("var")) {
w.keyword(ip[i]);
}else if(ip[i].equals("(")){
w.leftParenthesis(ip[i]);
}else if(ip[i].equals(")")) {
w.rightParenthesis(ip[i]);
}else if(ip[i].equals("{")) {
w.leftCurlyBraces(ip[i]);
}else if(ip[i].equals("}")) {
w.rightCurlyBraces(ip[i]);
}else if(ip[i].equals("=")) {
w.assighnmentOperator(ip[i]);
}else if(ip[i].equals("||") || ip[i].equals("&&") || ip[i].equals("!==")) {
w.LogicalOperator(ip[i]);
}else if(ip[i].equals("+") || ip[i].equals("-") || ip[i].equals("*") || ip[i].equals("/") || ip[i].equals("%")) {
w.arthemeticOperator(ip[i]);
}else if(ip[i].equals("integer") || ip[i].equals("char") || ip[i].equals("string") || ip[i].equals("float")) {
w.Datatype(ip[i]);
}else if(ip[i].equals("input")) {
w.input(ip[i]);
}else if(ip[i].equals("output")) {
w.output(ip[i]);
}else if(co==ip[i].length()) {
w.identifiers(ip[i]);
}
}
}
public void keyword(String s) {
System.out.print(s+" ");
System.out.println("Keywords");
}
public void leftParenthesis(String s) {
System.out.print(s+" ");
System.out.println("Left paranthesis");
}
public void rightParenthesis(String s) {
System.out.print(s+" ");
System.out.println("Right paranthesis");
}
public void leftCurlyBraces(String s) {
System.out.print(s+" ");
System.out.println("Left curly braces");
}
public void rightCurlyBraces(String s) {
System.out.print(s+" ");
System.out.println("Right curly braces");
}
public void assighnmentOperator(String s) {
System.out.print(s+" ");
System.out.println("Assignment operators");
}
public void LogicalOperator(String s) {
System.out.print(s+" ");
System.out.println("Logical operators");
}
public void arthemeticOperator(String s) {
System.out.print(s+" ");
System.out.println("Arthimetic operators");
}
public void Datatype(String s) {
System.out.print(s+" ");
System.out.println("datatypes");
}
public void input(String s) {
System.out.print(s+" ");
System.out.println("input function");
}
public void output(String s) {
System.out.print(s+" ");
System.out.println("output function");
}
public void identifiers(String s) {
System.out.print(s+" ");
System.out.println("Identifiers");
}

}

