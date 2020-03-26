package date322;

public class ThreeDArray {
	public static void main(String[] args) {

		int [][][] roll = new int[2][2][2];

		roll[0][0][0] =12;
		roll[0][1][0]= 13;
		roll[0][1][1]= 14;

		roll[1][0][0]=17;
		roll[1][0][1]=15;
		roll[1][1][1]=16;

		roll[0][0][1]=18;
		roll[1][1][0]=19;



		System.out.println(roll.length);
		System.out.println(roll[0].length);
		System.out.println(roll[0][1].length);

		
		for (int i = 0; i < roll.length; i++) {
			for (int j = 0; j < roll[0].length; j++) {
				for (int j2 = 0; j2 < roll[0][1].length; j2++) {
					System.out.println(roll[i][j][j2]);
				}



			}


		}



	}

}
