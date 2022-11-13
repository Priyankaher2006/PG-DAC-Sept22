//  Java Program to Illustrate the Use of HashCode() Method

class Demo{
	
	int x;
	
	Demo() { }
	
	Demo(int x){
		this.x = x;
	}
	
	public int hashCode(){
		return x;
	}
	
	public boolean equals(Object obj){
		Demo d = (Demo)obj;
		if(this.x == d.x){
			return true;
		}
		return false;
	}

}
class CAO15{

	public static void main(String[] args){
		
		Demo d1 = new Demo(10);
		Demo d2 = new Demo(10);
		Demo d3 = new Demo(7);
		
		
		//  Deep Comparision
		System.out.println("d1.equals(d2) : " + (d1.equals(d2))); // true
		System.out.println("d1.equals(d3) : " + (d1.equals(d3))); // true
		
		
		// equal objects must have the same hashCode()
		System.out.println("d1.hashCode(): " + d1.hashCode()); 
		System.out.println("d2.hashCode(): " + d2.hashCode()); 
		System.out.println("d3.hashCode(): " + d3.hashCode()); 
	
	}
}

