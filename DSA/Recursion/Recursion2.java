class Recursion2
{
	static int show(int n)
	{
		if(n==5)//base condition
			return n;
		else
			return 2*show(n+1); 
	}
	public static void main(String args[])
	{
		System.out.println(show(3));
	}
}
/*
for line no:-8
-show(3) called from main
-when n=3 it will enter else
	2*show(3+1) i.e 2*show(4)
again show fun called
	2+show(5)
base condition satified

now n=5 i.e
	show(3)
	2*show(4)
	2*2*show(5)
	2*2*5=20
*/