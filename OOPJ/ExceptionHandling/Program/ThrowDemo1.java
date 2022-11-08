class ThrowDemo1
{
	public static void main(String args[])
	{
		System.out.println();
		System.out.println("Program Started Execution....");
		System.out.println();
		
		int a=-10; 
		try
		{
				try
				{ 						
					if(a<0)                     //input 2
					{
						ArithmeticException ae=new ArithmeticException("Value cannot be negative...");
						throw ae;
					}
				
				}
				
				catch(ArithmeticException e)            
				{
					System.out.println("ArithmeticException/ArrayIndexOutOfBoundsException caught here : "+e.getMessage());
					throw e;
				}
				
				finally
				{
					System.out.println("finally block - inner - got executed...");
					
				}
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

ArithmeticException ae=new ArithmeticException();
throw ae;

<<<<<<<<<<<Output (1)>>>>>>>>>>>>>>>>

Program Started Execution....

ArithmeticException/ArrayIndexOutOfBoundsException caught here : Value cannot be negative...
finally block - inner - got executed...
Exception caught here : Value cannot be negative...
finally block - outer - got executed...

Program Executed Successfully....



*/