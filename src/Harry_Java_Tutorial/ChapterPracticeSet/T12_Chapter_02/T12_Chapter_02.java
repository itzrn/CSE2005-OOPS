package Harry_Java_Tutorial.ChapterPracticeSet.T12_Chapter_02;

import java.util.Scanner;

public class T12_Chapter_02 {
    public static void main(String[] args) {
        System.out.println("QUE 1 ===>");
        float a = 7/4f*9/2f;// or float a = (float)7/4*9/2;
        /*
        7/4*9/2  (let if not type casting to float, it's going to treat everything as integer)
        1*4.5
        4.5
        4 ---> ans(as it will print integer)
         */
        System.out.println("7/4*9/2 ---> "+a);
        System.out.println();
        System.out.println("QUE 2 ===>");
        char grade = 'B';
        grade =(char)(grade + 8);// encrypting
        System.out.println("Encrypting grade --->"+grade);
        grade = (char)(grade - 8);// decrypting
        System.out.println("Decrypting grade --->"+grade);
        System.out.println();
        System.out.println("QUE 3 ===>");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number --->");
        int g = sc.nextInt();
        System.out.println("g>10 -->"+(g>10));
        System.out.println();
        System.out.println("QUE 4 ===>");
        System.out.print("Enter value of 'v' --->");
        float b = sc.nextFloat();
        System.out.print("Enter value of 'u' --->");
        float c = sc.nextFloat();
        System.out.print("Enter value of 'a' --->");
        float e = sc.nextFloat();
        System.out.print("Enter the value of 'S' --->");
        float f = sc.nextFloat();
        float d = (a*a - b*b)/2*a*f;
        System.out.println("(v*v - u*u)/2*a*5 ---> "+d);
        System.out.println();
        System.out.println("QUE 5 ===>");
        int x = 7;
        int h = 7*49/7+35/7;
        System.out.println("value of expression(7*49/7+35/7) --->"+h);
    }
}
