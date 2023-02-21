//19. Check whether the Given Numberis a Palindrome or NOT.
import java.util.*;

class Palindrome{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
		int c,b,s=0;
		c=a;
		while(a>0)
		{
			b=a%10;
			s=(s*10)+b;
			a=a/10;
		}
		a=c;
		if(s==a)
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not ");
		}
    }
}