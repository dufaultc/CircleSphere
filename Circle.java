// Programmer: Cameron Dufault
// Date: Feb 21 2017
// File: Circle.java
// Description: This program creates the blueprint for a circle object

public class Circle
{
    private double radius; //the radius of the circle object
    private String unit; //the unit of the radius

    public final double PI = 3.14159; //constant used in circle calculations

    //constructor methods/////////////////////////////
    public Circle ()
    {
	this.radius = 5;
	this.unit = "cm";

    } //Circle Constructor 1


    public Circle (double rad, String un)
    {
	this.radius = rad;
	this.unit = un;
    } //Circle Constructor 2


    //mutator methods//////////////////////////////alow the user to retrieve and manipulate the information about the objects
    public double getRadius ()
    {
	return this.radius;
    } //getRadius


    public String getUnit ()
    {
	return this.unit;
    } //getUnit


    public void setRadius (double radius)
    {
	this.radius = radius;
    } //setRadius


    public void setUnit (String unit)
    {
	this.unit = unit;
    } //setUnit


    //behavioural methods/////////////////////////

    //this method calculates the circumference of the circle object
    public double circumference ()
    {
	double circum; //varibale to hold curcumference value

	circum = ((this.radius) * 2) * PI; //calcualting circumfere


	return circum;
    } //circumference method


    //this method calculates the diameter of the circle object
    public double diameter ()
    {
	double diam; //varibale to hold diameter value

	diam = (this.radius) * 2; //calcualting diameter

	return diam;
    } //diameter method


    //this method calculates the area of the circle object
    public double area ()
    {
	double ar; //varibale to hold area value

	ar = (PI) * ((this.radius) * (this.radius)); //calcualting area


	return ar;
    } //area


    /////////////////////////////////////////////////////////////
    //helper method -RoundNum
    //this method round values to a certain number of decimal places
    public double roundNum (double unroundNum, double decimalNum)
    {
	return (Math.round ((unroundNum * Math.pow (10, decimalNum)))) / Math.pow (10, decimalNum);  //this calcualtion uses the unrounded number and the number of deciamls the user wants to output the correctly rounded number
    } //roundNum method


    //toString method
    //this methods outputs the circles data
    public String toString ()
    {
	String data1 = "Radius: " + this.radius + this.unit; //+"\n" + "Diameter: " + diameter() + this.unit +"\n" + "Circumference: " + circumference() + this.unit + "\n" + "Area: " + area()+ this.unit + "^2";
	return data1;
    } //tostring method
} //Circle Class
