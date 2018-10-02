import java.awt.*;
import java.util.Scanner;

public class Circle extends Shape
{
    /*
    public static void main(String[] args)
    {
        int radius = 0;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        int output = s.nextInt();
        area = pi * output * output;
        System.out.println("The area of the circle is "+ area);
    }*/

    private int radius;

    public Circle(int radius)
    {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return (3.14*radius*radius);
    }

    @Override
    public double getPerimeter()
    {
        return (3.14*2*radius);
    }
}
