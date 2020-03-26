package date322;

public class IfEalse {
	//how many if else you can write inside one if
	// how it will be execute
	
	public static void main(String[] args) {
		
		//null is not same as "null"
		String a = "null";
		
		//nested if else
		if (a == "null") {
			if (a.contains("null")) {
				System.out.println("zia");
				
			}if (a.contains("zia")) {
				System.out.println("mahmud");
				
			}
			
			
		}else {
			System.out.println("nothing found");
			
		}
		
		//normal if else
		//when the condition fulfill loop will break;
		
		if (a=="null") {
			System.out.println("First if block");
			
		} else if (a=="null") {
			System.out.println("second if block");
			
		} else if (a=="nul") {
			
			System.out.println("third if block");
		}else {
			System.out.println("nothing found");
			
		}
		
		
		
		
	}

}
