class Student
{
	String name;
	int roll_number;
}

class Main
{
	public static void main(String [] args)
	{
		Student S1= new Student();
		S1.name="John";
		S1.roll_number=2;
		System.out.println("Name is: "+ S1.name);
		System.out.println("Roll Number is: "+ S1.roll_number);
	}
}