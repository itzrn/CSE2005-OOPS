package Harry_Java_Tutorial.ChapterPracticeSet.T52_Chapter_10;

import java.util.Scanner;

class Circle_T52{

    public float radius;
    Circle_T52(float r){
        this.radius=r;
    }
    public float area(){
        return (float) (Math.PI*this.radius*this.radius);
    }

}

class Cylinder_T52 extends Circle_T52{

    float height;
    Cylinder_T52(float r,float h){
        super(r);
        this.height=h;
    }

    public float volume(){
        return area()*height;
    }
}
public class Que1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Radius of circle ---> ");
        float a= sc.nextFloat();
        System.out.println();
        System.out.print("Enter Radius of the circle of base of Cylinder ---> ");
        float r= sc.nextFloat();
        System.out.print("Enter Height of Cylinder ---> ");
        float h= sc.nextFloat();
        System.out.println();
        Cylinder_T52 cylinder_t52=new Cylinder_T52(r,h);
        Circle_T52 circle_t52=new Circle_T52(a);
        System.out.println("Area of the circle ---> "+circle_t52.area());
        System.out.println("Volume of Cylinder ---> "+cylinder_t52.volume());
    }
}