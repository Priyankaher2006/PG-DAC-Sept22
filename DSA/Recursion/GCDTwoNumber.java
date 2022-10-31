class GCDTwoNumber
{
	static int gcd(int a, int b) 
	{  
		//If both the number are equal
		if (a == b) 
			return a;
		
		/* If a is equal to zero then return b */
		else if (a == 0) 
			return b;

		/* If b is equal to zero then return a */
		else if (b == 0)
			return a;

		else if (a > b) 
			return gcd(a % b, b);//Recursive call
		else
			return gcd(a, b % a);//Recursive call
     }
 
     public static void main(String[] args) 
	 {
           int a = 105;
           int b = 91;
           System.out.println(gcd(a, b));
     }
 
}
