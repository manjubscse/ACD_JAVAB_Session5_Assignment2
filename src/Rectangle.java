//Declared the Class Rectangle extends the figure class
public class Rectangle extends Figure {
	// Declared the variables of type double
    private final double width, length; //sides
    // Declared the constructor of rectangle class
    public Rectangle() {
        this(1,1);
    }
    
    //Declared the constructor with 2 Parameters
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    //Overriding the abstract method to find the area
    public void findArea() {
        super.dim1=width * length;
    }

    @Override
    //Overriding the abstract method to find the Perimeter
    public void findPerimeter() {
        // P = 2(w + l)
        super.dim1 =2 * (width + length);
    }
}
