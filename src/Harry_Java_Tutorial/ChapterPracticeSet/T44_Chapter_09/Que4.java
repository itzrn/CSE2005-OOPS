package Harry_Java_Tutorial.ChapterPracticeSet.T44_Chapter_09;

import java.util.Scanner;

class RectangleQue4{
    private int length;
    private int height;

    public RectangleQue4() {
        this.length = 4;
        this.height = 5;
    }

    public RectangleQue4(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
public class Que4 {
    public static void main(String[] args) {
        System.out.println("RECTANGLE");
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Constructor Without Using Parameter --->");
        RectangleQue4 RQ4=new RectangleQue4();
        System.out.println("Height ---> "+RQ4.getHeight());
        System.out.println("Length ---> "+RQ4.getLength());
        System.out.println();
        System.out.println("Constructor With Parameter --->");
        System.out.print("Enter Length of Rectangle ---> ");
        int l= sc.nextInt();
        System.out.print("Enter height of Rectangle ---> ");
        int h=sc.nextInt();
        RectangleQue4 rQ4=new RectangleQue4(l,h);
        System.out.println("Your Entered Length ---> "+rQ4.getLength());
        System.out.println("Your Entered Height ---> "+rQ4.getHeight());
    }
}
