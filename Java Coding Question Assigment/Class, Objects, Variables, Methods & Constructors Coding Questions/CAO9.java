//  Java Program to Implement the Passing and Returning Objects

class Demo{
	
	int x;
	
	Demo(){
		this.x = 10;
	}
	
	Demo(int val){
		this.x = val;
	}
	
	void modifyvalue(Demo d){
		this.x = this.x + d.x;
	}
	
	Demo valueMultiplied(Demo d){
		d.x = this.x * d.x;
		return d;
	}
}
class CAO9{

	public static void main(String[] args){
		
		Demo d1 = new Demo();
		Demo d2 = new Demo(25);
		System.out.println("Before change d1.x = " + d1.x);
		d1.modifyvalue(d2); 
		System.out.println("After change d1.x = " + d1.x);
		
		Demo d3 =  new Demo(30);
		Demo d4 = d3.valueMultiplied(d2); 
		
		System.out.println("d4.x : " + d4.x);
	}
}

