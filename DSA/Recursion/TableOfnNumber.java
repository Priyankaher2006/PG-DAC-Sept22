import java.util.*;
 
class TableOfnNumber
{
	static void tab(int t,int n)
	{
		if(n==10)//base condition
			return;
		//print the table for current iteration
		System.out.println(t+" * "+n+" = "+t*n);
		//recursive call for next iteration
		tab(t,n+1);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
		tab(t,1);
	}
}