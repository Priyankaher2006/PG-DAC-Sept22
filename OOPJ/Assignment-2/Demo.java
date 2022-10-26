/*
	7.Create a class MathOperation that has four static methods. add() method that takes two integer numbers as 
parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and 
returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the 
product. power() method that takes two integer numbers as parameter and returns the power of first number to 
second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four 
methods of MathOperation class by providing entered numbers and prints the return values of every method
*/
import java.util.*;
class MathOperation
{
	static int addition(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	static int subtract(int a, int b)
	{
		int sub = a-b;
		return sub;
	}
	static int multiply(int a, int b)
	{
		int mul = a*b;
		return mul;
	}
	static int power(int a, int b)
	{
		int pow=1;
		for(int i=1; i<=b;i++)
		{
			pow=pow*a;
		}
		return pow;
	}
}
class Demo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("***********************************************************************************************");
		System.out.println();
		
		System.out.print("Addition of "+a+" & "+b+" is :");
		System.out.println(MathOperation.addition(a,b));
		System.out.println();
		
		System.out.print("Subtracttion of "+a+" & "+b+" is :");
		System.out.println(MathOperation.subtract(a,b));
		System.out.println();
		
		System.out.print("Multiplication of "+a+" & "+b+" is :");
		System.out.println(MathOperation.multiply(a,b));
		System.out.println();
		
		System.out.print("Power of "+a+" to "+b+" is :");
		System.out.println(MathOperation.power(a,b));
		System.out.println();
		
		System.out.println("***********************************************************************************************");
		
	}
}