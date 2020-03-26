package date322;

public class ArrayClass {
	public static void main(String[] args) {
		
		int [] roll = {12,13,15,16};
		
		
		for (int i = 0; i < roll.length; i++) {
			
		System.out.println(roll[i]);	
		
		}
		
		System.out.println("outside of for loop: "+roll[0]);
		
		
		int [] value = new int[6];
		
		value[0] =12;
		value[1] =13;
		value[2] =14;
		value[3] =15;
		value[4] =16;
		value[5] =17;
		
		System.out.println(value[5]);
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
		}
		
		
	}

}
