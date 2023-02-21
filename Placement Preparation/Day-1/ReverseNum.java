//15. Write a java program to Reverse a given number.
import java.util.*;

class ReverseNum{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
		int count=0;
		int temp=num;
		while (num != 0) {
			num /= 10;
		    ++count;
		}
		System.out.println("Number of digits: "+count);
		
		int a;
		for(int i = 1; i <= count; i++)
		{
			a=temp%10;
			temp=temp/10;
			System.out.print(" "+a);
		}
    }
}