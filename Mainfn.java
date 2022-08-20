import java.util.Scanner;
class CheckArgumentException extends Exception{
	public CheckArgumentException(String s)
	{
		super(s);
	}
}
public class Mainfn {
	public static void main(String args[])
	{
		int [] arguments;
		int n;
		int x;
		int count = 0;
		arguments=new int[5];
		for(int i=0;i<5;i++)
		{
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the argument: ");
			n=input.nextInt();
			arguments[i]=n;
			count=count+1;
		}
		System.out.println(" "+);
		if (x!=4){
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
