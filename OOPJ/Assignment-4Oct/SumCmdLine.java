/*WAP in java to find sum of 2 numbers using command line argument*/

class SumCmdLine
{
	public static void main(String args[])
	{
		String a = args[0];
		String b = args[1];
		
		
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		
		int sum = i+j;
		
		System.out.println(sum);
		
	}
}