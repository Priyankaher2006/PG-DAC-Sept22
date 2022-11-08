class ExceptionFinallyDemo
{
	public static void main(String args[])
	{
		System.out.println("Start Execution");
		int a=10,b=5,c=0,res=0,res1=0;
		int arr[]={0,1,2,3,4};
		
		res=a/b;	//ok
		System.out.println("Result= "+res);
		System.out.println("Array= "+arr[3]);
		
		try
		{
		res1=a/c;			//exception object is created
		//when above exception happen it will not check below statement/program
		System.out.println("Array= "+arr[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.print("ArithmeticException Caught here: ");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.print("ArrayIndexOutOfBoundsException Caught here: ");
			System.out.println(e1.getMessage());
		}
		finally //if we use finally without try->Error:'finally' without 'try' error.
		{
			System.out.println("finally block");
		}
		System.out.println("Result1= "+res1);
		System.out.println("Execution Completed");
	}
}
/*
1.res1=a/c; //exception as 10/0 is undefined
	Exception in thread "main" java.lang.ArithmeticException: / by zero

2.System.out.println("Array= "+arr[5]);
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
			at ExceptionDemo.main(ExceptionDemo.java:16)

3.if we use try we have to use catch/finally block:-		
	error:
	'try' without 'catch' ,
	'finally' or resource declarations

4.if only try and finally is used & exception occur:-
	it will execute all program & exception shown at end

*/