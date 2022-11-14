class ArrayTraversal
{
	public static void main(String args[])
	{
		int a1[];
		a1= new int[100];
		int i,n=10;
		
		a1[0]=11;
		a1[1]=77;
		a1[2]=33;
		a1[3]=22;
		a1[4]=66;
		a1[5]=88;
		a1[6]=55;
		a1[7]=44;
		a1[8]=99;
		a1[9]=110;
		
		//Traversal Operation
		System.out.println("Elements of array are: ");
		for(i=0;i<n;i++)
		{
			System.out.println(a1[i]);
		}
	}
}