class Student
{
	int rollNo;
	int age;
	double marks;
	
	void printDetails()
	{
		System.out.println(rollNo+","+age+","+marks);
	}
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.rollNo = 1;
		s1.age = 20;
		s1.marks = 75.5;
		s1.printDetails();
		
		Student s2 = new Student();
		s2.rollNo = 2;
		s2.age = 21;
		s2.marks = 70.5;
		s2.printDetails();
	}
}