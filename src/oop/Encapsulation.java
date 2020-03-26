package oop;


public class Encapsulation {
	//private can access only inside the class and innerclass
	//default can access only inside the package
	//protected can access only inside the package
	
	
	private int roll;
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	//default
	void zip(){
		System.out.println("I am inside Encapsulation");
	}
	
	//Private
	private void address() {
		System.out.println("My address is private");
	}
	
	
	//protected
	protected void home() {
		System.out.println("My Sweet Home");
		
	}


	static class Innerclass{
		public static void main(String[] args) {
			Encapsulation capsulation = new Encapsulation();
			capsulation.setRoll(22);
			System.out.println(capsulation.getRoll());
			capsulation.zip();
			capsulation.address();
			capsulation.home();
			
			
		System.out.println("Encapsulation: "+capsulation.roll);
			
		}
		
	}
}



