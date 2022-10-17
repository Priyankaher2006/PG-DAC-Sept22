/*
	WAP in java to display Fibonacci series using command line argument
	The Fibonacci numbers are the numbers in the following integer sequence.
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
*/

class FibCmdLine
{
	public static void main(String args[])
	{
		
		int fib=0;
		String f1= args[0];
		int a,b=1;
		int n=Integer.parseInt(f1); 
		
		System.out.print(" Factorial of  "+n+" is ");
		
		for(int i=0; i<=n;i++)
		{
			System.out.print(" "+fib);//0...1...1...2...3..5..8
			a=fib+b; //0+1=1.......1+1=2..........1+2=3.......2+3=5.....3+5=8...5+8=13
			fib=b;	 //1......1.....2........3......5.....8
			b=a;	 //1......2.....3........5......8.....13
		}
		
	}
		
}