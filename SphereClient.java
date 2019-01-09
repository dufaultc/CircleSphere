// Programmer: Cameron Dufault
// Date: Feb 23 2017
// File: SphereCleint.java
// Description: This program generate spheres in text form and displays them to the user.

public class SphereClient
{
    public static void main (String[] args)
    {
	//setting variables on client side for 2nd sphere
	double radius = (Math.round (Math.random () * (10 - 1 + 1) + 1)); //random number between 1 and 10
	String unit = "Inches"; //the unit is inchess
	boolean solid = false; //the sphere is hollow

	//generating sphere objects
	Sphere sphere1 = new Sphere (); //properties set in blueprint
	Sphere sphere2 = new Sphere (radius, unit, solid); //properties set in client

	//outputting object details
	System.out.print ("First Sphere: \n" + sphere1 + "\nDiameter: " + sphere1.diameter () + sphere1.getUnit () + "\nCircumference: " + sphere1.circumference () + sphere1.getUnit () + "\nSurface Area: " + sphere1.area () + sphere1.getUnit () + "^2\nVolume: " + sphere1.volume () + sphere1.getUnit () + "^3\n\n");
	System.out.print ("Second Sphere: \n" + sphere2 + "\nDiameter: " + sphere2.diameter () + sphere2.getUnit () + "\nCircumference: " + sphere2.circumference () + sphere2.getUnit () + "\nSurface Area: " + sphere2.area () + sphere2.getUnit () + "^2\nVolume: " + sphere2.volume () + sphere2.getUnit () + "^3\n\n");

	//altering default sphere's radius and outputting details
	sphere1.setRadius (2);
	System.out.print ("Altered First Sphere: \n" + sphere1 + "\nDiameter: " + sphere1.diameter () + sphere1.getUnit () + "\nCircumference: " + sphere1.circumference () + sphere1.getUnit () + "\nSurface Area: " + sphere1.area () + sphere1.getUnit () + "^2\nVolume: " + sphere1.volume () + sphere1.getUnit () + "^3\n\n");

    } //main method
} //SphereClient Class
