class Q6thirdlargest
{
	static void thirdlargest(int arr[])
	{
		//we have to find 3rd largest so there should be atleast 3 elements
		if(arr.length<3)
		{
			System.out.println("Invalid");
			return;
		}
		int index=0;
		//first fine largest element & store it 
		int first=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
				first=arr[i];
		}
		//second fine largest element & store it 
		int second=Integer.MIN_VALUE;//samllest number taken then comperd will array element & largest element
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>second && arr[i]<first)
				second=arr[i];
		}
		//third fine largest element & store it 
		int third=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>third && arr[i]<second)
			{
				third=arr[i];
				index=i;
			}
		}
		System.out.println("Third Largest element is: "+third+" at "+index);
	}

	public static void main(String arg[])
	{
		int arr[]={10,20,30,40,50,60,70,80,90};
		thirdlargest(arr);
		int arr1[]={24,54,31,16,82,45,67};
		thirdlargest(arr1);
	}
}