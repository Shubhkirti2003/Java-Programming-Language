class Shape
{
	public void display()
	{
		System.out.println("This is a shape.");
	}
}

class Circle extends Shape{
	public void display()
	{ 
		System.out.println("This is a circular shape.");
	}
}

class Rectangle extends Shape{
	public void display()
	{ 
		System.out.println("This is a rectangular shape.");
	}
}

class Square extends Rectangle{
	public void display()
	{ 
		System.out.println("Square is a rectangle.");
	}
}

public class Squaredemo{
	public static void main(String[] args)
	{
		Shape S= new Shape();
		S.display();
		Circle C= new Circle();
		C.display();
		Rectangle r= new Rectangle();
		r.display();
		Square Sq= new Square();
		Sq.display();
	}
	
}