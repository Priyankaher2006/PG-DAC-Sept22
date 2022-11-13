class Q15
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)//row
		{
			for(int j=i-1;j>=1;j--)//coloum
			{
				System.out.print(" ");
			}
			for(int j=i;j<=6;j++)//coloum
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*
1 2 3 4 5 6
 2 3 4 5 6
  3 4 5 6
   4 5 6
    5 6
     6
*/