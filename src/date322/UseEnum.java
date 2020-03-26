package date322;


public class UseEnum {
	public static void main(String[] args) {
		
	EnumClass[] enum1 = EnumClass.values();
	
	// ==
	// && (and both side true)
	// || (or one side true)
	// : (boolean)
	
	
	for (EnumClass enum2 : enum1) {
		System.out.println(enum2.name());
		System.out.println(enum2.getString());
		System.out.println(enum2.getNumber());
		
	}
	
	}

}
