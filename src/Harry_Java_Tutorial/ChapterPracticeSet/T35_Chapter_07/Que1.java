package Harry_Java_Tutorial.ChapterPracticeSet.T35_Chapter_07;

import java.util.Scanner;

public class Que1 {
    static void multiplication(int n){
        int multi;
        for(int i = 1;i<=10;i++){
            multi=n*i;
            System.out.format("%d X %d = %d",n,i,multi);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of which you the multiplication table ---> ");
        multiplication(sc.nextInt());
    }
}
