import java.util.*;

class FibonacciSeriesN
{
	static int fib(int n)
	{
		if(n==1 || n==2)
			return 1;
		else
			return (fib(n-1)+fib(n-2));
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("Fibonacci Series for "+x+"th number is ");
		for(int i=1;i<=x;i++)
		{
			System.out.print(" "+fib(i));
		}
	}
}