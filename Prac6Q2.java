import java.util.*;
class Prac6Q2
{
 public static void main(String[] args)
 {
  Circle obj = new Circle(4.0);
  System.out.println("Perimeter of Circle when radius of circle is 4.0");
  System.out.println(obj.getPerimeter());
  System.out.println("Area of Circle when radius of circle is 4.0");
  System.out.println(obj.getArea());

  ResizableCircle obj1 = new ResizableCircle(4.0);
  System.out.println("Area of Circle when radius of circle is 4.0");
  System.out.println(obj1.getArea());
  System.out.println("Increased by 20%");
  obj1.resize(20);
  System.out.println("Area of Circle when radius of circle is 4.0 and Increased by 20%");
  System.out.println(obj1.getArea());
 }
}

class Circle implements GeometricOfObjects
{
 double radius = 1.0;
 Circle(double radius)
 {
  this.radius = radius;
 }
 public double getPerimeter()
 {
  return 2 * 3.14 * radius;
 }
 public double getArea()
 {
  return 3.14 * radius * radius;
 }
}

class ResizableCircle extends Circle implements Resizable
{
 ResizableCircle(double radius)
 {
  super(radius);
 }
 public void resize(int percent)
 {
  super.radius = super.radius + (super.radius * ((double)percent / 100));
 }
}

interface GeometricOfObjects
{
 double getPerimeter();
 double getArea();
}

interface Resizable
{
 void resize(int percent); 
}