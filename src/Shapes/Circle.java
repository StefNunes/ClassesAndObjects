/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author Stefani Nunes
 */

 public class Circle extends Shape { //take all the information from shape

    private double radius;

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
    
}

