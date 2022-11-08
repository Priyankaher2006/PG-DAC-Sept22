import java.util.*;
class ThrowDemo
{
	public static void main(String args[])
	{
		System.out.println("Program Execution Started");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = 0;
		int arr[]={5,10,15,20,25,30,35};
		int index = sc.nextInt();
		try
		{
			res=a/b;			//exception object is created
			arr=null;
			System.out.println("Array= "+arr[index]);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e )//child class
		{
			System.out.print("ArithmeticException/ArrayIndexOutOfBoundsException Caught here: ");
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
catch(ArithmeticException | ArrayIndexOutOfBoundsException e | Exception e)
=> compilation error as there should not be any parent-child  amoung exception type
 error: Alternatives in a multi-catch statement cannot be related by subclassing
                catch(ArithmeticException | Exception e)//child class
  Alternative ArithmeticException is a subclass of alternative Exception
*/