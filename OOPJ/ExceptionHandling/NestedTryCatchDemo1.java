import java.util.*;
class NestedTryCatchDemo1
{
	public static void myFun()
	{
		Scanner sc = new Scanner(System.in);
		int arr[]={5,10,15,20,25,30,35};
		int index = sc.nextInt();
		try
			{
				System.out.println("Array= "+arr[index]);
			}
			catch(ArithmeticException e)
			{
				System.out.println("ArithmeticException is caught here:-"+e.getMessage());
			}
			finally//finally will get executed first if exception is not handled here .
			{
				System.out.println("finally inner");
			}
	}
	public static void main(String args[])
	{
		System.out.println("Program Execution Started");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = 0;
		
		try
		{
			//if exception occure above control will go out of this try n outside catch will  get executed
			res=a/b; 
			myFun();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception caught here:2 "+e.getMessage());
		}
		catch(Exception e)		//error: exception ArithmeticException has already been caught
		{
			System.out.println("Exception caught here: "+e.getMessage());
		}
		finally
		{
			System.out.println("finally outer");
		}
		
		System.out.println("result = " + res);
		System.out.println("Program executed successfully");
	}
}