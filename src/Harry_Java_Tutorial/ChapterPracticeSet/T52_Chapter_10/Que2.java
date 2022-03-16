package Harry_Java_Tutorial.ChapterPracticeSet.T52_Chapter_10;

import java.util.Scanner;

class RectangleT52{
    public float length;
    public float breath;

    RectangleT52(float length,float breath){
        this.length=length;
        this.breath=breath;
    }

    RectangleT52(float length){
        this.length=length;
        this.breath=this.length;
    }

    public float area(){
        return this.breath*this.length;
    }

}

class CuboidT52 extends RectangleT52{

    CuboidT52(float length){
        super(length);
//        this.breath=this.length;
    }

    public float volume(){
        return (float) Math.pow(this.length,3);
    }
}
public class Que2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Rectangle ---> ");
        float len=sc.nextFloat();
        System.out.print("Enter Breath of Rectangle ---> ");
        float bre= sc.nextFloat();
        RectangleT52 rectangleT52=new RectangleT52(len,bre);
        System.out.print("Area of the Rectangle ---> "+rectangleT52.area());
        System.out.println();
        System.out.println();
        System.out.print("Enter Length of the side of Cube ----> ");
        float len1=sc.nextFloat();
        CuboidT52 cuboidT52=new CuboidT52(len1);
        System.out.println("Total Surface Area of Cuboid ---> "+cuboidT52.area()*6);
        System.out.println("Volume of Cuboid ---> "+cuboidT52.volume());
    }
}
// no need to do Que3 and Que4