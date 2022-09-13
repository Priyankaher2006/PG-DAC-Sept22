class P13{

public static void main(String args[]){
	
	for(char i=65;i<70;i++)//rows
	{
		for(char j=70-1;j>=i;j--)//space
		{
			System.out.print(" ");
			
		}
		for(int j=65;j<=i;j++)//star
		{
			System.out.print(" "+i);
			
		}
		
		System.out.println();
	}
	
	
} 
}
/*

      A
     B B
    C C C
   D D D D
  E E E E E

*/
