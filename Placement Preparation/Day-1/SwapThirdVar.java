
import java.util.*;

class SwapThirdVar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swap: "+"a= "+a+" b= "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap: "+"a= "+a+" b= "+b);
		
       
    }
}
