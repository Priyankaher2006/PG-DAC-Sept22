import java.util.*;
class NestedTryCatchDemo
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
			//if exception occure above control will go out of this try n outside catch will  get executed
			res=a/b; 
			try
			{
				System.out.println("Array= "+arr[index]);
			}
			catch(ArithmeticException e)
			{
				System.out.println("ArithmeticException is caught here:-"+e.getMessage());
			}
			finally
			{
				System.out.println("finally inner");
			}
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