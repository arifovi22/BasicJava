package date322;

public class MethidOverLoading {
	
	
	public static void main(String[] args) {
		city("nyc", 1121);
		city();
		city("Nyc");
	}
	
	public static void city() {		
		System.out.println("NO city");

	}
	
	//overloading
	public static void city(String name) {		
		System.out.println(name);

	}

	//overloading
	public static void city(String name, int zeepCode ) {

		System.out.println(name);
		System.out.println(zeepCode);

	}


}
