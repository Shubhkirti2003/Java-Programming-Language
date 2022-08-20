import java.util.Scanner;
class Minutes
{
	public static void main(String[]args)
	{
		
		double min, year, mon, day;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter minutes: ");
		min=input.nextInt();
		year=min/(60*24*365);
		mon=min/(60*24*31);
		day=min/(60*24);
		System.out.println("Years "+year);
		System.out.println("Months "+mon);
		System.out.println("Days "+day);
	}
}
		