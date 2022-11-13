class Q16
{    
    public static void main(String args[]) //driver function
    {  
		for (int i=0; i<5; i++) //outer loop for number of rows(n)
        { 
			for (int j=5-i; j>1; j--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
            for (int j=0; j<=i; j++ ) //inner loop for number of columns
            { 
                System.out.print(" * "); //print star
            } 
  
            System.out.println(); //ending line after each row
        } 
		
		for (int i=2; i<7; i++) //outer loop for number of rows(n)
        { 
			for (int j=7-i; j>1; j--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
            for (int j=0; j<=i; j++ ) //inner loop for number of columns
            { 
                System.out.print(" * "); //print star
            } 
  
            System.out.println(); //ending line after each row
        }
		
		for (int i=4; i<9; i++) //outer loop for number of rows(n)
        { 
			for (int j=9-i; j>1; j--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
            for (int j=0; j<=i; j++ ) //inner loop for number of columns
            { 
                System.out.print(" * "); //print star
            } 
  
            System.out.println(); //ending line after each row
        }
		
		for (int i=6; i<12; i++) //outer loop for number of rows(n)
        { 
			for (int j=12-i; j>1; j--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
            for (int j=0; j<=i; j++ ) //inner loop for number of columns
            { 
                System.out.print(" * "); //print star
            } 
  
            System.out.println(); //ending line after each row
        }
		
		for (int i=6; i<12; i++) //outer loop for number of rows(n)
        { 
        for (int j=12-i; j>1; j--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
            for (int j=0; j<=i; j++ ) //inner loop for number of columns
            { 
                System.out.print(" * "); //print star
            } 
  
            System.out.println(); //ending line after each row
        }
		
		for (int i=0; i<4; i++) //outer loop for number of rows(n)
        { 
			for (int j=0; j<15; j++) //inner loop for spaces
			{ 
				System.out.print(" "); //print space
			} 
			for (int j=0; j<4; j++) //inner loop for spaces
			{ 
				System.out.print("*"); //print space
			} 
			System.out.println(); 
		}
    } 
}
/*
     *
    *  *
   *  *  *
  *  *  *  *
 *  *  *  *  *
     *  *  *
    *  *  *  *
   *  *  *  *  *
  *  *  *  *  *  *
 *  *  *  *  *  *  *
     *  *  *  *  *
    *  *  *  *  *  *
   *  *  *  *  *  *  *
  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *
      *  *  *  *  *  *  *
     *  *  *  *  *  *  *  *
    *  *  *  *  *  *  *  *  *
   *  *  *  *  *  *  *  *  *  *
  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *
      *  *  *  *  *  *  *
     *  *  *  *  *  *  *  *
    *  *  *  *  *  *  *  *  *
   *  *  *  *  *  *  *  *  *  *
  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *
               ****
               ****
               ****
               ****

*/