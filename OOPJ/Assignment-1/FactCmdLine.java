/*WAP in java to find Factorial of a number using command line argument*/


class FactCmdLine
{
	public static void main(String args[])
	{
		
		int fact=1;
		String f1= args[0];
		
		int n=Integer.parseInt(f1); 
		
		for(int i=1; i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.print(" Factorial of  "+n);
		System.out.println(" is "+fact);
	}
}