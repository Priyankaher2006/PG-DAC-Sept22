class P161
{
public static void main(String args[]){

	
	for(int i=1; i<=5; i++) 
	{
		for(int j=1; j<=(5-i); j++) 
		{
            System.out.print(" ");
        }
		for(int k=1; k<=i; k++) 
		{
            if( i==5|| k == 1 || k==i ) 
			{
                System.out.print("*");
            }
			else 
			{
                System.out.print(" ");
            }
        }
		System.out.println();
    }
}
}
/*

    *
   **
  * *
 *  *
*****

*/