class Q5SmallLargeElement
{
	static void smallestLagest(int arr[])
	{
		int min=0,max=0,index=0,i,index1=0;
		for(i=0;i<arr.length;i++)
		{
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
					index=i;
				}
				if(min>arr[i])
				{
					min=arr[i];
					index1=i;
				}	
			}	
		}
		System.out.println("Largest element is: "+max+" "+index);
		System.out.println("Smallest element is: "+min+" "+index1);
	}
	static void largestest(int arr[])
	{
		
	}
	public static void main(String arg[])
	{
		int arr[]={10,20,30,40,50,60,70,80,90};
		smallestLagest(arr);
	}
}