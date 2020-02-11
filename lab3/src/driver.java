
public class driver {

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
		
		if(token=='a' || token=='^')	
		{
			return true;
		}
		else if(token=='(' && T())
		{
			token=readNextToken();
			//System.out.println(token);
			//if(token=='$')		return false;
			if(token==')')		return true;
		}
		indx=sp;
		return false;		 
	}
	
	public static boolean T()
	{
		System.out.println("T");
		int sp=indx;
		if(Start() && T2() )	return true;
		indx=sp;
		return false;		
	}
	
	public static boolean T2()
	{
		System.out.println("T2");
		int sp=indx;
		char token=readNextToken();
		//System.out.println(token);
		//if(token=='$')	return false;
		if(token==',' && Start() && T2())	
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
