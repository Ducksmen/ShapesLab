public class Runner {
    public static  void main(String[] args)
    {
        Shape shape1 = new Hexagon(10);

        Shape[] shapes = {shape1};

        for (Shape cur : shapes)
        {
            System.out.println(cur);
            System.out.println("My area is: " + cur.getArea());
            System.out.println("My Perimeter is: " + cur.getPerimeter());
        }
    }

}
