import java.util.*;
public class GCDforThreeDigit
{
    public static int gcd(int num1, int num2) 
    {
        if (num2 == 0)
            return num1;
        return gcd (num2, num1 % num2);
    }

    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3= sc.nextInt();	
        System.out.println("GCD of "+num1+", "+num2+" and "+num3+" is "+gcd(num1,gcd(num2,num3)));
    }
}