import java.util.*;

class TwoDArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("row");
		int n = sc.nextInt();
		System.out.println("coloum");
		int m = sc.nextInt();
		int a1[][]=new int[n][m];
		
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < m; j++)  
			{
				a1[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < m; j++)  
			{
				System.out.print(a1[i][j]);
			}
			System.out.println();
		}
	}
}