import java.util.*;
class GCDnNumber 
{
	// Function to return gcd of a and b
	static int gcd(int a, int b)
	{
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
	// Function to find gcd of array of  numbers
	static int findGCD(int arr[], int n)
	{
		int result = arr[0];
		for (int element: arr){
			result = gcd(result, element);

			if(result == 1)
			{
			return 1;
			}
		}
		return result;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
        int[] arr = new int[size];
		for(int i=0; i<size; i++)  
		{  
			arr[i]=sc.nextInt();  
		} 
		System.out.println(findGCD(arr, size));
	}
}
