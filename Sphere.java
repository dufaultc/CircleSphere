// Programmer: Cameron Dufault
// Date: Feb 23 2017
// File: Sphere.java
// Description: This program creates the blueprint for a sphere object with inheritance from a circle object
public class Sphere extends Circle
{
    //new field for sphere- true means solid, false means hollow
    private boolean solid;

    //default contructor
    public Sphere ()
    {
	this.setRadius (5);
	this.setUnit ("cm");
	this.solid = true;
    } //sphere constructor 1

    //contrcutor's field set by client
    public Sphere (double radi, String unit, boolean solidState)
    {
	super (radi, unit); //calling the circle classes constructor
	this.solid = solidState;  //setting sphere specific field
    } //sphere constructor 2


    //mutator methods
    public boolean getSolid ()
    {
	return this.solid;
    } //getSolid method


    public void setSolid (boolean solidState)
    {
	this.solid = solidState;
    } //setSolid method


    //behavioural methods
    //this method calculates the surface area of the sphere
    public double area ()
    {
	double ar;
	ar = (4) * (PI) * (super.getRadius () * super.getRadius ()); //calculating area, PI is found in circle class along with the getRadius method
	return ar;
    } //area method

    //this method calculate the volume of the sphere
    public double volume ()
    {
	double vol;
	vol = (4 / 3) * PI * (Math.pow (super.getRadius (), 3)); //calculating volume, PI is found in circle class along with the getRadius method
	return vol;
    } //volume method


    //outputting method
    public String toString ()
    {
	String data = "Solid: " + this.solid + "\n";
	return data + super.toString (); //toString in circle class is accessed
    } //toString method
} //sphere class
