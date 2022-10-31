class FibonacciSeries
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
		int x=10;
		for(int i=1;i<=x;i++)
		{
			System.out.print(" "+fib(i));
		}
	}
}
/*
		                                  fib(6)
	                            fib(5)        +       fib(4)
	fib(4)     +        fib(3)       +        fib(3)       +    fib(2)
        fib(3)+fib(2) +fib(2)+fib(1) +fib(2)+fib(1) + fib(1)+1
         fib(2)+fib(1)+fib(1)+1+fib(1)+1+1+fib(1)+1+1+1+1
*/