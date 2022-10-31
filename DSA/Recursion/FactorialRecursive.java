import java.util.*;

class FactorialRecursive
{
	static int fact(int a)
	{
		if(a<=1)
			return 1;
		else
			return a*fact(a-1);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Factorial of "+a+" is ");
		System.out.println(fact(a));
	}
}