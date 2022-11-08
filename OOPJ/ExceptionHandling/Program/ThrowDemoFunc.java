class ThrowDemoFunc
{
	public static void myfun()
	{
		try
		{ 		
			int a=-10; 
			if(a<0)               
			{
				ArithmeticException ae=new ArithmeticException("Value cannot be negative...");
				throw ae;
			}
		
		}
		
		//catch(ArithmeticException e)      // input 1         
		catch(ArrayIndexOutOfBoundsException e)      //input 2
		{
			System.out.println("ArithmeticException: "+e.getMessage());
		}
		
		finally
		{
			System.out.println("finally block - inner - got executed...");
			
		}
	}
	
	
	public static void main(String args[])
	{
		System.out.println();
		System.out.println("Program Started Execution....");
		System.out.println();
		
		
		try
		{
				myfun();
		}
		catch(Exception p)          
		{
			System.out.println("Exception caught here : "+p.getMessage());
		}
				
		finally
		{
			System.out.println("finally block - outer - got executed...");		
		}
		
		
		
		System.out.println("\nProgram Executed Successfully....");
		
		
	}




}


/*
V.V.Imp
-----------
when we throw from inner loop to outer exception....the exception reference must be equal to 



<<<<<<<<<<< Input (1)>>>>>>>>>>>>>>>>



<<<<<<<<<<<Output (1)>>>>>>>>>>>>>>>>

Program Started Execution....

ArithmeticException: Value cannot be negative...
finally block - inner - got executed...
finally block - outer - got executed...

Program Executed Successfully....





<<<<<<<<<<< Input (2)>>>>>>>>>>>>>>>>



<<<<<<<<<<<Output (2)>>>>>>>>>>>>>>>>




Program Started Execution....

ArithmeticException/ArrayIndexOutOfBoundsException caught here : Value cannot be negative...
finally block - inner - got executed...
Exception caught here : Value cannot be negative...
finally block - outer - got executed...

Program Executed Successfully....




*/