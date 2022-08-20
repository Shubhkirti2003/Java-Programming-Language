class Box
{
	double width;
	double height;
	double depth;
	double volume()
	{
		return width*height*depth;
	}
	Box()
	Box(double w, double h, double d)
	{
		this.width=w;
		this.height=h;
		this.depth=d;
	}
}
class Boxdemo3
{
	public static void main(String[] args)
	{
		Box mybox1=new Box(10,20,15);
		Box mybox2=new Box(3,6,9);
		Box mycube=new Box(7);
		double vol;
		vol=mybox1.volume();
		System.out.println("Volume 1 is "+vol);
		vol=mybox2.volume();
		System.out.println("Volume 2 is "+vol);
	}
}