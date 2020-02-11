
public class question5 {

	static int indx=0;
	static String s;
	
	public static char readNextToken()
	{
		return s.charAt(indx++);
	}
	
	public static boolean E()
	{
		System.out.println("Start - E ");
		//System.out.println(token);
		//if(token=='$')		return false;
		
		if(T() && A())	
		{
			return true;
		}
		
		return false;		 
	}
	
	public static boolean T()
	{
		System.out.println("T");
		int sp=indx;
		if(F() && B() )	return true;
		indx=sp;
		return false;		
	}
	
	public static boolean A()
	{
		System.out.println("A");
		int sp=indx;
		char token=readNextToken();
		//System.out.println(token);
		//if(token=='$')	return false;
		if(token=='+' && T() && A())	
		{
			return true;
		}
		indx=sp;
		return true;	
	}
	
	public static boolean F()
	{
		System.out.println("A");
		int sp=indx;
		char token=readNextToken();
		//System.out.println(token);
		//if(token=='$')	return false;
		if(token=='+' && T() && A())	
		{
			return true;
		}
		indx=sp;
		return true;	
	}
	
	public static void main(String[] args) {
		s="((a,a),(a))";
		s+="$";
		
		if(E())	System.out.println("AC");
		else		System.out.println("Not Correct");
			
	}


}
