//14. How to add two numbers without using the arithmetic operators in Java? 
import java.util.*;

class AddNum{
	static int add(int a, int b)
    {
        for (int i = 1; i <= b; i++)
            a++;
        return a;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
		int b=sc.nextInt();
		int res = add(a, b);
        System.out.print("Sum of two number: "+res);  
    }
}


 
   
