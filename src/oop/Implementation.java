package oop;


//Inheritance
public class Implementation extends Abstract {
	
	
	
	public static void main(String[] args) {
		
		//Polymorphism
		
		Abstract obj = new Implementation();
		Implementation bbb= new Implementation ();
		
		obj.name();
		obj.address();
		
		bbb.zip();
		
		Interface.roll();
		
	}
	
	//byte,bit,int,double,long

	//Polymorphism
	@Override
	public void name() {
		
		System.out.println("I am implemented in class");
		
	}

	@Override
	public void address() {
		System.out.println("I am implemented in class");
		
		
	}
	
	public void zip() {
		System.out.println("I am implemented in class");
		
	}
	
	
	

}
