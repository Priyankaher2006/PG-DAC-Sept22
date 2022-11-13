public class Q23
{
    public static void main(String args[])
    {                                                                      
        for(int i=1; i<=7; i++)
        {
            for(int j=1; j<=7; j++)
            {
                if(((i + j) % 2) == 0)
                System.out.print("1");
                else
                System.out.print("0");

            }
            System.out.println();
        }
        
    
    }
    
}

/*Output:

10101
01010
10101
01010
10101
  
 */ 
    

