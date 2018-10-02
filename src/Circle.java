import java.awt.*;
import java.util.Scanner;

public class Circle extends Shape
{
    private int radius;
    public Circle(int radius)
    {
        //Detects if the input is a circle
        super("Circle");
        this.radius = radius;
        //input set as radius
    }

    @Override
    public double getArea()
    {
        //Multiplies the given radius by 3.14(rounded pi) by the radius.
        return (Math.PI*radius*radius);
    }

    @Override
    public double getPerimeter()
    {
        //Multiplies the rounded pi value by radius by 2.
        return (Math.PI*2*radius);
        //returns the value.
    }
}
