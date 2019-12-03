import java.util.regex.Pattern; 
  
class regex 
{ 
 public static boolean Identifier(String input) {
  char init = input.charAt(0);
  if((init >= 'a' && init <= 'z') || (init >= 'A' && init <= 'Z')) {
   for(int i=1; i<input.length(); i++) {
    char temp = input.charAt(i);
    if(!((init >= 'a' && init <= 'z') || (init >= 'A' && init <= 'Z') || (init >= '0' && init <= '9')))
    return false;
   }
  }
  else
   return false;
  return true;
 }

 public static boolean Arithmetic(String input) {
  for(int i=0; i<input.length(); i++) {
   for(int j=i+1; j<input.length(); j++) {
   if(input.substring(i,j).equals("+") || input.substring(i,j).equals("-") || input.substring(i,j).equals("*") || input.substring(i,j).equals("/") || input.substring(i,j).equals("%"))
    return true;
}
}
   return false;
  
 }
 public static boolean Logical(String input) {
  for(int i=0; i<input.length(); i++) {
   for(int j=i+1; j<input.length(); j++) {
   if(input.substring(i,j).equals("||") || input.substring(i,j).equals("&&") || input.substring(i,j).equals("==") || input.substring(i,j).equals("!"))
    return true;
}
}
  return false;
 }

 public static boolean Assignment(String input) {
  for(int i=0; i<input.length(); i++) {
   for(int j=i+1; j<input.length(); j++) {
   if(input.substring(i,j).equals("="))
    return true;
}
}
  return false;
 }
public static boolean LParanthesis(String input) {
  for(int i=0; i<input.length(); i++) {
   for(int j=i+1; j<input.length(); j++) {
   if(input.substring(i,j).equals("("))
    return true;
}
}
  return false;
 }
public static boolean RParanthesis(String input) {
  for(int i=0; i<input.length(); i++) {
   for(int j=i+1; j<input.length(); j++) {
   if(input.substring(i,j).equals(")"))
    return true;
}
}
  return false;
 }
public static boolean LCurly(String input) {
  for(int i=0; i<input.length(); i++) {
   for(int j=i+1; j<input.length(); j++) {
   if(input.substring(i,j).equals("{"))
    return true;
}
}
  return false;
 }
public static boolean RCurly(String input) {
  for(int i=0; i<input.length(); i++) {
   for(int j=i+1; j<input.length(); j++) {
   if(input.substring(i,j).equals("}"))
    return true;
}
}
  return false;
 }


 public static boolean Datatypes(String input) {
   for(int i=0; i<input.length(); i++) {
   for(int j=i+1; j<input.length(); j++) {
   if(input.substring(i,j).equals("int")||input.substring(i,j).equals("char") ||input.substring(i,j).equals("string") || input.substring(i,j).equals("float"))
    return true;
}
}
  return false;
 }

 public static boolean Keywords(String input) {
  for(int i=0; i<input.length(); i++) {
   for(int j=i+1; j<input.length(); j++) {
   if(input.substring(i,j).equals("var")||input.substring(i,j).equals("main") )
    return true;
}
}
  return false;
 }

 public static boolean Function(String input) {
  for(int i=0; i<input.length(); i++) {
   for(int j=i+1; j<input.length(); j++) {
   if(input.substring(i,j).equals("input")||input.substring(i,j).equals("output") )
    return true;
}
}
  return false;
 }

    public static void main(String args[]) 
    { 
        System.out.println (Pattern.matches("[a-zA-Z][a-zA-Z0-9]*","sakj1")); 
        System.out.println (Pattern.matches("[a-zA-Z0-9]*[-||/||*||+||%][a-zA-Z0-9]*","b+c")); 
 System.out.println (Pattern.matches("[a-zA-Z0-9]*[-||/||*||+||%][a-zA-Z0-9]*","b+c"));     
} 
}
