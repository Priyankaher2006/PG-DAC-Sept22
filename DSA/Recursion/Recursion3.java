class Recursion3
{
	static int fact(int n)
	{
		if(n<=1)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String args[])
	{
		System.out.println(	fact(5));
	}
}
/*
fact(5) called from main
base condition not satisfied
enter else
	5*fact(5-1) i.e  5*fact(4)
fact fun called
	5*4*fact(3)
fact fun called
	5*4*3*fact(2)
fact fun called
	5*4*3*2*fact(1)
as base condition satisfied
	5*4*3*2*1=120

*/