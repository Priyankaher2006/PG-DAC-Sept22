////4. Swap two numbers without using third variable approach 1. 

import java.util.*;

class Swap3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Before Swap: "+"x= "+x+" y= "+y);
		x = x^y; 
        y = x^y;
        x = x^y; 
		System.out.println("After Swap: "+"x= "+x+" y= "+y);
    }
}