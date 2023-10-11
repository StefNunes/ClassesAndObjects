/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author Stefani Nunes
 */
public class Triangle extends Shape implements Shape2D  {
    int side1;
    int side2;
    int side3;

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide1(int side1) {
        if (side1 > 0){
            this.side1 = side1;
        }else{
            System.out.println("Cannot set side1 of a triangle to be non-po");
        }
       
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }
    
    
    @Override
    public double getArea() {
        return 0.5 * side1 * side2;
    }
    
    @Override
    public void setColour(String colour) {
        if (colour.equals("Blue")) {
            this.colour = "Red";
        }else{
            this.colour = colour;
        }
    }
    
    @Override
    public String toString() {
        return "Hello I am a triangle with the colour of: " + colour;
    }
    
     @Override
    public double calculateAngles() {
        return 60;
    }
}
