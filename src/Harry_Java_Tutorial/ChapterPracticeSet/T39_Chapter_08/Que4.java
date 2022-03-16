package Harry_Java_Tutorial.ChapterPracticeSet.T39_Chapter_08;

import java.util.Scanner;

class  Rectangle{
    int a;
    int b;
    public int area(){
        return a*b;
    }
    public int perimeter(){
        return 2*(a+b);
    }
}
public class Que4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangle rectangle=new Rectangle();
        System.out.print("Enter Length of rectangle ---> ");
        rectangle.a= sc.nextInt();
        System.out.print("Enter Breadth of rectangle ---> ");
        rectangle.b=sc.nextInt();
        System.out.println("Area ---> "+rectangle.area());
        System.out.println("Perimeter ---> "+rectangle.perimeter());
    }
}
