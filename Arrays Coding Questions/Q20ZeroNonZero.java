/*20. How do you separate zeros and non-zeros in a given Array in java?*/
class Q20ZeroNonZero
{
    static void zeros(int arr[], int n)
    {
        int count = 0;  // Count of non-zero elements
 
        // Traverse the array. If element encountered is non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
			{
                arr[count++] = arr[i]; // here count is incremented
			}
        // Now all non-zero elements have been shifted to front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < n)
		{
            arr[count++] = 0;
		}
    }
    /*Driver function to check for above functions*/
    public static void main (String[] args)
    {
        int arr[] = {1, 10, 8, 5, 0, 0, 2, 0, 0, 16, 0};
        int n = arr.length;
		 System.out.println("Array before separating zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
		System.out.println();
        zeros(arr, n);
        System.out.println("Array after separating zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}