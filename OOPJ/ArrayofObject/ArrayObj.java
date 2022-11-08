import java.util.*;

class Student
{
	int roll;
	double marks;
	
	Student()
	{}
	
	Student(int roll)
	{
		this.roll=roll;
		//this.marks=marks;
	}
	Student(double marks)
	{
		//this.roll=roll;
		this.marks=marks;
	}
	void printDetails()
	{
		System.out.println("Roll-"+roll+"\nMarks-"+marks);
	}
}
public class ArrayObj
{
	public static void main(String arg[])
	{
		System.out.println("Enter total number of Student");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Student stud[] = new Student[size]; //arrayobject reference created
		double max=0;
		double min=0;
		int maxroll=0,minroll=0;
		
		System.out.println("Enter details of "+size+" Student");
		System.out.println();
		System.out.println("Enter roll:-");
		for(int i=0; i<size;i++)
		{
			
			int r =sc.nextInt();
			//double m =sc.nextDouble();
			stud[i]= new Student(r);//object created
			//stud[i]= new Student(m);			
		}
		
		System.out.println("Enter Marks");
		for(int i=0; i<size;i++)
		{
			
			//int r =sc.nextInt();
			double m =sc.nextDouble();
			//stud[i]= new Student(r);
			stud[i]= new Student(m);
			if(m>max)
			{
				max=m;
				maxroll=i;
			}
			else if(min<m)
			{
				min=m;
				minroll=i;
			}
		}
		
		for(int i=0; i<size;i++)
		{
			stud[i].printDetails();
			System.out.println();
		}
		
		System.out.println("Max marks obtained by Rollno: "+maxroll+":"+max);
		System.out.println();
		System.out.println("Min marks obtained by Rollno: "+minroll+":"+min);
	}
}
/*

*/