import java.io.IOException;

public class Exceptions{
	static void ioException() throws IOException{ 
		throw new IOException ();
	} 
	static void illegalArgument() throws IllegalArgumentException{ 
		throw new IllegalArgumentException ();
	}
	public static void main(String[] args){
		int num1 = 1, num2 = 0; 
		int[] arr = new int[2];

		try{
			num1=num1/num2;
			System.out.println (num1);

			illegalArgument();
		}
		catch (ArithmeticException ae){ 
			System.out.println ("Arithmetic Exception occurred");
		}
		try{
			System.out.println (arr[3]);
		} catch (ArrayIndexOutOfBoundsException ai){ 
			System.out.println ("Array Index out of bound Exception occurred");
		}
		try{
			int x= Integer.parseInt("hello"); 
			System.out.println (x);
		}
		catch (NumberFormatException nf){
			System.out.println ("Number Format Exception occurred");
		}
		try{
			System.out.println (arr[3]);
		} catch (ArrayIndexOutOfBoundsException ai){ 
			System.out.println ("Array Index out of bound Exception occurred");
		}
		try{
			int x= Integer.parseInt("hello"); 
			System.out.println (x);
		}
		catch (NumberFormatException nf){ 
			System.out.println ("Number Format Exception occurred");
		}
		try{
			String s = null;
			System.out.println (s.charAt(5));
		}
		catch (NullPointerException np){
			System.out.println ("Null Pointer Exception occurred");
		}
		try{
			ioException();
		}
		catch (IOException ioException){
			System.out.println ("10 Exception occurred");
		}
		try{
			illegalArgument ();
		}catch (IllegalArgumentException ia){
			System.out.println ("Illegal Argument Exception occurred");
		}
	}
}