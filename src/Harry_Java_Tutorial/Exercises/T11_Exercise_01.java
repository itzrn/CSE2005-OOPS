package Harry_Java_Tutorial.Exercises;
/*
Write a Program to calculate the percentage of a given student in CBSE exam.
His/Har marks for 5 subjects should be taken as input from the keyboard
(Marks are out of 100)
 */

import java.util.Scanner;

public class T11_Exercise_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first subject marks --->");
        float a = sc.nextFloat();
        System.out.print("Enter second subject marks --->");
        float b = sc.nextFloat();
        System.out.print("Enter third subject marks --->");
        float c = sc.nextFloat();
        System.out.print("Enter fourth subject marks --->");
        float d = sc.nextFloat();
        System.out.print("Enter fifth subject marks --->");
        float e = sc.nextFloat();
        float per = (a+b+c+d+e)/5;
        System.out.println("Percentage for given five subject ---> "+per+"%");
    }
}
