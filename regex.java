package lab2;

import java.util.*;
public class Main {
public static void main(String[] args)
{
String S = new String();
Scanner t = new Scanner (System.in);
S = t.nextLine();
String[] w = S.split(" ");
for(int i=0;i<w.length;i++) {
System.out.print(w[i] + " ");
if(w[i].matches("main") || w[i].matches("var") ) {
System.out.println("Keyword");
}
else if(w[i].matches("[{]")){
System.out.println(" Left curly braces");
}
else if(w[i].matches("[}]")){
System.out.println(" Right curly braces");
}
else if(w[i].matches("integer") || w[i].matches ("char") || w[i].matches ("string") || w[i].matches ("float") ) {
System.out.println("Datatypers");
}
else if(w[i].matches ("[(]")){
System.out.println(" Left paranthesis");
}
else if(w[i].matches ("[)]")){
System.out.println(" Right paranthesis");
}
else if(w[i].matches("[+]") || w[i].matches ("[-]") || w[i].matches ("[*]") || w[i].matches ("[/]")  || w[i].matches("[%]")) {
System.out.println(" Arithmetic operators ");
}
else if(w[i].matches("[||]") || w[i].matches ("[&&]") || w[i].matches ("[!==]") ) {
System.out.println("Logical operators ");
}
else if(w[i].matches ("[=]")){
System.out.println(" Assignment operator");
}
else if(w[i].matches("input") ) {
System.out.println("input function ");
}
else if(w[i].matches("output") ) {
System.out.println("output function ");
}
else {
String R = new String();
R=w[i];
if(R.matches("[a-zA-Z][a-zA-Z0-9]*")) {
System.out.println("Identifiers");
}

}
}
}  
}
