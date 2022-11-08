 class ExceptionDemo
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
		System.out.println("Result1= "+res1);
		System.out.println("Execution Completed");
	}
	
}
/*
res1=a/c; //exception as 10/0 is undefined
Exception in thread "main" java.lang.ArithmeticException: / by zero

System.out.println("Array= "+arr[5]);
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at ExceptionDemo.main(ExceptionDemo.java:16)
*/