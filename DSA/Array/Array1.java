class Array1
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
		
		//Search operation
		int key=66,j=0;
		for(j=0;j<=n;j++)
		{
			if(a1[j] == key)
			break;
		}
		if(a1[j] == key )
			System.out.println("Found "+key+" at "+j+" postion");
		else
			System.out.println("Not Found");
		
		//Deletion Operation
		int key1=22,k;
		for(j=0;j<=n;j++)
		{
			if(a1[j] == key1)
			break;
		}
		for(k=j;k<=n;k++)
		{
			a1[k] = a1[k+1];
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a1[i]);
		}
	}
}