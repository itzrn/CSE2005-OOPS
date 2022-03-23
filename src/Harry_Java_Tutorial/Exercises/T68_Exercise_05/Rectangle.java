//package Harry_Java_Tutorial.Exercises.T68_Exercise_05;
package Exercise_05;

import java.util.Scanner;

/*
Write this code in Notepad---


You have to create a custom package named shape
This package should have individual classes for Rectangle, Square,
circle, Cylinder and sphere
These classes should use inheritance to properly manage the code
include methods like volume, surface, area and getter/setter for
dimensions
 */
// use notepad to visualize the things clearly
public class Rectangle {
    private float length;
    private float breath;

//    Rectangle(float length,float breath){
//        this.length=length;
//        this.breath=breath;
//    } we can also set length and breath using constructor


    public void setBreath(float breath) {
        this.breath = breath;
    }

    public void setLength(float length) {
        this.length = length;
    }


    public float area(){
        return length*breath;
    }

    public float perimeter(){
        return 2*(length+breath);
    }
}
