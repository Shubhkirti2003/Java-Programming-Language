import java.util.*;
class Prac6Q3
{
 public static void main(String[] args) 
 {
  Area ob = new Area();
  ob.RectangleArea(4, 6);
  ob.SquareArea(4);
  ob.CircleArea(3);
 }
}

abstract class Shape
{
 abstract void RectangleArea(int length, int breadth);
 abstract void SquareArea(int side);
 abstract void CircleArea(int radius);
}

class Area extends Shape
{
 double area = 0.0;
 void RectangleArea(int length, int breadth)
 {
  area = length * breadth;
  System.out.println("Area of Rectangle is : " + area);
 }

 void SquareArea(int side)
 {
  area = side * side;
  System.out.println("Area of Square is : " + area);
 }

 void CircleArea(int radius)
 {
  area = 3.14 * radius * radius;
  System.out.println("Area of Circle is : " + area);
 }
}