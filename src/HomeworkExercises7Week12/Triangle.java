/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HomeworkExercises7Week12;

/**
 *
 * @author burak gul 2016556028
 */
public class Triangle extends GeometricObject
{
    private double side1, side2, side3;
    public Triangle()
    {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;

    }

    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double getArea()
    {
            double s=(side1+side2+side3)/2;
            return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    
    public double getPerimeter() 
    {
        return side1 + side2 + side3;
    }

    public String toString() 
    {
    return "Triangle: Side 1 = " + side1 + " Side 2 = " + side2
           + " Side 3 = " + side3;
    }
}

class GeometricObject 
{
    private String color = " white ";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject() 
    {
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) 
    {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;   
    }

    public String getColor() 
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public boolean isFilled() 
    {
        return filled;
    }

    public void setFilled(boolean filled) 
    {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() 
    {
        return dateCreated;
    }

    public String toString() 
    {
        return "Created on " + dateCreated + "\n color: " + color + " and filled ";                 
    }   
 }
