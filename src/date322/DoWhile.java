package date322;

public class DoWhile {
	
	public static void main(String[] args) {
		String  a;
		
		do {
			a ="null";
			
			 System.out.println(a);
			 break;
			
		} while (a.contains("null"));
			
		while (a.contains("null")) {
			System.out.println("while loop");
			break;
			
		}
		
		int i = 0;
		do {
		  System.out.println(i);
		  i++;
		}
		while (i < 5);
		
		
		
}
	}
