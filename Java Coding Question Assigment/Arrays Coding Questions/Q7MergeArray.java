class Q7MergeArray
{
	static void mergingArray(int a[],int b[],int s,int s1,int c[])
	{
		 int i = 0, j = 0, k = 0;
        // Traverse both array
        while (i < s && j < s1)
        {
			c[k++] = a[i++];
            c[k++] = b[j++];
        }
        // Store remaining elements of first array
        while (i < s)
            c[k++] = a[i++];
     
        // Store remaining elements of second array
        while (j < s1)
            c[k++] = b[j++];
		
		System.out.println("Array after merging");
        for(int l = 0; l < s + s1; l++)
            System.out.print( c[l] + " ");
	}
	public static void main(String args[])
	{
		int a[]={23,60,94,3,102};
		int b[]={42,16,74};
		int s=a.length;
		int s1=b.length;
		int c[]=new int[s+s1];
     
		System.out.println("Array before merging");
		for(int l = 0; l < s; l++)
		{
            System.out.print(a[l] + " ");
		}
		 System.out.println();
		for(int l = 0; l < s1; l++)
		{
			System.out.print( b[l] + " ");
		}
		System.out.println();
		mergingArray(a,b,s,s1,c);
	}
}