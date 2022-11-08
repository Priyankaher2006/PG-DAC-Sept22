import java.util.*;
class ChildParentExceHandler
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int index = sc.nextInt();
		int res=0;
		
		int arr[]={5,10,15,20,25,30,35};
		
		try
		{
			res=a/b;			//exception object is created
			System.out.println("Array= "+arr[index]);
		}
		catch(ArithmeticException e)//child class
		{
			System.out.print("ArithmeticException Caught here: ");
			System.out.println(e.getMessage());
		}
		catch(Exception e)//parent class
		{
			System.out.print("Exception Caught here: ");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("result = " + res);
		System.out.println("Program executed successfully");
	}
}
/*
************************************************************************************************
=>child  handler must be before parent handler
************************************************************************************************
=>if parent handler before child then program show complilation error
	 error: exception ArithmeticException has already been caught
                catch(ArithmeticException e)//child class

************************************************************************************************
*/