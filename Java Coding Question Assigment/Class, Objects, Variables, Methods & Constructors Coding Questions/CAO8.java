//  Java Program to Count Number of Objects Created for Class

class Demo{
	
	static int count; 
	
	Demo(){
		count++;
	}
	
}
class CAO8{

	public static void main(String[] args){
		
		new Demo();
		new Demo();
		new Demo();	
		
		System.out.println("Number of Demo Objects created is: " + Demo.count);
	}
}
