/*What was the day of the week on 29th feb, 2012*/
import java.util.Scanner;

class FromToday
{
	public static void main(String args[])
	{
		String day[]={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date");
		int dd = sc.nextInt();
		System.out.println("Enter Month");
		int mm = sc.nextInt();
		System.out.println("Enter year Year");
		int yy = sc.nextInt();
		int ny=0,ld,Qu,nm=0;
		//System.out.println(dd+" "+mm+" "+yy);
		
		if(yy >= 0)
		{
			if( yy>=1600 && yy<=1699)
			{
				ny=6;
			}
			else if( yy>=1700 && yy<=1799)
			{
				ny=4;
			}
			else if( yy>=1800 && yy<=1899)
			{
				ny=2;
			}
			else if( yy>=1900 && yy<=1999)
			{
				ny=0;
			}
			else if( yy>=2000 && yy<=2099)
			{
				ny=6;
			}
		}
		
		
		if(mm >0)
		{
			if(mm == 1)
			{
				nm=0;
			}
			else if(mm == 2)
			{
				nm=3;
			}
			else if(mm == 3)
			{
				nm=3;
			}
			else if(mm == 4)
			{
				nm=6;
			}
			else if(mm == 5)
			{
				nm=1;
			}
			else if(mm == 6)
			{
				nm=4;
			}
			else if(mm == 7)
			{
				nm=6;
			}
			else if(mm == 8)
			{
				nm=2;
			}
			else if(mm == 9)
			{
				nm=5;
			}
			else if(mm == 10)
			{
				nm=0;
			}
			else if(mm == 11)
			{
				nm=3;
			}
			else if(mm == 12)
			{
				nm=5;
			}
		}
		
		//last 2 digit of year
		ld = yy%100;
		
		Qu = ld/4;
		
		int add= (ld + Qu + dd + ny + nm);
		
		int div=(add%7);
		
		int fd;
		if(yy%4==0 && yy%100!=0 || yy%400==0)
		{
			if(mm==1 & mm==2);
			{
				fd=div-1;
				System.out.println(" the day of the week "+day[fd]);
			}
		}
		else 
		{
			fd=div;
			System.out.println(" the day of the week "+day[fd]);
		}	
		
		
	}
}