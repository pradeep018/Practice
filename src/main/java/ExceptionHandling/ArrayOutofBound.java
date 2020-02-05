package ExceptionHandling;

public class ArrayOutofBound {

	public static void main(String[] args) {
		int A[]=new int[3];
		A[0]=10;
		A[1]=10;
		A[2]=10;
		try {
			A[3]=50;
			}
			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("there is a Array out of bound exception ");
				
			}
		
		System.out.println(A.length);
	}

}
