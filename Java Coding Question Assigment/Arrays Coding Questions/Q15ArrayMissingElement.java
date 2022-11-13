/*15. How to find the missing number in a given Array from number 1 to 100 ?*/

class Q15ArrayMissingElement
{
	static int missing(int a[])
	{
		int n=a.length;
		//sum of n natural number
		int sum=((n)*(n+1))/2;
		//sum of array element
		int sum1=0;
		for(int i=0;i<n-1;i++)
		{
			sum1+=a[i];
		}
		//differnce between sum of natural element & sum of array limit=missing element
		return (sum-sum1);
	}
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,6,7,8,10};
		System.out.println("Missing element: "+missing(a));
	}
}

