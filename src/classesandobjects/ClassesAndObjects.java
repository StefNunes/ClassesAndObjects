/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesandobjects;

import Shapes.Rectangle;
import Shapes.Shape;
import Shapes.Shape2D;
import Shapes.Square;
import Shapes.Triangle;

/**
 *
 * @author Stefani Nunes
 */
public class ClassesAndObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      Triangle tri1 = new Triangle();
        System.out.println(tri1);
      Triangle tri2 = new Triangle();
      Triangle tri3 = new Triangle();
      Triangle tri4 = new Triangle();
      Triangle tri5 = new Triangle();
      Triangle tri6 = new Triangle();
      
      int[] sideLenghts = new int[18];
      //the lenghts of tri1's sides will be first,then the lenghts of tri2's sides etc
      sideLenghts[0] = 5;
      sideLenghts[1] = 8;
      sideLenghts[2] = 9;
      
      //tri5 (4, 7, 2)
      sideLenghts[12] = 5;
      sideLenghts[13] = 8;
      sideLenghts[14]= 9;
         
       Person Stefani = new Person();
       Stefani.favTriangle = tri5;
      
        System.out.println("---Rectangles---");
      Rectangle rect1 = new Rectangle();
      Rectangle rect2 = new Rectangle(true, "Blue", 5, 6);
        System.out.println(rect1.getArea());
       // Shape shape1 = new Shape();
        System.out.println(rect1.getColour());  
        System.out.println(tri5.getColour());
        
        Person p4 = new Person("Sam",30);
        Person p3 = new Person("ken",45);
        Person p1 = new Person();
        Person p2 = new Person(5);
        
        Square sq1 = new Square(true, "Green", 10);
        Rectangle sq2 = new Square(false, "Purple", 5);
        Shape sq3 = new Square(true, "Maroon", 10);
        Shape tri10 = new Triangle();
        sq1.getArea();
        
        Shape2D sq4= new Square(true, "Blue", 2);
        sq4.calculateAngles();
         // Can;t make a Circle as an example of a Shape2D, since it does not implement the interface.
//        Shape2D circle5 = new Circle();
    }
    
}
