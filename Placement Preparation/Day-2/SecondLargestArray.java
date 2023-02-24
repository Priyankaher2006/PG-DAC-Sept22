//2. Find the second largest number in the given array.
import java.util.*;

public class SecondLargestArray{  
	public static int getSecondLargest(int[] a, int total)
	{  
		int temp;  
		for (int i=0; i<total; i++)   
		{  
			for (int j=i+1; j<total; j++)   
			{  
				if (a[i] > a[j])   
				{  
					temp = a[i];  
					a[i] = a[j];  
					a[j] = temp;  
				}  
			}  
		}  
		return a[total-2];  
	}  
	public static void main(String args[])
	{  
		System.out.println("Enter array size:- ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter array element:- ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Second Largest: "+getSecondLargest(a,size));  
		
	}
}