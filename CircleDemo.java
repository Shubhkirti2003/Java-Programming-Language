class Circle
{
	int radius;
	float findArea()
	{
		float area;
		area=3.14*radius*radius;
		return area;
	}
	void displayArea()
	{
		System.out.println("Area= "+X);
	}
}

class CircleDemo
{
	public static void main(String [] args)
	{
		int X;
		Circle c = new Circle();
		c.radius=2;
		X=c.findArea();
		X=c.displayArea();
	}
}