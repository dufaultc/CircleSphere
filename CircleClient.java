import java.io.*;
public class CircleClient
{
    public static void main (String[] args) throws IOException
    {
	BufferedReader kbi = new BufferedReader (new InputStreamReader (System.in));
 
	System.out.println("Please enter the radius of the circle: "); 
	double r = Double.parseDouble (kbi.readLine ());
	System.out.println("Please enter the unit the radius is in: ");
	String u = kbi.readLine ();

	Circle circle1 = new Circle ();
	Circle circle2 = new Circle (r, u);
	
	System.out.println (circle1);
	System.out.println ("Diameter of a circle with a 5.0 cm radius is: " + circle1.diameter() + circle1.getUnit());
	System.out.println ("Circumference of a circle with a 5.0 cm radius is: " + circle1.circumference() + circle1.getUnit());
	System.out.println ("Area of a circle with a 5.0 cm radius is: " + circle1.area() + circle1.getUnit());
	
	System.out.println ("");
     
	System.out.println (circle2);
	 System.out.println ("Diameter of the entered circle is: " + circle2.diameter() + circle2.getUnit());
	System.out.println ("Circumference of the entered circle is: " + circle2.circumference() + circle2.getUnit());
	System.out.println ("Area of the entered circle is: " + circle2.area() + circle1.getUnit() + "^2");
	
	
	
    } //main method
} //CircleClient Class
