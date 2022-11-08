class MyException extends Exception		//MyException is checked exception
{
}

class UserDefinedExceptionDemo
{
	public static void main(String args[])
	{
		System.out.println("Program execution started");
		try
		{
			throw new MyException();
		
		}
		catch(MyException e)
		{
			
		}
		
		System.out.println("Program terminated successfully");
	}
}
