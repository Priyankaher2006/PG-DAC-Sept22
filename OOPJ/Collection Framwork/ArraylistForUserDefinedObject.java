import java.util.*;

class Student
{
	int roll;
	String name;
	double marks;

	Student()
	{
	}
	Student(int roll, String name, double marks)
	{
		this.roll = roll;
		this.name = name;
		this. marks = marks;
	}
	
	public String toString()//overriding toString() as it gives Clasname@hashCodeInHexFormat
	{
		return "Student[roll = " + roll + ", name = "+name + ", marks = " + marks + "]";
	}

	public int hashCode()//for unique hashcode
	{

		return (int) (roll+marks);
	}

	public boolean equals(Object ob)//for deep comparision
	{
		Student s = (Student) ob;
		if(s == null)
			return false;

		if(this.roll == s.roll && this.name.equals(s.name) && this.marks == s.marks)
			return true;
		else
			return false;

	}
	
}

class ArraylistForUserDefinedObject
{
	//Retrieving elementsof containr using Iterator
	public static void display(List<Student> mylist)
	{
		Iterator<Student> it = mylist.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println(s);
		}
	}

	public static void main(String args[])
	{
		List<Student> list1 = new ArrayList<Student>();
		//container object created(empty)
		Student s1 = new Student(1,"Rohit",75.0);
		//student obj reference given to s1 which then gets added in container whose ref is in list1
		list1.add(s1);

		list1.add(new Student(2,"Manish",65.0));
		//direct object refernce stored in container whose ref is in list1
		list1.add(new Student(3,"Geeta",72.0));

		list1.add(new Student(4,"Mohit",69.0));

		//Iterating using Iterator
		System.out.println("List1 elements: ");
		display(list1);	//this will give toString() value hence necessary to override it 

		List<Student> list2 = new ArrayList<Student>();
		list2.add(new Student(5,"Mahesh",56.0));
		list2.add(new Student(6,"Amisha",67.0));

		System.out.println("List2 elements: ");
		display(list2);

		//addAll() method.
		list1.addAll(list2);
		System.out.println("List1 elements after addAll list2 : ");
		display(list1);
		
		//contains() method
		boolean b = list1.contains(s1);	//Student s1 = new Student(1,"Rohit",75.0);
		System.out.println("list1.contains(s1) : " + b); //true

		Student s2 = new Student(1,"Rohit",75.0);	
		//s1 & s2 have same content but there refence are differnt so inernally shallow comparision happens with each obj as it didnt match it returns-false
		//for deep comparision we have to override equals() method 
		b = list1.contains(s2);
		System.out.println("list1.contains(s2) : " + b);	

		//remove() method
		list1.remove(s2);
		System.out.println("list1.remove(s2) : ");
		display(list1);

		b = list1.containsAll(list2);		//true;
		System.out.println("list1.containsAll(list2): " + b);
	}
}
