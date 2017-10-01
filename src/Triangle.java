//Declared the Class Triangle extends Figure Class
public class Triangle extends Figure{
	//Declared the variables of type double
    private final double a, b, c; // sides

    //Declared the constructor for class Triangle
    public Triangle() {
        this(1,1,1);
    }
    //Declared the constructor for class Triangle with 3 Parameter
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    //Overriding the Abstract method to find the area of triangle*
    public void findArea() {
        double s = (a + b + c) / 2;
        super.dim1=Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    //Overriding the Abstract method to find the area of triangle
    public void findPerimeter() {
        super.dim1= a + b + c;
    }
}
