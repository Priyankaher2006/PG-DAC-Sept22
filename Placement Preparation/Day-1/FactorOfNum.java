//11. Write a Java Program to print all the Factors of the Given number.
import java.util.*;

class FactorOfNum{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
		
		System.out.print("Factors of "+num+" is: ");
		for (int i = 1; i <= num; ++i) 
		{
		  // if number is divided by i, i is the factor
		  if (num % i == 0) 
		  {
			System.out.print(i+" ");
		  }
		}
    }
}