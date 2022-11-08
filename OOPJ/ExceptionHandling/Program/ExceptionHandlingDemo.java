import java.util.*;

class ExceptionHandlingDemo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Enter a : ");
		a=s.nextInt();
		System.out.println("Enter b : ");
		b=s.nextInt();
		
		
		System.out.println();
		System.out.println("Program Execution Started...");
		System.out.println();
		
		int arr[]={1,2,5,10,25,10,-10};     //length of array 7 , index from 0-6
		int res1=0;
		
		//res1=a/b;     //correct
	    //System.out.println("Result 1 = "+res1);
		
		//res2=a/c;    //generate an Runtime error ///exception
		//System.out.println("Result 2 = "+res2);
		
		//System.out.println("arr[4] : "+arr[4]);
		//System.out.println("arr[0] : "+arr[0]);
		//System.out.println("arr[3] : "+arr[3]);
		
	 
		try                    //if only try block..it will give syntax error
		{
			System.out.println("Inside Try Block...");
			res1=a/b;     //correct
			System.out.println("Result 1 = "+res1);
			try
			{
				System.out.println("arr[8] : "+arr[8]);    //ArrayIndexOutOfBoundsException
				//arr=null;
				//System.out.println("Null Pointer Exception : "); 
				System.out.println("arr[0] : "+arr[0]);
			}
			/*catch(Exception e)
			{
				System.out.println("Exception Caught  : "+ e.getMessage());
			}*/
			finally                //'finally' without 'try'    syntax erro
			{
				System.out.println("Inner Finally Block Executed ...");
			}
		
			
		}
		
		catch(ArithmeticException e1)
		{
			System.out.println("Arithmetic Exception Caught  : "+ e1.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("ArrayIndexOutOfBoundsException caught here : ");
		}
		catch(Exception e1)
		{
			System.out.println("Exception Caught  : "+ e1.getMessage());
		}
		finally                //'finally' without 'try'    syntax erro
		{
			System.out.println("Outer Finally Block Executed ...");
		}
		
		
		
		
		System.out.println();
		System.out.println("Program Execution Completed...");	
		System.out.println();
	}
	

}