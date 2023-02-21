//16. Write a Java Program to find GCD of two given numbers. 
import java.util.*;

class GCDTwoNumber{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
		int b=sc.nextInt();
		while(a!=b)   
		{  
			if(a>b)  
				a=a-b;  
			else  
				b=b-a;  
		}  
		System.out.print("GCD of a and b is: " +b);   
    }
}
/*
int gcd = 1;
for (int i = 1; i <= n1 && i <= n2; ++i) {
// check if i perfectly divides both n1 and n2
if (n1 % i == 0 && n2 % i == 0)
gcd = i;
}
System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
*/