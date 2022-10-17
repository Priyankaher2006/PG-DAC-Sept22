/*days between two dates*/
import java.util.*;

class DayCount
{
	public static void main(String args[])
	{
		int m[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int m1[]={31,29,31,30,31,30,31,31,30,31,30,31};
		String month[]={"jan","feb","mar","apr","may","jun","jul","aug","sept","oct","nov","dec"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date");
		int dd = sc.nextInt();
		System.out.println("Enter Month");
		int mm = sc.nextInt();
		System.out.println("Enter year Year");
		int yy = sc.nextInt();
		System.out.println("Enter number of days");
		int day = sc.nextInt();
		
		if(yy%4==0 && yy%100!=0 || yy%400==0)
		{
			while(day>=366)        
			{	
				yy++;
				day=day-366;  
				System.out.print(yy);	
			}
			
			for(int i=0;i<12;i++) 
			{
				if(day>=m1[i])         
				{	
					day=day-m1[i];   
					mm++; 
						
				}	
			}
			System.out.print("/"+month[mm-1]);
			dd=day;
			System.out.println("/"+dd);	
		}
		else
		{
			while(day>=365)        
			{	
				yy++;
				day=day-365;
				System.out.print(" "+yy);	
			}
			for(int i=0;i<12;i++) 
			{
				if(day>=m[i])         
				{	
					day=day-m[i];   
					mm++;
					if(mm>12)
					{
						mm=0;
					}
				}	
			}
			System.out.print(" "+month[mm-1]);
			dd=day;
			System.out.println(" "+dd);	
		}
	}
}
