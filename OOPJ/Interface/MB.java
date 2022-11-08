interface A
{
 void display();
}

class B implements A
{
 public void display()
 {
 System.out.println("Hello");
 }
}

class MB
{
 public static void main(String args[])
 {
 B obj = new B();
 obj.display();
}
}
