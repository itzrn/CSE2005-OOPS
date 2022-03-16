package Harry_Java_Tutorial.ChapterPracticeSet.T44_Chapter_09;

import java.util.Scanner;

class CylinderQue2{
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

    public float surfaceArea(int r,int h){
        return (3.14f*(float) (Math.pow(r,2)*h))+2*3.14f*r*h;
    }

    public float volume(int r, int h){
        return 3.14f*(float) (Math.pow(r,2)*h);
    }
}
public class Que2 {
    public static void main(String[] args) {
        System.out.println("CYLINDER");
        Scanner sc=new Scanner(System.in);
        CylinderQue2 CQ2=new CylinderQue2();
        System.out.print("Enter radius ---> ");
        CQ2.setRadius(sc.nextInt());
        System.out.print("Enter Height ---> ");
        CQ2.setHeight(sc.nextInt());
        System.out.println("Total SurfaceArea ---> "+CQ2.surfaceArea(CQ2.getRadius(),CQ2.getHeight()));
        System.out.println("Volume ---> "+CQ2.volume(CQ2.getRadius(),CQ2.getHeight()));
    }
}
