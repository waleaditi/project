package testPackage;

public class JavaException 
{  
	public static void exception()
	{  
		throw new ArithmeticException();
	}
	
	public static void main(String[] args)
	{
		
		String s="";
	int b=0;
	int c=0;
	int a=10;
	int a1[]= {1,2,3};
	try
	{  
		System.out.println(s.charAt(1));
		c=a/b;
		System.out.println(c);
		System.out.println("try end");
	}
	catch(Exception a2)
	{
		System.out.println("change value of b");
		System.err.println(a2.getStackTrace());
		System.err.println(a2.getMessage());
		System.out.println(a2.toString());
		
		try
		{
			System.out.println(a1[3]);
		}
		catch(ArrayIndexOutOfBoundsException x)
		{
			System.out.println("array exception handled");
		}
	}

	finally
	{
		System.out.println("code in finally");
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
