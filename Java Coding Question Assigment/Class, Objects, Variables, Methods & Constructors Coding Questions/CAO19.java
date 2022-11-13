// Java Program to Create an Object for Class and Assign Value in the Object using Constructor

class Student{
	
	private String name;
	private int rollNo;
	
	Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public void printDetails(){
		System.out.println("Roll No: " + rollNo + " Name: " + name);
	}
	
}

class CAO19{
	public static void main(String args[]){
		
		Student stud1 = new Student("PRIYADARSHINI", 1);
		Student stud2 = new Student("PRIYANKA", 2);
		Student stud3 = new Student("PRATIKSHA", 3);
		
		stud1.printDetails();
		stud2.printDetails();
		stud3.printDetails();
		
		
	}
}
