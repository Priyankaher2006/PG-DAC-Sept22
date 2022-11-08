class ExceptionHandlingTC
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
			//res=a/c;                       // object of exception is created
			System.out.println(arr[4]);
			System.out.println(arr[7]);
		}			 
		catch(ArithmeticException e)        //object type is matched and control is executed
		{
			System.out.println("ArithmeticException caught here");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e1)     
		{
			System.out.println("ArrayIndexOutOfBoundsException caught here");
			System.out.println(e1.getMessage());
		}
		
		System.out.println("Result of Division is : "+res);
		System.out.println("Program Runned Successfully....");
		
		
	}




}


/*



<<<<<<<<<<< Input (1)>>>>>>>>>>>>>>>>

Inp----------catch(ArithmeticException e)    // cant handle this array exception

<<<<<<<<<<<Output (1)>>>>>>>>>>>>>>>>


try and catch block

Program Started Execution....

25
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 7
        at ExceptionHandlingTC.main(ExceptionHandlingTC.java:15)






<<<<<<<<<<<Input (2)>>>>>>>>>>>>>>>>

Inp----------ArrayIndexOutOfBoundsException //can handle this array exception

<<<<<<<<<<<Output (2)>>>>>>>>>>>>>>>>


try and catch block

Program Started Execution....

25
ArrayIndexOutOfBoundsException caught here
7
Program Runned Successfully....







<<<<<<<<<<<Input (3.a)>>>>>>>>>>>>>>>>

Inp
res=infinity
arr=out of bound
catch(ArrayIndexOutOfBoundsException e1) //can handle this array exception

<<<<<<<<<<<Output (3.a)>>>>>>>>>>>>>>>>

try and catch block

Program Started Execution....

ArithmeticException caught here
/ by zero
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