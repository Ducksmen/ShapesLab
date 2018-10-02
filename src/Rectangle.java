public class Rectangle extends Shape{
    private int height;
    private int width;

    /**
     * refers to the fields by using this.
     * uses super to refer to parent class
     * @param height
     * @param width
     */
    public Rectangle(int height, int width)
    {
        super("Rectangle");
        this.height = height;
        this.width = width;
    }

    /**
     * fields width and height
     * @return Area by multiplying
     */

    public double getArea()
    {
        return width * height;
    }

    /**
     * width
     * height
     * @return perimeter by adding
     */
    public double getPerimeter()
    {
        return(width + width + height + height);
    }
}
