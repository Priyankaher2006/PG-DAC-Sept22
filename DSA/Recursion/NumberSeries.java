import java.util.*;

class NumberSeries
{
	static void series(int n)
	{
		if(n==0)
			System.out.print(" "+n);
		else
		{
			series(n-1);
			System.out.print(" "+n);
		}
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		series(n);
	}
}