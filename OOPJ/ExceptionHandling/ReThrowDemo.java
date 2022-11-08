class ReThrowDemo
{
	public static void main(String args[])
	{
		System.out.println("Program started execution");
		int a = -1;
		try
		{
			try
			{	
				if(a < 0)
				{	
					ArithmeticException ae = new ArithmeticException("value can not be negative");
					throw ae;//ae = reference of exception odj thrown to e line-18
				}
				/*
					after throw part further program will not be executed if  code is that imp for execution 
					include it in finally block coz with/without exception finally gets executed
				*/
				System.out.println("Out of if block");
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic exception caught here : "+e.getMessage());
				throw e;		//rethrowing an exception to outside catch block e
			}
			finally
			{
				System.out.println("finally block");
			}
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception : " +e.getMessage());
		}
		/*
		catch (ArithmeticException e)
		{
			System.out.println("Exception : " +e.getMessage());
		}
		*/
		
		System.out.println("Program terminated successfully");
		
	}
}
/*
all parent child rules are same in rethrow also
************x*********************x***********************x******************************x**

if same catch block written twice then ambiguity created hence  complilation error
error: exception ArithmeticException has already been caught
                catch (ArithmeticException e)
*/