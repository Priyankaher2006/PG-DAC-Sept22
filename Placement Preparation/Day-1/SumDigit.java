//12. Write a Java Program to find sum of the digits of a given number.
import java.util.*;

class SumDigit{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
		int sum;
		for(sum=0; num!=0; num=num/10)  
		{  
			System.out.println("---->"+num); 
			sum = sum + num % 10;  
			System.out.println("---->"+num); 
			
		}  
		System.out.println("Sum of digits: "+sum);  
    }
}
