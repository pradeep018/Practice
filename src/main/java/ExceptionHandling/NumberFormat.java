package ExceptionHandling;

public class NumberFormat {

	public static void main(String[] args) {
		String S="121pradeep";
		int A=122;
		
		try {
		int i=Integer.parseInt(S);
		System.out.println(S+A);

	}
		/*finally {
			System.out.println("there is a exception");
		}*/
		catch(NumberFormatException e) {
		System.out.println("There is a numberformat exception");
		
		}
		
System.out.println(S+A);
		
		}

}
