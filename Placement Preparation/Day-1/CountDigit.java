//10. Write a Java Program to print the digits of a Given Number.
import java.util.*;

class CountDigit{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
		int count=0;
		
		while (num != 0) {
			num /= 10;
		    ++count;
		}
		System.out.println("Number of digits: " + count);
    }
}
/*
--> for (; num != 0; num /= 10, ++count) {
    }
*/