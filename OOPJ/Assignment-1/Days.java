/*
	Write a program to read the days (eg. 670 days) as integer value using Scanner class.
	Now convert the entered days into complete years, months and days and print them.
*/
import java.util.Scanner;

class Days
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int year, month, days;
		
		year = m / 365;
        m = m % 365;
        System.out.println("No. of years:"+year);
        month = m / 30;
        m = m % 30;
        System.out.println("No. of months:"+month);
        days = m;
        System.out.println("No. of days:"+days);
		
	}
}