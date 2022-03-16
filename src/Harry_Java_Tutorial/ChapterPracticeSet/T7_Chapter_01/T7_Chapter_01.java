package Harry_Java_Tutorial.ChapterPracticeSet.T7_Chapter_01;

import java.util.Scanner;

public class T7_Chapter_01 {
    public static void main(String[] args) {
        System.out.println("Que 1 --->");
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("WAP to sum three numbers in java");
//        System.out.println();
        System.out.print("Enter First number --->");
        int a = sc.nextInt();
        System.out.print("Enter second number --->");
        int b = sc.nextInt();
        System.out.print("Enter third number --->");
        int c = sc.nextInt();
        int sum = a+b+c;
//        System.out.println();
        System.out.println("Sum of three given numbers --->"+ sum);
        System.out.println();
        System.out.println("Que 2 --->");
        System.out.println("WAP to calculate CGPA using marks of three subjects(out of 100 each)");
//        System.out.println();
        System.out.print("Enter first subject marks ---->");
        float m1 = sc.nextFloat();
        System.out.print("Enter second subject marks --->");
        float m2 = sc.nextFloat();
        System.out.print("Enter third subject marks --->");
        float m3 = sc.nextFloat();
        float sum1 = (m1+m2+m3)/30;
        System.out.println("CGPA --->"+sum1);
        System.out.println();
        System.out.println("Que 3 --->");
        System.out.println("WAP which ask user to enter his/her name and greet them with" +
                "//Hello <name> have a good day//"+ "text");
        System.out.print("Enter your name --->");
        String name = s.nextLine();
        System.out.println("Hello "+name+" Have a Good Day");
        System.out.println();
        System.out.println("Que 4 --->");
        System.out.println("WAP to convert kilometers to mile ");
        System.out.print("Enter 'kilometer' that you want to convert in miles --->");
        float kilo = sc.nextFloat();
        System.out.println("In miles ---> "+kilo*0.621371+"mi");
        System.out.println();
        System.out.println("Que 5 --->");
        System.out.println("WAP to detect whether the given number is Integer or not");
        System.out.print("Enter the Number --->");
        Scanner scc = new Scanner(System.in);
        System.out.println(scc.hasNextInt());
        
    }
}
