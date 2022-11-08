class ThrowDemo
{
	public static void main(String args[])
	{
		System.out.println();
		System.out.println("Program Started Execution....");
		System.out.println();
		
		int a=-10; 
				try
				{ 	
				
					/*if(a<0)                   //input 1
					{
						ArithmeticException ae=new ArithmeticException();
						throw ae;
					}*/
					
					if(a<0)                     //input 2
					{
						ArithmeticException ae=new ArithmeticException("Value cannot be negative...");
						throw ae;
					}
				
				}
				/*catch(ArithmeticException e)            //input 1
				{
					System.out.println("ArithmeticException/ArrayIndexOutOfBoundsException caught here");
				}*/
				
				catch(ArithmeticException e)            //input 2
				{
					System.out.println("ArithmeticException/ArrayIndexOutOfBoundsException caught here : "+e.getMessage());
				}
				
				finally
				{
					System.out.println("finally block - inner - got executed...");
					
				}
		
		
	}




}


/*



<<<<<<<<<<< Input (1)>>>>>>>>>>>>>>>>

ArithmeticException ae=new ArithmeticException();
throw ae;

<<<<<<<<<<<Output (1)>>>>>>>>>>>>>>>>

Program Started Execution....

ArithmeticException/ArrayIndexOutOfBoundsException caught here
finally block got executed...
Program Runned Successfully....







<<<<<<<<<<Input (2)>>>>>>>>>>>>>>>>

ArithmeticException ae=new ArithmeticException("Value cannot be negative...");
throw ae;

<<<<<<<<<<<Output (2)>>>>>>>>>>>>>>>>

Program Started Execution....

ArithmeticException/ArrayIndexOutOfBoundsException caught here : Value cannot be negative...
finally block got executed...
Program Runned Successfully....






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