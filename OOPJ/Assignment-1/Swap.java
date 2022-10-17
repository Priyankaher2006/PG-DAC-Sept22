/*Write a program to swap two numbers without using third variable.*/

import java.util.Scanner;

class Swap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swaped number= "+a+" : "+b);
		
	}
}