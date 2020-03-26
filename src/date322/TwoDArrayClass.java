package date322;


public class TwoDArrayClass {
	public static void main(String[] args) {
		
		int [][] roll = new int[2][3];
		
		roll[0][0] =12;
		roll[0][1]= 13;
		roll[0][2]= 14;
		
		roll[1][0]=15;
		roll[1][1]=16;
		roll[1][2]=17;
		
		
		System.out.println(roll.length);
		System.out.println(roll[0].length);
	
		
		for (int i = 0; i < roll.length; i++) {
			for (int j = 0; j < roll[0].length; j++) {
				
					System.out.println(roll[i][j]);
				
				
				
				
			}
			
		
		}
		
		
		
	}

}
