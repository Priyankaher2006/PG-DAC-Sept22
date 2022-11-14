import java.util.Scanner;  
public class ArrayDeletion 
{  
	public static void main(String[] args)   
	{  
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter the number of elements you want to store: ");  
		n=sc.nextInt();  
		int a[] = new int[n];  
		int b[] = new int[n-1]; 
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
			a[i]=sc.nextInt();  
		}  
		System.out.println("Enter index of new value to be deleted");  
		int m=sc.nextInt();
		
		for(int i=0; i<n; i++) 
		{
			if(i<m)
			{
				b[i]=a[i];
			}
			else if(i==m)
			{
				continue;
			}
			else
			{
				b[i-1]=a[i];
			}
		}
		System.out.println("Array elements are: ");  
		for (int i=0; i<n-1; i++)   
		{  
		System.out.println(b[i]);  
		}  
	}  
}