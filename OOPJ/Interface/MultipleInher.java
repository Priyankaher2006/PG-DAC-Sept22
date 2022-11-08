interface A
{
 void display();
}
interface B
{
 void show();
}
class C implements A,B
{
	public void display()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("Welcome");
	}
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