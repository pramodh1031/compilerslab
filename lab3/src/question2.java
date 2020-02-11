
public class question2 {

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
		
		if(token=='(' && Start())	
		{
			token=readNextToken();
			//System.out.println(token);
			//if(token=='$')		return false;
			if(token==')')		return true;
		}
		indx=sp;
		return true;		 
	}
	
	public static void main(String[] args) {
		s="( () () )";
		s+="$";
		
		if(Start())	System.out.println("AC");
		else		System.out.println("Not Correct");
	}
}