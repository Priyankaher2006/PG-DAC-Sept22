/*
	Write a program to convert temperature from Fahrenheit to Celsius. 
	Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
*/
import java.util.Scanner;

class Temperature
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float F = sc.nextFloat();
		float C = 5 * ( F -32 ) / 9;
		
		System.out.println(F+" Fahrenheit to "+C+" Celsius ");
	}
}