public class STriangle extends Shape {
    private int base;
    private int side1;
    private int side2;
    private int height;

    public STriangle (int base, int side1 , int side2, int height){
        super("STriangle");
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    @Override
    public double getArea(){
        return (base * height) * .5;
    }
    @Override
    public double getPerimeter(){
        return base + side1 + side2;
    }
}
