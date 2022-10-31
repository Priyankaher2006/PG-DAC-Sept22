class Recursive6
{
	static void display(String str, String res)
	{
		System.out.println(" start "+str.length());
		if(str.length()==0)
		{
			System.out.println(" res= "+res);
		}
		for(int i=0; i<str.length();i++)
		{
			System.out.print("  i= "+i);
			char r1 = str.charAt(i);
			System.out.print("  r1= "+r1);
			String r2 = str.substring(0,i)+ str.substring(i+1);
			System.out.print("  r2= "+r2);
			
			display(r2,res+r1);
		}
		System.out.println("stop");
	}
	public static void main(String args[])
	{
		String s= "ABC";
		display(s," ");
	}
}