class ChildParentExceptionHandler
{
	public static void main(String args[])
	{
		System.out.println("try and catch block");
		System.out.println();
		System.out.println("Program Started Execution....");
		System.out.println();
		
		int a=10;
		int b=2;
		int c=0;
		int res=0;

		int arr[]={5,10,15,20,25,30};
		
		try
		{ 	
			res=a/b;
			res=a/c;                       // object of exception is created
			System.out.println(arr[4]);
			System.out.println(arr[7]);
		}
		catch(Exception e)              //parent - if declared first then it will make second block unreacheble         
		{
			System.out.println("Exception caught here");
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e)         //Child class exception should be first than parent class
		{
			System.out.println("ArithmeticException caught here");
			System.out.println(e.getMessage());
		}		
		
		finally
		{
			System.out.println("finally block got executed...");
			
		}
		System.out.println("Result of Division is : "+res);
		System.out.println("Program Runned Successfully....");
		
		
	}




}


/*



<<<<<<<<<<< Input (1)>>>>>>>>>>>>>>>>
catch(ArithmeticException e)    //child first block 
catch(Exception e)              //Parent block second
<<<<<<<<<<<Output (1)>>>>>>>>>>>>>>>>


try and catch block

Program Started Execution....

ArithmeticException caught here
/ by zero
finally block got executed...
Result of Division is : 5
Program Runned Successfully....



<<<<<<<<<<Input (2)>>>>>>>>>>>>>>>>
catch(Exception e)              //Parent block first
catch(ArithmeticException e)    //child first block 
<<<<<<<<<<<Output (2)>>>>>>>>>>>>>>>>

Compilation Error

ChildParentExceptionHandler.java:29: error: exception ArithmeticException has already been caught
                catch(ArithmeticException e)       
                ^
1 error




*/