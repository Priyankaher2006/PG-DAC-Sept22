class ExceptionHandlingUni
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
		catch(Exception e)         //catch all exception handler or universal exception handler 
		{
			System.out.println("Exception caught here");
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

Inp-
res=0
arr=out of bound 

<<<<<<<<<<<Output (1)>>>>>>>>>>>>>>>>


try and catch block

Program Started Execution....

25
Exception caught here
7
finally block got executed...
Result of Division is : 5
Program Runned Successfully....



<<<<<<<<<<Input (2)>>>>>>>>>>>>>>>>

Inp
res=infinity
arr=out of bound
catch(ArrayIndexOutOfBoundsException e1) //can handle this array exception

<<<<<<<<<<<Output (2)>>>>>>>>>>>>>>>>

ttry and catch block

Program Started Execution....

Exception caught here
/ by zero
finally block got executed...
Result of Division is : 5
Program Runned Successfully....




<<<<<<<<<<<Input (3.b)>>>>>>>>>>>>>>>>

Inp
res=non zero 
arr=out of bound
catch(ArrayIndexOutOfBoundsException e1) //can handle this array exception

<<<<<<<<<<<Output (3.b)>>>>>>>>>>>>>>>>

try and catch block

Program Started Execution....

25
ArrayIndexOutOfBoundsException caught here
7
Result of Division is : 5
Program Runned Successfully....





Things to Remember:

if exception type is ArithmeticException e is of arithmetic type...not able to match typeand hence 



*/