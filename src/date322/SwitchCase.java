package date322;



public class SwitchCase {
	
		public void name() {
			String a = "zia";
			String b ="mahmud";
			//String ab="zia";
			

		//System.out.println(a);
			switch (b) {

			case "zia":
				System.out.println(a);
				System.out.println("case a executed");

				break;

			case "mahmud":
				System.out.println(a);
				System.out.println("case b executed");

				break;

			default:
				System.out.println("nothing found");
				break;
			}			

		}
//writing main method(... means [])
		 static public void main(String ... args) {
			 SwitchCase case1 = new SwitchCase();
			 case1.name();
		}
	}

