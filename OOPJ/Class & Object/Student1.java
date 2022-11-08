class Student1
{
	int rollNo;
	int age;
	double marks;
	void setDetails(int rollNo, int age, double marks)
	{
		this.rollNo=rollNo;
		this.age=age;
		this.marks=marks;
	}
	void printDetails()
	{
		System.out.println(rollNo+","+age+","+marks);
	}
	public static void main(String args[])
	{
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		s1.setDetails(1,20,89.9);
		s1.printDetails();
		s2.setDetails(1,21,80.9);
		s2.printDetails();
	}
}