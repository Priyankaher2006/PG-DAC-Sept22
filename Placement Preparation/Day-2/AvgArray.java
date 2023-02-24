//1. Calculate the average of given array. 
import java.util.*;

class AvgArray{
	public static void main(String args[])
	{
		System.out.println("Enter array size:- ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int sum=0,avg;
		int arr[] = new int[size];
		System.out.println("Enter array element:- ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			sum+=arr[i];
		}
		avg=sum/size;
		System.out.println("Average of given array:- "+avg);
	}
}