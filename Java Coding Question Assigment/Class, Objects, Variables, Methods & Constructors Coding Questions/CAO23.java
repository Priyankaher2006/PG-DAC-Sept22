// Java Program to Demonstrate Usage of a Static Variable in the Test Class

class CAO23{
	
	String name;
	int age;
	
	CAO23(){
		name = "";
		age = 0;
	}
	
	CAO23(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void printDetail(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	public static void main(String[] args){
		
		CAO23 obj1 = new P23("Ronak", 25);
		CAO23 obj2 = new P23("Rohan", 22);
		CAO23 obj3 = new P23("Harry", 16);	
		
		obj1.printDetail();
		obj2.printDetail();
		obj3.printDetail();
	}
	
}
