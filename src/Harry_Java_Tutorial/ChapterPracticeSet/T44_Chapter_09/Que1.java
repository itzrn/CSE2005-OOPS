package Harry_Java_Tutorial.ChapterPracticeSet.T44_Chapter_09;

import java.util.Scanner;

class CylinderQue1{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
public class Que1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CylinderQue1 cylinder =new CylinderQue1();
        System.out.print("Enter Height of Cylinder ---> ");
        cylinder.setHeight(sc.nextInt());
        System.out.print("Enter Radius of Cylinder ---> ");
        cylinder.setRadius(sc.nextInt());

    }
}
