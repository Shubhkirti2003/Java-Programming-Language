class Nesting
{ 
	int m, n;
	Nesting (int X, int Y) // Constructor
	{
		m=X;
		n=Y;
	}
	int largest ()
	{
		if (m>=n)
			return m;
		else 
			return n;
	}
	void display()
	{
		int large = largest (); // calling a method
		System.out.println("Largest value = " + large);
	}
}

class NestingTest{
	public static void main(String []args)
	{
		Nesting nest = new Nesting(50,40);
		nest.display ();
	}
}
