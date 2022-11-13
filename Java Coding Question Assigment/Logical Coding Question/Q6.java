class Q6
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)//row
		{
			for(int j=i-1;j>=1;j--)//coloum
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1

*/