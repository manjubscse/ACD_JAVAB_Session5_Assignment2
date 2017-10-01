// Declared the Class with main method 
public class FindAreaAndPerimeter {
	//Main method for class FindAreaAndPerimeter
	public static void main(String[] args) {

        // To find the area and perimeter of Rectangle
        double width = 5, length = 7;// Declared the variables of type double
        // Initializing the object figure class with rectangle constructor
        Figure rectangle = new Rectangle(width, length);
        //Display the Rectangle properties
        System.out.println("Rectangle width: " + width + " and length: " + length);
        // Calling method to find the area of rectangle
        rectangle.findArea();
        // Displaying the area of rectangle
        System.out.println("Resulting area: " + rectangle.dim1);
        // Calling method to find the perimeter of rectangle
        rectangle.findPerimeter();
        // Displaying the perimeter of rectangle
        System.out.println("Resulting perimeter: " + rectangle.dim1);
        //print the blank line 
        System.out.println();
        
        // To find the area and perimeter of Circle
        double radius = 5;
        // Initializing the object figure class with Circle constructor
        Figure circle = new Circle(radius);
        //Display the circle redius
        System.out.println("Circle radius: " + radius);
        //Calling method to find the area of Circle
        circle.findArea();
        // Displaying the area of Circle
        System.out.println("Resulting Area: " + circle.dim1 );
        // Calling method to find the perimeter of Circle
        circle.findPerimeter();
        // Displaying the perimeter of Circle
        System.out.println("Resulting Perimeter: " + circle.dim1);

        //print the blank line 
        System.out.println();
        
        // To find the area and perimeter of Triangle
        double a = 5, b = 3, c = 4;
        // Initializing the object figure class with Triangle constructor
        Figure triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c );
        //Calling method to find the area of Triangle
        triangle.findArea() ;
        // Displaying the area of Triangle
        System.out.println("Resulting Area: " + triangle.dim1);
        //Calling method to find the Perimeter of Triangle
        triangle.findPerimeter();
        // Displaying the perimeter of Triangle
        System.out.println("Resulting Perimeter: " + triangle.dim1);
    }
}
