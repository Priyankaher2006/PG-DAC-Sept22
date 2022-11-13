/*14. Write a program to check whether two given Arrays are equal, given both contains same data type and same length ?*/
import java.util.*;
class Q14ArrayEquality
{
	  public static boolean areEqual(int a[], int b[])
    {
        int N = a.length;
        int M = b.length;
 
        // If lengths of array are not equal means
        // array are not equal
        if (N != M)
            return false;
 
        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);
 
        // Linearly compare elements
        for (int i = 0; i < N; i++)
            if (a[i] != b[i])
                return false;
        // If all elements were same.
        return true;
    }
	public static void main(String args[])
	{
		int a[] = {10,30,50,40,60,70,100,90,80,20};
		int b[] = {10,20,30,40,50,60,70,80,90,100};
		if (areEqual(a, b))
            System.out.println("Yes");
        else
            System.out.println("No");
		
	}
}