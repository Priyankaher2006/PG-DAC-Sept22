class P8{

public static void main(String args[]){
	
	for(int i=5;i>=1;i--)//rows
	{
		for(int j=1;j<=i;j++)//space
		{
			System.out.print(" ");
			
		}
		for(int j=i;j<=5;j++)//star
		{
			System.out.print(" "+j);
			
		}
		
		System.out.println();
	}
	
	
} 
}
/*
      5
     4 5
    3 4 5
   2 3 4 5
  1 2 3 4 5
*/
