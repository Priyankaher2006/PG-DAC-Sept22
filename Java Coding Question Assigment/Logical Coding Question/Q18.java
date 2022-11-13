
class Q18
{
	public static void main(String[] args)
	{	 
		int rows = 7;
		for (int i = rows; i >= 1; i--)
		{
			for (int j = rows; j >= i; j--)
			{
			System.out.print(j+" ");
			}
			 
			System.out.println();
		}
	}
}
/*
7
7 6
7 6 5
7 6 5 4
7 6 5 4 3
7 6 5 4 3 2
7 6 5 4 3 2 1

*/