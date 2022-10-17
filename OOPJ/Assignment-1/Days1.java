import java.util.*;

class Days1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of days..");
		int d=sc.nextInt();
		int m[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int yy=0;
		int mm=0;
		int dd=0;
		while(d>=365)           //481....-365.......116
		{	
			yy++;
			d=d-365;        //116
		}	
		for(int i=0;i<12;i++) //  i=0 ,1,2,3
		{
			if(d>=m[i])         //116>31...85-28....57....
			{	
				d=d-m[i];   //116-31...85...57...26
				mm++;       //1 ,2 ,3    
			}	
		}	
		
		dd=d;
		
		System.out.println("No. of Years = "+yy);
		System.out.println("No. of Months= "+mm);
		System.out.println("No. of Days= "+dd);	

		
	}
	
}