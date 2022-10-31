import java.util.*;

class SumOfSeries
{
	static int Sum(int n)
	{
		if(n<=1)
			return 1;
		else
			return n+Sum(n-1);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Sum of "+n+" number is ");
		System.out.println(Sum(n));
	}
}