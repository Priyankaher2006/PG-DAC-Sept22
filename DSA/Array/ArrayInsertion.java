import java.util.Scanner;  
public class ArrayInsertion  
{  
	public static void main(String[] args)   
	{  
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter the number of elements you want to store: ");  
		n=sc.nextInt();  
		int a[] = new int[n];  
		int b[] = new int[n+1]; 
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
			a[i]=sc.nextInt();  
		}  
		System.out.println("Enter index of new value to be inserted ");  
		int m=sc.nextInt();
		System.out.println("Enter new value to be inserted ");  
		int p=sc.nextInt();
		for(int i=0; i<n+1; i++) 
		{
			if(i<m)
			{
				b[i]=a[i];
			}
			else if(i==m)
			{
				b[i]=p;
			}
			else
			{
				b[i]=a[i-1];
			}
		}
		System.out.println("Array elements are: ");  
		for (int i=0; i<n+1; i++)   
		{  
		System.out.println(b[i]);  
		}  
	}  
}