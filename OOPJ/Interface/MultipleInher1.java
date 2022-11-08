interface MyInterface1
{
	void fun1();
}
interface MyInterface2
{
	void fun1();
	void fun2();
}
class A implements MyInterface1
{
	void fun1()
	{
		//code
	}
}
class B extends A implements MyInterface1, MyInterface2   //OK
{
	//This class will have to implement two methods - fun1() and fun2();
}
class MultipleInher
{
	public static void main(String args[])
	{
		C obj = new C();
		obj.display();
		obj.show();
	}
}

class B extends A implements MyInterface1, MyInterface2 		//OK

class B implements MyInterface1 extends A			//ERROR

class C extends A, B						//ERROR

interface MyInterface3 extends MyInterface1, MyInterface2	//OK

class B implements MyInterface1, MyInterface2 extends A		//ERROR

interface MyInterface2 implements MyInterface1			//ERROR

class B implements MyInterface1					//OK

class B extends A						//OK

class B extends A implements MyInterface1			//OK
