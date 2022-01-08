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
import java.util.Scanner;

public class TriangleTest {

public static void main(String[] args)
    {
        Triangle triangle = new Triangle(1.0, 1.0, 1.0);
        triangle.setColor("blue");
        triangle.setFilled(true);
        
        System.out.println(triangle);
        System.out.println("The area is "+ triangle.getArea());
        System.out.println("The peremeter is "+triangle.getPerimeter());
        System.out.println("Color: "+triangle.getColor());
        System.out.println("Is filled? "+triangle.isFilled());
        System.out.println(triangle);
        
    }
}
