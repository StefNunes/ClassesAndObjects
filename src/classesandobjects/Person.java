/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesandobjects;

import Shapes.Triangle;

/**
 *
 * @author Stefani Nunes
 */
public class Person {
    
    String eyeColour;
    String name;
    int age;
    Triangle favTriangle; 
    
    
   public Person() {
       age = 24;
       name = "Stefani";
       System.out.println("Constructor 1");
   }
    
    
    public Person(int age) {
       this.age= age;
       System.out.println("Constructor 2");
   }
    
     public Person(int age, String Name) {
       this.age= age;
       this.name = name;
       System.out.println("Constructor 3");
   }
    
     public Person(String Name, int age) {
       System.out.println("Constructor 4");
   }
    
    
    
}
