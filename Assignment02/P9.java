class P9{
public static void main(String args[]){

	
	for(char k=65; k<70; k++)   
	{   
		
		for(char j=70;j>=k;j--)//space
		{
			System.out.print(" ");
			
		}
		
	  for(char l=65; l<=k; l++)   
	  {   
		System.out.print(" "+l);
	  } 
	System.out.println();
	} 
		
}
}
/*
       A
      A B
     A B C
    A B C D
   A B C D E
*/