
public class question3 {

	static int indx=0;
	static String s;
	
	public static char readNextToken()
	{
		return s.charAt(indx++);
	}
	
	public static boolean Start()
	{
		System.out.println("Start");
		int sp=indx;
		char token=readNextToken();
		//System.out.println(token);
		//if(token=='$')		return false;
		
		if(token=='a')	
		{
			return true;
		}
		else if(token=='(' && L())
		{
			token=readNextToken();
			//System.out.println(token);
			//if(token=='$')		return false;
			if(token==')')		return true;
		}
		indx=sp;
		return false;		 
	}
	
	public static boolean L()
	{
		System.out.println("L");
		int sp=indx;
		if(Start() && L2() )	return true;
		indx=sp;
		return false;		
	}
	
	public static boolean L2()
	{
		System.out.println("L2");
		int sp=indx;
		char token=readNextToken();
		//System.out.println(token);
		//if(token=='$')	return false;
		if(token==',' && Start() && L2())	
		{
			return true;
		}
		indx=sp;
		return true;	
	}
	
	public static void main(String[] args) {
		s="((a,a),(a))";
		s+="$";
		
		if(Start())	System.out.println("AC");
		else		System.out.println("Not Correct");
			
	}

}
