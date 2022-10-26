import java.util.Scanner;

public class StudentDemo
{
    String name;
    int sub1;
    int sub2;
    int sub3;
    double total;
    double avg;
    
    public void assign() 
	{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = in.nextLine();
        System.out.print("Enter marks in Sub1: ");
        sub1 = in.nextInt();
        System.out.print("Enter marks in Sub2: ");
        sub2 = in.nextInt();
        System.out.print("Enter marks in Sub3: ");
        sub3 = in.nextInt();
    }
    
    public void calculate() 
	{
        total = sub1 + sub2 + sub3;
        avg = total / 3.0;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks in English: " + sub1);
        System.out.println("Marks in Hindi: " + sub2);
        System.out.println("Marks in Maths: " + sub3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
    
    public static void main(String args[]) {
        StudentDemo s1 = new StudentDemo();
		Scanner sc= new Scanner(System.in);
		int ch='y';
		while(ch=='y')
		{
			s1.assign();
			s1.calculate();
			s1.display();
			//break;
			System.out.println("Do you want to continue? (y/n): ");
			ch=sc.next().charAt(0);
		}
		
    }
}