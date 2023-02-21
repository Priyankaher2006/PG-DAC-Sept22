//5. Swap two numberswithout using third variable approach 2. 
import java.util.*;

class Swap1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swap: "+"a= "+a+" b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap: "+"a= "+a+" b= "+b);
    }
}