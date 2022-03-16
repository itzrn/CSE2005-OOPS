package Harry_Java_Tutorial.ChapterPracticeSet.T35_Chapter_07;

import java.util.Scanner;

public class Que2 {
    void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Que2 obj=new Que2();
        System.out.print("Enter the number of line you want to print ---> ");
        obj.pattern(sc.nextInt());
    }
}
