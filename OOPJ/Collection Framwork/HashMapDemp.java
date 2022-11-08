import java.util.*;

class Student
{
	int roll;
	String name;
	double marks;
	int age;
	Student()
	{
	}
	Student(int roll, String name, double marks, int age)
	{
		this.roll = roll;
		this.name = name;
		this. marks = marks;
		this.age = age;
	}
	
	public String toString()//overriding toString() as it gives Clasname@hashCodeInHexFormat
	{
		return "Student[roll = " + roll + ", name = "+name + ", marks = " + marks + ", age = "+ age + "]";
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
		//return this. name. compareTo(s.name) ;
	}
}



class HashMapDemp
{


	public static void main(String args[])
	{
		Map<Integer,Student> map1 = new HashMap<Integer,Student>();
		Student s1 = new Student(1,"Rohit",65.0,21);
		Student s2 = new Student(2,"Mohit",75.0,22);
		//add element to map
		map1.put(1,s1);
		map1.put(2,s2);
		map1.put(3,new Student(3,"Geeta",73.0,20));
		map1.put(4,new Student(4,"Sita",63.0,21));
		//Retrieve element from map
		Student s=map1.get(1);
		System.out.println(s);
			
		Set<Map.Entry<Integer,Student>> set1 = map1.entrySet();
		System.out.println("********************all elements of map*********************");
		for(Map.Entry<Integer,Student> en : set1)
		{
			System.out.println(en);
		}
		//getValue()
		System.out.println("*******************Only values*********************");
		for(Map.Entry<Integer,Student> en : set1)
		{
			System.out.println(en.getValue());
		}
		//getKey()
		System.out.println("***************Only keys************************");
		for(Map.Entry<Integer,Student> en : set1)
		{
			System.out.println(en.getKey());
		}
		//keySet() method
		System.out.println("**************Only keys using ketSet()****************");
		Set<Integer> kset1 = map1.keySet();
		for(Integer k : kset1)
		{
			System.out.println(k);
		}
		//values()
		System.out.println("**********Only values using value()*****************");
		Collection<Student> elements = map1.values();
		for(Student ss:elements)
		{
			System.out.println(ss);
		}
	}
}
