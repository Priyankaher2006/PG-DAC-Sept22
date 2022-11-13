class Q3ArraySumtwoNo
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,40,50,60,70,80,90};
		int key=100;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]+arr[j])==key)
				{
					System.out.println(arr[i]+" & "+arr[j]+" is pair of element whose sum is equal to "+key);
				}
			}
		}
		
	}
}
