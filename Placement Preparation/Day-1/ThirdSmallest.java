//13. Write a Java Program to find the smallest of 3 numbers(a,b,c) without using < or > symbol? 
import java.util.*;
class ThirdSmallest{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b)
		{
			if(a<c)
			{
				System.out.println("Smallest: "+a);
			}
			else
			{
				System.out.println("Smallest: "+c);
			}
		}
		else
		{
			if(b<c)
			{
				System.out.println("Smallest: "+b);
			}
			else
			{
				System.out.println("Smallest: "+c);
			}
		}
		
	}
}