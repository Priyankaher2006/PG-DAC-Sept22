import java.util.*;
class UniversalHandlerDemo
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
		catch(Exception e)
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