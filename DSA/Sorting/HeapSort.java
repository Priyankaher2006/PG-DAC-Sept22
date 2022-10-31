class HeapSort  
{  
	/* 
	function to heapify a subtree. Here 'i' is the   
	index of root node in array a1[], and 'n' is the size of heap.
	*/   
	static void heapify(int a1[], int n, int i)  
	{  
		int largest = i; // Initialize largest as root  
		int left = 2 * i + 1; // left child  (+1 coz index cann't be start from zero)
		int right = 2 * i + 2; // right child  
		// If left child is larger than root  
		if (left < n && a1[left] > a1[largest])  //l<n ; checking if l is in array limit or not
			largest = left;  
		// If right child is larger than root  
		if (right < n && a1[right] > a1[largest])   //r<n ; checking if r is in array limit or not
			largest = right;  
		// If root is not largest  
		if (largest != i) 
		{  
			// swap a[i] with a[largest]  
			int temp = a1[i];  
			a1[i] = a1[largest];  
			a1[largest] = temp;  
          
			heapify(a1, n, largest); //call for every subtree 
		}  
	} 
	
	/*Function to implement the heap sort*/  
	static void heapSort(int a1[], int n)  
	{   /*
		whenevwe we sort heap it divides into two part Left chils & right child 
		if n is total elements then to accsess left/right side n/2   
		&  n/2-1 we started index from 0.
		*/
		for (int i = n/2-1; i >= 0; i--)  
			heapify(a1, n, i);  //i or zero both works
		// One by one extract an element from heap  
	
		for (int i = n - 1; i >= 0; i--) //here (n-1) is index of last element
		{  
			/* Move current root element to end*/  
			// swap a1[0] with a1[i]  
			int temp = a1[0];  
			a1[0] = a1[i];  
			a1[i] = temp;  
          
			heapify(a1, i, 0); //balancing Max heap 
		}  
	}  

	/* function to print the array elements */  
	static void printArray(int a1[], int n)  
	{  
		for (int i = 0; i < n; ++i)  
			System.out.print(a1[i] + " ");  
	}  

	public static void main(String args[])   
	{  
		int a1[] = {2,3,24,45,9,30,-2};  
		int n = a1.length;  
		System.out.print("Before sorting array elements are - \n");  
		printArray(a1, n);  
		heapSort(a1, n);  
		System.out.print("\nAfter sorting array elements are - \n");  
		printArray(a1, n);  
	}  
}  