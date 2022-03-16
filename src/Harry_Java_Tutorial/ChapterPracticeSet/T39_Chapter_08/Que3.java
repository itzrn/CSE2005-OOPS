package Harry_Java_Tutorial.ChapterPracticeSet.T39_Chapter_08;

import java.util.Scanner;

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class Que3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Side of Square ---> ");
        Square sq=new Square();
        sq.side= sc.nextInt();
        System.out.println("Area ---> "+sq.area());
        System.out.println("Perimeter ---> "+sq.perimeter());
    }
}
