class ThrowsDemo
{
	public static void myFun() throws ArithmeticException
	{
		System.out.println("myfun called");
	}
	public static void main(String args[])
	{
		System.out.println("Execution Start");
		myFun(); //Execution Startmyfun calledExecution Completed
		/*
		try
		{
			myfun();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e1.getMessage());
		}
		*/
		System.out.println("Execution Completed");
	}
}
