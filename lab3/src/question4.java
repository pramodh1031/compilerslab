
public class question4 {

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
		char token;
		//if(token=='$')		return false;
		if( A() && B())
		{
			token=readNextToken();
			System.out.println(token);
			//if(token=='$')		return false;
			if(token=='a')		
			{
				token=readNextToken();
				System.out.println(token);
				//if(token=='$')		return false;
				if(token==',')		
				{
					return true;
				}
			}
		}
		indx=sp;
		return false;		 
	}
	
	public static boolean A()
	{
		System.out.println("A");
		int sp=indx;
		char token=readNextToken();
		System.out.println(token);
		if(token=='b')		
		{
			return true;
		}
		indx=sp;
		if(B() && B() )	return true;
		indx=sp;
		return false;		
	}
	
	public static boolean B()
	{
		System.out.println("B");
		int sp=indx;
		char token=readNextToken();
		System.out.println(token);
		//if(token=='$')	return false;
		if(token=='a')	
		{
			token=readNextToken();
			System.out.println(token);
			if(token=='b')		
			{
				return true;
			}
		}
		indx=sp;
		return false;	
	}
	
	public static void main(String[] args) {
		s="baba,";
		s+="$";
		
		if(Start())	System.out.println("AC");
		else		System.out.println("Not Correct");
			
	}

}
