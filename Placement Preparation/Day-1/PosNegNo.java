//7. How to check the given number is Positive or Negative in Java? 
import java.util.*;
class PosNegNo{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
		//System.out.println("Given Number:"+x);		
		if(x>0)
		{
			System.out.println("Given Number is Positive");
		}
		else if(x<0)
		{
			System.out.println("Given Number is Negative");
		}
		else
		{
			System.out.println("Given Number is Zero");
		}
	}
}