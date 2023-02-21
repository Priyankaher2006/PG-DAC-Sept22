//3. Find the Factorialof a number using Recursion. 
import java.util.*;

class FactorialRec{
	static int fact(int a)
	{
		if(a==0)
		{
			return 1;
		}
		else
		{
			return (a*(fact(a-1)));
		}
	}
	
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int res=1;
		res=fact(a);
		System.out.println("Factorial of "+a+" is: "+res);
	}
}