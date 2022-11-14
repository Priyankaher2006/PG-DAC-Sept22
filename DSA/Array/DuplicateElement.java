class DuplicateElement
{
	public static void main(String args[])
	{
		int a[]={0,3,1,2,3,1,0};
		System.out.println("Given Array :- ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" "+a[i]);
		}
		for(int i=0;i<a.length;i++)		//0		1 				   2.........
		{
			for(int j=i+1;j<a.length;j++)//1 2 3 4 	1-found  2 3  4-found
			{
				if((a[i] == a[j]) && (i!=j))
				{
					System.out.print(" duplicate element: "+a[j]);
					System.out.println(" at position "+j+" & "+i);
				}	
			}
			
		}	
	}
}
/*

*/