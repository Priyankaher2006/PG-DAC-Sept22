class Q4ReverseArray
{
	static void reverse(int arr[])
	{
		int b[]=new int[arr.length];
		int j=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			b[j-1]=arr[i];
			j=j-1;
		}
		System.out.println("Reversed Array:-");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+b[i]);
		}
	}
	public static void main(String arg[])
	{
		int arr[]={10,20,30,40,50,60,70,80,90};
		System.out.println("Array before reverse");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		reverse(arr);
	}
}