class P7{

public static void main(String args[]){
	
	for(int i=1;i<=5;i++)//rows
	{
		for(int j=4;j>=i;j--)//space
		{
			System.out.print(" ");
			
		}
		for(int j=1;j<=i;j++)//star
		{
			System.out.print(" "+j);
			
		}
		
		System.out.println();
	}
	
	
} 
}
/*
     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5

*/
