import java.util.*;
class PalindromeNumber
{
	static int pal(int num, int sum)
	{
		if(num==0)
			return sum;
		else
			sum=(sum*10)+(num%10);
			return pal(num/10,sum);
		
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);   
	    System.out.println("Enter a string/number to check if it is a palindrome");  
		int num = in.nextInt(); 
		int sum=0;
		int p= pal(num,sum);
		if(num==p)
			System.out.println("Palindrome");
		else
			System.out.println("not Palindrome");
	}
}