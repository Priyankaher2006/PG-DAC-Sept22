public class Q20
{
    public static void main(String args[])
    {                                                                      
        for(int i=1; i<=7; i++)
        {
            for(int j=1; j<=i-1; j++)
            {
                System.out.print(" ");

            }
            for(int k=i; k<=7; k++)
            {
                
                System.out.print(k);

            }
            
            System.out.println();
        }
        
        for(int i=7; i>=2; i--)
        {    
            for(int m=i-1; m>1; m--)
            {
                System.out.print(" ");
            }
            for(int k=i-1; k<=7; k++)
            {
                
                System.out.print(k);

            }
            System.out.println();
        }
    }
    
}

/*Output:

1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567 
  
 */
