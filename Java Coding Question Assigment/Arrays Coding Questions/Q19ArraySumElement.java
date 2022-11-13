/*19. Write a program to sum all the values of a given Array in java? */
class Q19ArraySumElement
{
	int sum(int a[])
	{
		int n=a.length;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String args[])
	{
		Q19ArraySumElement s = new Q19ArraySumElement();
		int a[]={10,20,30,40,50,60,70,80,90,100};
		System.out.println("Sum of Array Element: "+s.sum(a));
	}
}