class Q11
{
	public static void main(String args[])
	{
		for(char i=70;i>=65;i--)
		{
			for(char j=65;j<=i;j++)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		for(char i=65;i<=70;i++)
		{
			for(char j=65;j<=i;j++)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}
}
/*
A B C D E F
A B C D E
A B C D
A B C
A B
A
A
A B
A B C
A B C D
A B C D E
A B C D E F
*/