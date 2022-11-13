class Q8AvgThreeElements
{
	static void average(int a[],int n,int b[])
	{
		int sum=0,count=0,avg=0;
		
		for(int i=0;i<n-2;i++)
		{
			sum=0;count=0;
			if(count<3)
			{
				sum=sum+a[i]+a[i+1]+a[i+2];
				count++;
			}
			avg=(sum/3);
			System.out.print(" "+avg);
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		int a[]={5,14,35,89,140};
		int n=a.length;
		int b[]=new int[n-2];
		average(a,n,b);
     
		
	}
}