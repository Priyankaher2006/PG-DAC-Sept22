class SingleCatchBlockDemo
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
		catch(ArithmeticException|ArrayIndexOutOfBoundsException e)          //Child class exception should be first than parent class
		{
			System.out.println("ArithmeticException/ArrayIndexOutOfBoundsException caught here");
			System.out.println(e.getMessage());
		}	
		/*catch(ArrayIndexOutOfBoundsException e)              //parent - if declared first then it will make second block unreacheble         
		{
			System.out.println("caught here");
			System.out.println(e.getMessage());
		}*/
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
res=non zero
arr= out of bounds
catch(ArithmeticException|ArrayIndexOutOfBoundsException e) 
<<<<<<<<<<<Output (1)>>>>>>>>>>>>>>>>


try and catch block

Program Started Execution....

25
ArithmeticException/ArrayIndexOutOfBoundsException caught here
7
finally block got executed...
Result of Division is : 5
Program Runned Successfully....



<<<<<<<<<<Input (2)>>>>>>>>>>>>>>>>
res=infinity
arr=out of bounds
catch(ArithmeticException|ArrayIndexOutOfBoundsException e) 
<<<<<<<<<<<Output (2)>>>>>>>>>>>>>>>>

try and catch block

Program Started Execution....

ArithmeticException/ArrayIndexOutOfBoundsException caught here
/ by zero
finally block got executed...
Result of Division is : 5
Program Runned Successfully......






<<<<<<<<<<Input (3)>>>>>>>>>>>>>>>>
res=infinity
arr=out of bounds
catch(Exception|ArithmeticException|ArrayIndexOutOfBoundsException e) 
<<<<<<<<<<<Output(3)>>>>>>>>>>>>>>>>

Compilation Error


SingleCatchBlockDemo.java:24: error: Alternatives in a multi-catch statement cannot be related by subclassing
                catch(Exception|ArithmeticException|ArrayIndexOutOfBoundsException e)          //Child class exception should be first than parent class
                                ^
  Alternative ArithmeticException is a subclass of alternative Exception
SingleCatchBlockDemo.java:24: error: Alternatives in a multi-catch statement cannot be related by subclassing
                catch(Exception|ArithmeticException|ArrayIndexOutOfBoundsException e)          //Child class exception should be first than parent class
                                                    ^
  Alternative ArrayIndexOutOfBoundsException is a subclass of alternative Exception
2 errors


*/