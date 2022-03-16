package Harry_Java_Tutorial.ChapterPracticeSet.T35_Chapter_07;

import java.util.Scanner;

public class Que8 {
    static void pattern(int n){
        if(n>0){
            for(int i=n;i>=1;i--){
                System.out.print("X ");
            }
            System.out.println();
            pattern(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of line you want to print ---> ");
        pattern(sc.nextInt());
    }
}
