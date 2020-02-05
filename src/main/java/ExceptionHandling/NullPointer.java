package ExceptionHandling;

public class NullPointer {
	int A=10;
	public static void main(String[] args) {
		NullPointer X=new NullPointer();
		try {
		X=null;
		System.out.println(X.A);
		}
		catch(NullPointerException e) {
			System.out.println("There is a nullpointer exception'");
		}
		
		System.out.println("Next tect executed");

	}

}
