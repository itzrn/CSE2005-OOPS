package Harry_Java_Tutorial.ChapterPracticeSet.T35_Chapter_07;

import java.util.Scanner;

public class Que3 {
    static int naturalnumber(int n){
        if(n==1)// base condition to stop the recursion
            return 1;
        else {
            return n+naturalnumber(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the natural number 'n' to get sum of first 'n' natural number ---> ");
        System.out.println(naturalnumber(sc.nextInt()));
    }
}
