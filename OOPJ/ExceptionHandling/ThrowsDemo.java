class ThrowsDemo
{
	public static void myFun() throws ArithmeticException, IOException
	{
		System.out.println("myFun called");
		//int res = 5/0;
	}
	
	public static void main(String args[])
	{
		System.out.println("Program started execution");
		
		//myFun();	//unreported exception IOException; must be caught or declared to be thrown
		
		try
		{
			myFun();//exception generated throw myFun will be handled by catch
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception : " +e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("Exception : " +e.getMessage());
		}
		System.out.println("Program terminated successfully");
		
	}
}