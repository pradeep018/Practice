package ExceptionHandling;

public class Arithmetic {

	public static void main(String[] args) {
		int A=10;
		int B;
		try {
		B =A/0;
			}
		/*finally {
			System.out.println("Arithmetic Exception Skipped");
		}*/
		catch(ArithmeticException e) {
			System.out.println("There is a Arithmetic Exception");
		}
		
		
		
	}

}
