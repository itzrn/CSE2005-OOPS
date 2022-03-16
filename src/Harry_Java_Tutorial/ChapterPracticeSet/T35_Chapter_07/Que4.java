package Harry_Java_Tutorial.ChapterPracticeSet.T35_Chapter_07;

import java.util.Scanner;

public class Que4 {
    static void pattern(int n){
        for(int i =n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter the number of line you want to print ---> ");
        pattern(SC.nextInt());
    }
}
