/*18. How to find duplicate elements in a given Array*/
class Q18ArrayDuplicate
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50,10,20,30,40,50};
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate No:"+a[i]+" at index "+i+" "+j);
				}
			}
		}
	}
}