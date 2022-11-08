import java.util.*;
class ThrowDemo
{
	public static void main(String args[])
	{
		System.out.println("Program Execution Started");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		try
		{
			if(a<0)
			{
				ArithmeticException ae = new ArithmeticException("ArithmeticException for negative value");//created exception obj
				throw ae;//ae local refernce variacle storing refernce of exception obj
			}
			else if(a>0)
			{
				ArrayIndexOutOfBoundsException ae = new ArrayIndexOutOfBoundsException ("ArrayIndexOutOfBoundsException for positive value");//created exception obj
				throw ae;//ae local refernce variacle storing refernce of exception obj
			}
			else
			{
				NullPointerException ae = new NullPointerException ("NullPointerException for zero");//created exception obj
				throw ae;//ae local refernce variacle storing refernce of exception obj
			}
		}
		catch(Exception e)//ae refernce is passed/returned to e & ae gets distroyed as local variable
		{
			System.out.print("Exception Caught here:  ");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("finally block");
		}
		
		System.out.println("Program executed successfully");
	}
}
