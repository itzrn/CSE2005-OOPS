package Harry_Java_Tutorial.ChapterPracticeSet.T44_Chapter_09;

import java.util.Scanner;

class CylinderQue3{
    private int height;
    private int radius;

    public CylinderQue3(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
public class Que3 {
    public static void main(String[] args) {
        System.out.println("CYLINDER");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius ---> ");
        int r=sc.nextInt();
        System.out.print("Enter Height ---> ");
        int h=sc.nextInt();
        CylinderQue3 CQ3=new CylinderQue3(r,h);
    }
}
