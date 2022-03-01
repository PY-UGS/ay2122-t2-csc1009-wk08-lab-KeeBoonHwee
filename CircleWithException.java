import java.util.*;
import java.lang.Math;

class CircleWithException
{
    private double radius;
    private static final double maxRadius = Math.sqrt(1000.0 / Math.PI);
    public CircleWithException(double radius) throws Exception
    {
        if(radius < 0)
            {throw new IllegalArgumentException("No negative radius is allowed");} 
        if(radius > CircleWithException.maxRadius)
            {throw new Exception("Radius with area greater than 1000 is not allowed");} 
        this.radius = radius;
    }
    //  Design the method to set the radius of the circle.
    public void setRadius(double radius) throws Exception
    {
        if(radius < 0.0)
            {throw new IllegalArgumentException("No negative radius is allowed");} 
        if(radius > CircleWithException.maxRadius)
            {throw new Exception("Radius with area greater than 1000 is not allowed");} 
        this.radius = radius;
    }
    // Design the method to get the radius of the circle
    public double getRadius()
    {
        return this.radius;
    }

    // Design the method to get the area of the circle
    public double getArea()
    {
        return (Math.PI * this.radius * this.radius);
    }
    // Design the method to get the diameter of the circle
    public double getDiameter()
    {
        return (2.0 * Math.PI * this.radius);
    }
    public static void main(String[] args)
    {
        try
        {
            Scanner input = new Scanner(System.in);
            CircleWithException circle = null;
            System.out.println("Please input radius of circle : ");
            double radius = input.nextDouble();
            circle = new CircleWithException(radius);
            System.out.println("Radius of circle is : " + circle.getRadius() );
            System.out.println("Area of circle is : " + circle.getArea() );
            System.out.println("Diameter of circle is : " + circle.getDiameter() );
            System.out.println("You may amend radius of circle, please input new radius : ");
            radius = input.nextDouble();
            circle.setRadius(radius);
            System.out.println("Radius of circle is : " + circle.getRadius() );
            System.out.println("Area of circle is : " + circle.getArea() );
            System.out.println("Diameter of circle is : " + circle.getDiameter() );
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
// javac CircleWithException.java
// java  CircleWithException