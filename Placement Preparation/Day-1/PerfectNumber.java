//25. Write a Java Program to check whether the given number is Perfect Numberor NOT.

import java.util.Scanner;  
public class PerfectNumber
{  
	public static void main(String args[])    
	{  
		long n, sum=0;  
		Scanner sc=new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		n=sc.nextLong();  
		int i=1;  
		//executes until the condition becomes false  
		while(i <= n/2)  
		{  
			if(n % i == 0)  
			{  
				//calculates the sum of factors  
				sum = sum + i;  
			} //end of if  
			//after each iteration, increments the value of variable i by 1  
			i++;  
		} //end of while  
		//compares sum with the number  
		if(sum==n)  
		{  
			//prints if sum and n are equal  
			System.out.println(n+" is a perfect number.");  
		} //end of if  
		else  
			//prints if sum and n are not equal  
			System.out.println(n+" is not a perfect number.");   
	}  
}
/*
	First, we find the factors of 496 i.e. 1, 2, 4, 8, 16, 31, 62, 124, and 248.
	Let's find the sum of factors (1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 +248 = 496).
	We observe that the sum of factors is equal to the number itself.
	Hence, the number 496 is a perfect number. 
*/