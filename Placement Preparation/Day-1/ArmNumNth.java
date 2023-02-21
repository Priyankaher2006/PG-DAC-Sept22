//24. Write a Java Program to print Armstrong Numbersbetween 1 to 1000. 

class ArmNumNth{
	public static void main(String[] args)
   {
		//Scanner sc = new Scanner(System.in);
		int i=0;
		int num=0;
		
		System.out.println("Prime Numbers from 1 to 100");
		for (i = 1; i <= 100; i++)         
		{ 		  	  
			int count=0; 	  
			for(num =i; num>=1; num--)
			{
				if(i%num==0)
				{
					count = count + 1;
				}
			}
			if(count==2)
			{
				System.out.print(" "+i);
			}
		}
		
	}
}