package date322;

public class BreakContinue {
	
	
	public static void main(String[] args) {
		
//inside a loop we can write continue and break.
		int i =6;
		while (i == 6) {
		switch (i) { 
		case 2:
			System.out.println("case 2");
			break;
		case 4:
			System.out.println("case 4");
			break;
		case 7:
			System.out.println("case 6");
			break;
		case 5:
			System.out.println("case 5");
			break;

		default:
			System.out.println("nothing found");
			break;
			//continue;
		}
	}
		
		for (i = 0; i < 10; i++) {
		if (i==9) {
			System.out.println(i);
			continue;
		}
		

		}

	

}
}
