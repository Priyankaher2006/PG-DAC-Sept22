//21. Write a Java Program to check whether the Given Number is Prime Number or NOT. 
import java.util.*;

class PrimeNum{
	public static void main(String[] args)
   {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}
		
   }
}