package Harry_Java_Tutorial.ChapterPracticeSet.T35_Chapter_07;

import java.util.Scanner;

public class Que7 {
    static void pattern(int n){
        if(n>0){
            pattern(n-1);
            for (int i = 1;i<=n;i++)
                System.out.print("X ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of line you want of the pattern ---> ");
        pattern(sc.nextInt());
    }
}
