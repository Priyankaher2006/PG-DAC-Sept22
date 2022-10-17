/*
	Write a program to find the simple interest. 
	Take the principle amount, rate of interest and 
	time from user using Scanner class.
	Simple Interest = (P × R × T)/100  
	where P = Principal Amount, R = Rate per Annum, T = Time (years)  
*/
import java.util.Scanner;

class SimpleInt
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount");
		float P = sc.nextFloat();
		System.out.println("Enter Rate per Annum");
		float R = sc.nextFloat();
		System.out.println("Enter Time(years)");
		float T = sc.nextInt();
		
		float SimpleInterest = (P * R * T)/100;
		System.out.println("Simple Interest= "+SimpleInterest );
	}
}