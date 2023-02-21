//2. Write a Java Program to find the Factorialof given number. 
import java.util.*;
class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int res=1;
        for(int i=1; i<=a;i++)
        {
            res=res*i;
        }
        System.out.println("Factorial of "+a+" is: "+res);
    }
}