import java.util.*;
 
class SumOfSeriesFraction
{
	static float sumOfSeries(int i, int n, float s)
	{
		if (i > n)// Base case
			return s;
		else// Recursive case
		{
			// If we are currently looking at the even number
			if (i % 2 == 0)
				s -= (float)1 / i;
			// If we are currently looking at the odd number
			else
				s += (float)1 / i;
			return sumOfSeries(i+1, n, s);
		}
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
 
        float res=sumOfSeries(1,n,0);
        System.out.println(res);
	}
}