package date322;



enum EnumClass {
	
	
	HOME("Sweet home"),
	ADDRESS("nn"),
	NAME("ZIA"),
	ZIP(8);
	
	
		
	 String string;
	 int number;
	
	 
	EnumClass(String string){
		this.string = string;
		
	}
	EnumClass(int number){
		this.number = number;		
	}
	
	String getString() {
		return this.string;
	}
	
	int getNumber() {
		return this.number;
	}
	
	public static void main(String[] args) {
		
	}

}
