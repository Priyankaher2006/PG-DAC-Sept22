import java.util.Scanner;

class Patter{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	for(int i=n; i>=1; i--)   
	{   
		for(int j=i; j>=1;j--)
		{
			System.out.print("*");  
		}	
		for(int j=n; j>=i;j--)
		{
			System.out.print(" ");  
		}
		for(int j=i; j<=n-1;j++)
		{
			System.out.print(" ");  
		}
		for(int j=i; j>=1;j--)
		{
			System.out.print("*");  
		}
		System.out.println();
	} 
	
	for(int i=2; i<=n; i++)   
	{   
		for(int j=i; j>=1;j--)
		{
			System.out.print("*");  
		}	
		for(int j=n; j>=i;j--)
		{
			System.out.print(" ");  
		}
		for(int j=i; j<=n-1;j++)
		{
			System.out.print(" ");  
		}
		for(int j=i; j>=1;j--)
		{
			System.out.print("*");  
		}
		System.out.println();
	}
}
}
/*

*****
****
***
**
*
*
**
***
****
*****

*/