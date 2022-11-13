/*12. How to rotate an array left and right by a given number K?*/
class Q12RotateArray
{
	// Function to rotate array
	static void Rotate(int arr[], int k, int n)
	{
		// Storing rotated version of array
		int temp[] = new int[n];
		// Keeping track of the current index of temp[]
		int j = 0;
		// Storing the n - d elements of array arr[] to the front of temp[]
		for(int i=k; i<n; i++) 
		{
			temp[j] = arr[i];
			j++;
		}
		// Storing the first d elements of array arr[] into temp
		for(int i=0; i<k; i++) 
		{
			temp[j] = arr[i];
			j++;
		}
		// Copying the elements of temp[] in arr[] to get the final rotated array
		for(int i=0; i<n; i++) 
		{
			arr[i] = temp[i];
		}
	}
	 
	// Function to print elements of array
	static void PrintTheArray(int arr[], int n)
	{
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
    public static void main (String[] args) 
	{
        int arr[] = {10,20,30,40,50,60,70};
        int N = arr.length;
        int k = 2;
 
        Rotate(arr, k, N);
        PrintTheArray(arr, N);
    }
}
