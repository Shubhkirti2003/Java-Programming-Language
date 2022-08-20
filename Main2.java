import java.util.Scanner;
class CheckArgumentException extends Exception {
	public CheckArgumentException(String s)
	{
		super(s);
	}
}
public class Main2 {
	public static void main(String args[])
	{
		int x;
		int count = 0;
		int n=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the arguments:-");
		for(int i=0; i<5; i++)
		{
			x=input.nextInt();
			n=n+1;
			count=count+x;
		}
		if (n!=5){
			try {
				throw new CheckArgumentException("Number of arguments should not be less than 5.");
			}
			catch (CheckArgumentException ex) {
				System.out.println(ex.getMessage());
			}
		}
		else{
			System.out.println("Sum of the numbers:"+count);
		}
	}
}
