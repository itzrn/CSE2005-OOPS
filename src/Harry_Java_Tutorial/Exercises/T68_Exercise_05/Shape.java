//package Harry_Java_Tutorial.Exercises.T68_Exercise_05;
package Exercise_05;

import java.util.Scanner;
// use notepad to visualize the things clearly and Run the main using command prompt


public class Shape {
    public static void main(String[] args) {
        Exercise_05.Rectangle rectangle=new Exercise_05.Rectangle();
        Exercise_05.Circle circle=new Exercise_05.Circle();
        Exercise_05.Cylinder cylinder=new Exercise_05.Cylinder();
        Exercise_05.Sphere sphere=new Exercise_05.Sphere();
        Exercise_05.Square square=new Exercise_05.Square();
        System.out.println("Available Calculation ---> Rectangle, " +
                "Sphere, Circle, Cylinder and Square");
        System.out.println();
        Scanner sc=new Scanner(System.in);
        boolean input=true;
        int c=0;
        while(input) {
            while (c==0) {
                System.out.print("Enter your choice ---> ");
                String choice = sc.next();
                System.out.println();
                switch (choice) {
                    case "circle":
                    case "Circle":
                        System.out.print("Enter Circle Radius ---> ");
                        circle.setRadius(sc.nextFloat());
                        System.out.println("Area ---> " + circle.area());
                        System.out.println("Perimeter ---> " + circle.perimeter());
                        input = false;
                        System.out.println();
                        System.out.println("Want to Continue the Calculation");
                        System.out.print("Enter '0' to continue or '1' to exit ---> ");
                        c= sc.nextInt();
                        System.out.println();
                        break;
                    case "Cylinder":
                    case "cylinder":
                        System.out.print("Enter Base radius of Cylinder ---> ");
                        cylinder.setRadius(sc.nextFloat());
                        System.out.print("Enter height of Cylinder ---> ");
                        cylinder.setHeight(sc.nextFloat());
                        System.out.println();
                        System.out.println("Curved Surface Area ---> " + cylinder.curvedSurfaceArea());
                        System.out.println("Flat Surface Area ---> " + cylinder.flatSurfaceArea());
                        System.out.println("Total Surface Area ---> " + cylinder.totalSurfaceArea());
                        System.out.println("Volume ---> " + cylinder.volume());
                        input = false;
                        System.out.println();
                        System.out.println("Want to Continue the Calculation");
                        System.out.print("Enter '0' to continue or '1' to exit ---> ");
                        c= sc.nextInt();
                        System.out.println();
                        break;
                    case "Sphere":
                    case "sphere":
                        System.out.print("Enter Radius of Sphere ---> ");
                        sphere.setRadius(sc.nextFloat());
                        System.out.println();
                        System.out.println("Volume ---> " + sphere.volume());
                        System.out.println("Surface Area ---> " + sphere.surfaceArea());
                        input = false;
                        System.out.println();
                        System.out.println("Want to Continue the Calculation");
                        System.out.print("Enter '0' to continue or '1' to exit ---> ");
                        c= sc.nextInt();
                        System.out.println();
                        break;
                    case "Rectangle":
                    case "rectangle":
                        System.out.print("Enter Length of Rectangle ---> ");
                        rectangle.setLength(sc.nextFloat());
                        System.out.print("Enter Breath of Rectangle ---> ");
                        rectangle.setBreath(sc.nextFloat());
                        System.out.println();
                        System.out.println("Area ---> " + rectangle.area());
                        System.out.println("Perimeter ---> " + rectangle.perimeter());
                        input = false;
                        System.out.println();
                        System.out.println("Want to Continue the Calculation");
                        System.out.print("Enter '0' to continue or '1' to exit ---> ");
                        c= sc.nextInt();
                        System.out.println();
                        break;
                    case "square":
                    case "Square":
                        System.out.print("Enter Length of Square ---> ");
                        square.setLength(sc.nextFloat());
                        System.out.println();
                        System.out.println("Area ---> " + square.area());
                        System.out.println("Perimeter ---> " + square.perimeter());
                        input = false;
                        System.out.println();
                        System.out.println("Want to Continue the Calculation");
                        System.out.print("Enter '0' to continue or '1' to exit ---> ");
                        c= sc.nextInt();
                        System.out.println();
                        break;
                    default:
                        System.out.println("Error!! ---> Invalid Input");
                        System.out.println("\t Re-Enter Your Choice");
                }
            }
        }
    }
}