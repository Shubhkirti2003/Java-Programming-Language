class Rectangle
{
	int length, breadth;
	void get_Data(int X, int Y)
	{
		length=X;
		breadth=Y;
	}
	int RectArea()
	{
		int area=length*breadth;
		return(area);
	}
}

class RectArea
{
	public static void main(String [] args)
	{
		int area1, area2;
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		rect1.length=15;
		rect1.breadth=10;
		area1=rect1.length*rect1.breadth;
		rect2.get_Data(20,12);
		area2=rect2.RectArea();
		System.out.println("Area 1= "+area1);
		System.out.println("Area 2= "+area2);

	}
}