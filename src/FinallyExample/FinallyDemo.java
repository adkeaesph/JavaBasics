package FinallyExample;

public class FinallyDemo {

	/*
	 * returns the number itself if Number
	 */
	public static String isNumber(String number) {
		Integer num = null;
		try {
			num = Integer.parseInt(number);
			return num.toString();
		} catch (NumberFormatException exception) {
			return "inside catch";
		} finally {
			//return "inside finally";
		}
		
	}
	
	public static void isNumber2(String number) {
		Integer num = null;
		try {
			num = Integer.parseInt(number);
			System.out.println(num);
			System.exit(0);
		} catch (NumberFormatException exception) {
			System.err.println("Not a number");
			System.exit(1);
		} finally {
			System.out.println("inside finally");
			System.exit(2);
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(isNumber("123"));
		System.out.println(isNumber("abcd"));
		
		//Thread.sleep(2000);
		//isNumber2("123");
		isNumber2("abcd");
	}

}
