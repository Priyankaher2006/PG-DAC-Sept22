// Java Program to Illustrate Use of All Features of Abstract Class

abstract class Base{ 
	Base(){
		System.out.println("Inside Base Constructor");
	}
	abstract void fun1(); 
	
	void fun2(){ 
		System.out.println("fun2 only belongs to Base and is not overriden");
	}
	
	final void fun3(){ 
		System.out.println("fun3 cannot be overriden in the Derived class");
	}
	
	static void fun4(){ 
		System.out.println("Static method fun4 of Base Class");
	}
	
	abstract void fun5();
	abstract void fun6();
}

abstract class Derived extends Base{ 
	
	Derived(){
		System.out.println("Inside Derived Constructor");
	}
	
	void fun1(){
		System.out.println("fun1 implementation");
	}
	
	static void fun4(){ // method hiding
		System.out.println("Static method fun4 of Derived Class");
	}
	
}

class DerivedClass extends Derived{ 
	void fun5(){
		System.out.println("fun5 implementation in DerivedsClass");
	}
	
	void fun6(){
		System.out.println("fun5 implementation in DerivedsClass");
	}
}

class CAO1{
	public static void main(String[] args){
		
		// Base b1 = new Base(); //  CE : Base is abstract; cannot be instantiated
		
		Derived d1 = new Derived();
		d1.fun1(); // fun1 implementation
		d1.fun2(); // fun2 only belongs to Base and is not overriden
		b2.fun4(); // Static method fun4 of Base Class*/
		
		Base b3 = new DerivedClass();
		b3.fun5();
		b3.fun6();
		
		
	}
}