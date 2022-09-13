class P10{

public static void main(String args[]){
	
	for(char i=70;i>=65;i--)//rows
	{
		for(char j=65;j<=i;j++)//space
		{
			System.out.print(" ");
			
		}
		for(char j=i;j<70;j++)//star
		{
			System.out.print(" "+j);
			
		}
		
		System.out.println();
	}	
} 
}
/*
      E
     D E
    C D E
   B C D E
  A B C D E
*/