package examples.userdefinedexception;

public class ExceptionDemo 
{   

	
	public static void main(String[] args)
	{
		int i,j;
		i=8;
		j=9;
		
		try
		{
			int k = i/j;//k becomes 0
			
			if(k == 0)
				throw new MyException("this is not possible");
			
			System.out.println(k);
		}
		catch(MyException e)
		{
			System.out.println("Error " + e.getMessage());
		}
		
	}
}
