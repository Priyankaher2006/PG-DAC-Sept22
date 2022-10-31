import java.util.*;

class GCDTwoNumber1
{
	static void gcd(int a, String s) 
	{  
		if (a == 2) 
		{
			System.out.println(s);
		}
		else 
		{
			s="gcd(int,"+s+")";
			gcd(a-1,s);
		}

     }
 
     public static void main(String[] args) 
	 {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        gcd(n,"gcd(int,int)");
     }
 
}
