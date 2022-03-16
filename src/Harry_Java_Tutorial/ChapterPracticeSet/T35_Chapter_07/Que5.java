package Harry_Java_Tutorial.ChapterPracticeSet.T35_Chapter_07;

import java.util.Scanner;

public class Que5 {
    static int fibonacci(int n){// 0,1,1,2,3,5,8,13,21,34....<--- fibonacci series
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
        /*
        line if and elseif can also be written as--->
        if(n==1||n==2)
             return n-1;
         */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element ypu want in the fibonacci series ---> ");
        int a =sc.nextInt();
        for(int i=1;i<=a;i++)
            System.out.print(fibonacci(i)+" ");
    }
}
