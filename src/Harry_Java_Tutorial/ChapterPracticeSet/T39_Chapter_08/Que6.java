package Harry_Java_Tutorial.ChapterPracticeSet.T39_Chapter_08;

import java.util.Scanner;

class Circle{
    int radius;
    public double Area(){
        return 3.14*Math.pow(radius,2);
    }
    public double Perimeter(){
        return 2*3.14*radius;
    }
}
public class Que6 {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius ---> ");
        circle.radius=sc.nextInt();
        System.out.println("Area ---> "+circle.Area());
        System.out.println("Perimeter ---> "+circle.Perimeter());
    }
}
