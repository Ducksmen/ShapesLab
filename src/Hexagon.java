public class Hexagon extends Shape
{
    private int side;

    /**
     * Super clarifies the type of shape.
     * @param side The length of the side of the hexagon.
     */
    public Hexagon(int side)
    {
        super("Hexagon");
        this.side = side;
    }

    /**
     * Returns the area of the hexagon
     * @return Returns (3 *(the square root of 3) / 2 ) * (side squared)
     */
    @Override
    public double getArea()
    {
        return ((3*Math.sqrt(3))/2) * (side * side);
    }

    /**
     * Returns the perimeter of the hexagon
     * @return Returns side * 6
     */
    @Override
    public  double getPerimeter()
    {
        return side*6;
    }
}
