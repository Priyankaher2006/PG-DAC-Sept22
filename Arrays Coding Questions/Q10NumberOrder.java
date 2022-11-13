/*
	10. Given an array of integers, print whether the numbers are in ascending order or in 
	descending order or in random order without sorting
	Input: [5,14,35,90,139] Output: Ascending 
	Input: [88,67,35,14,-12] Output: Descending
	Input: [65,14,129,34,7] Output: Random 
*/
class Q10NumberOrder
{
	static void order(int arr[])
	{
		int ascending=0,descending=0,random=0;
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				ascending++;
			}
			else if(arr[i]>arr[i+1])
			{
				descending++;
			}
		}
		if(ascending>n-2)
		{
			System.out.println("Ascending");
		}
		else if(descending>n-2)
		{
			System.out.println("Descending");
		}
		else
		{
			System.out.println("Random");
		}
	}
	public static void main(String args[])
	{
		int a[]={5,14,35,90,139};
		int b[]={88,67,35,14,-12};
		int c[]={65,14,129,34,7};
		order(a);
		order(b);
		order(c);
	}
}