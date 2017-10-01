//Declared the class circle extends Figure class
public class Circle extends Figure {

	//Declared the variable of type double
    private final double radius;
	//Declared the variable of type double    
    final double pi = Math.PI;
    //Declared the constructor of class with 1 Parameter
    public Circle() {
        this(1);
    }   
    // Declared the constructor of class with 1 Parameter
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    //Overriding the Abstract method to find the area of Circle
    public void findArea() {
        
        super.dim1 =pi * Math.pow(radius, 2);
    }
    //Overriding the Abstract method to find the Perimeter of Circle
    public void findPerimeter() {
        super.dim1= 2 * pi * radius;
    }
}
