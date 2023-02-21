//8. Write a Java Program to find whether given number is Leap year or NOT? 
import java.util.*;
class LeapYear{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yr=sc.nextInt();
		//System.out.println("Given Number:"+x);
		if((yr%4==0) || (yr%400==0) || (yr%100==0))
		{
			System.out.println(yr+" is leap year");
		}
		else
		{
			System.out.println(yr+" is not leap year");
		}
		
	}
}