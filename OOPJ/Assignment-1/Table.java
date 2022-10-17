/*WAP to print table of number 3 X 1 =3 till 3 X 10=30.*/

class Table
{
	public static void main(String args[])
	{
		
		int n=3;
		for(int i=1; i<=10;i++)
		{
			int ans = n * i;
			System.out.println(n+" x "+i+" = "+ans);
		}
	}
}