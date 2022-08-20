class Room
{
      int length;
      int breadth;
      Room(int x ,int y)
      {
            length =x;
            breadth= y;
      }
      int area()
      {
            return(length*breadth);
      }
}

class Bedroom extends Room // Inheriting Room
{
      int height;
      Bedroom(int x,int y, int z)
      {
      super(x,y); //pass value to super class
      height=z;
      }
      int volume()
      {
            return(length*breadth*height);
      }
}
class InherTest
{
      public static void main(String[]args)
      {
            Bedroom room1= new Bedroom(14,12,10);
            int area1= room1.area();
            int volume1=room1.volume();
            System.out.println("Area1="+area1);
            System.out.println("Volume1="+volume1);
      }
      
}
