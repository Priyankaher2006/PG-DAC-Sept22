class Q9
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)//row
		{
			for(int j=i-1;j>=1;j--)//coloum
			{
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++)//coloum
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)//row
		{

			for(int j=5;j>=i;j--)//coloum
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*
			for(int j=i-1;j>=1;j--)//coloum
			{
				System.out.print(" ");
			}
*/