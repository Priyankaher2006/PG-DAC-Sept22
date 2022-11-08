import java.util.*;
class ReThrowDemo1
{
	public static void main(String args[])
	{
		System.out.println("Program started execution");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		try
		{
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
			catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e)
			{
				System.out.println("Arithmetic exception caught here : "+e.getMessage());
				throw e;		//rethrowing an exception to outside catch block e
			}
			finally
			{
				System.out.println("finally block inner");
			}
		}
		catch(Exception e)//ae refernce is passed/returned to e & ae gets distroyed as local variable
		{
			System.out.print("Exception Caught here:  ");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("finally block outer");
		}
		
		System.out.println("Program terminated successfully");
		
	}
}
/*
all parent child rules are same in rethrow also
************x*********************x***********************x******************************x**

if same catch block written twice then ambiguity created hence  complilation error
error: exception ArithmeticException has already been caught
                catch (ArithmeticException e)
*/