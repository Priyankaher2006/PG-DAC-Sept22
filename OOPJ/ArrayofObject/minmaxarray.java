import java.util.*;

class minmaxarray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of elements....");
		int n=sc.nextInt();
		int arr[]= new int[n]; 
		int min=0;
		int max=0;
		int index1=0;
		int index2=0;
		
		//int min=max=index1=index2=0;
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Elements...");
			System.out.println();
			arr[i]=sc.nextInt();
			
			if(i==0)
			{
				min=arr[i];
				max=arr[i];
			}
			else
			{
				if(max<arr[i])
				{
					max=arr[i];
					index1=i;
				}
				if(min>arr[i])
				{
					min=arr[i];
					index2=i;
				}	
			}
			
		}
		
		System.out.println();
		System.out.println("Maximum of "+n+" no. is "+max+" and it is on position "+(index1+1));
		System.out.println();
		System.out.println("Minimum of "+n+" no. is "+min+" and it is on position "+(index2+1));
		
		
	}
	
}
