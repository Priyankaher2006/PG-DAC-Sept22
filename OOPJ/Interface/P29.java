interface MyInterface1
{
	void fun1();
}

interface MyInterface2 extends MyInterface1
{                                              // between interface inheritance is possibale by using extenda keyword.
	void fun2();
}

interface MyInterface3 extends MyInterface2
{
	void fun3();
}

interface MyInterface4
{
	void fun4();
}

interface MyInterface5 extends MyInterface1,MyInterface4  // multiple inheritance
{ 
	void fun5();
}

class Demo implements MyInterface3    // this class have to implements 3 method
{  
	    public void fun1()
	{
		System.out.println("fun 1");
	}
		public void fun2()
	{
		System.out.println("fun 2");
	}
		public void fun3()
	{
		System.out.println("fun 3");
	}
}


class Demo1 implements MyInterface5{   
	    public void  fun1()
	{
		System.out.println("fun 1");
	}
		public void fun4()
	{
		System.out.println("fun 4");
	}
		public void fun5()
	{
		System.out.println("fun 5");
	}
}

class Demo2 implements MyInterface1,MyInterface4   // class can implements one or more than one interface
{
	    public void fun1()
	{
		System.out.println("fun 1");
	}
		public void  fun4()
	{
		System.out.println("fun 4");
	}
}

class Demo3 extends Demo implements MyInterface1,MyInterface4   // class only extends only one class but can implements one or more than one interface
{
			public void fun4()                      //1 4     123
	{
		System.out.println("fun 4");
	}
}

class P29{
	public static void main(String args[])
	{
		Demo d1= new Demo();
		d1.fun1();
		d1.fun2();
		d1.fun3();
		Demo1 d2 = new Demo1();
		d2.fun1();
		d2.fun4();
		//d2.fun5();
		Demo2 d3 = new Demo2();
		d3.fun1();
		d3.fun4();
		Demo3 d4 = new Demo3();
		d4.fun1();       //inherited from demo
		d4.fun2();       //inherited from demo
		d4.fun3();       //inherited from demo
		d4.fun4();
		
		MyInterface1 mi1= new Demo2();
		mi1.fun1();
		//mi1.fun4();    // it is giving error bec at compile time it will not find fun4 inside interface 1
		MyInterface4 mi2= new Demo2();
		//mi2.fun1();
		mi2.fun4();
		
		MyInterface5 mi3 = new Demo1();
		mi3.fun1();
		mi3.fun4();
		mi3.fun5();
		
		MyInterface1 mi4 = new Demo1();
		mi4.fun1();
		//mi4.fun4();   //error
		//mi4.fun5();  //error
		 
		MyInterface4 mi5 = new Demo1();
		//mi5.fun1();//error
		mi5.fun4();
		//mi5.fun5();//error
	}
	
}