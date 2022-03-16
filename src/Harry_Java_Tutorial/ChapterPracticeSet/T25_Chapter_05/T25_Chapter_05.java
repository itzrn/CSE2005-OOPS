package Harry_Java_Tutorial.ChapterPracticeSet.T25_Chapter_05;

import java.util.Scanner;

public class T25_Chapter_05 {
    public static void main(String[] args) {
        System.out.println("QUE 1 --->");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line you want to print ---> ");
        int n = sc.nextInt();
        for (int i=n;i>=1;i--){
            for (int j= 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("QUE 2 --->");
        System.out.print("Enter the number till which you want the sun of even numbers ---> ");
        int n1 = sc.nextInt();
        int a = 2;
        int sum = 0;
        while (a<=n1){
            sum = sum + a;
            a = a + 2;
        }
        System.out.println(sum);
        System.out.println();
        System.out.println("QUE --->");
        System.out.print("Enter the number for which you need the table ---> ");
        int n2 = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(n2+" * "+i+" = "+(n2*i));
        }
        System.out.println();
        System.out.println("Que 4 ---> ");
        int n3 = 10;
        for (int i = 10;i>=1;i--){
            System.out.println("10 * "+i+" = "+(10*i));
        }
        System.out.println();
        System.out.println("Que 5 ---> ");
        System.out.print("Enter the number of which you want the factorial ---> ");
        int n4 = sc.nextInt();
        int multi = 1;
        for(int i=2;i<=n4;i++){
            multi = multi * i;
        }
        System.out.println("Factorial of "+n4+" = "+multi);
        System.out.println();
        System.out.println("Que 6 ---> ");
        int n5 = 1;
        while (n5<=10){
            System.out.println(5);
            n5++;
        }
        System.out.println();
        System.out.println("Que 7 ---> ");
        System.out.println("Using for loop --->");
        for(int i =1;i<=10;i++){
            System.out.println(1);
        }
        System.out.println();
        System.out.println("Using while loop --->");
        int n6 = 1;
        while (n6<=10){
            System.out.println(n6);
            n6++;
        }
        /*
        System.out.println();
        System.out.println("Que 8 --->");
        ans ---> true
        */
        System.out.println();
        System.out.println("Que 9 --->");
        sum=0;
        for(int i=1;i<=10;i++){
            sum = sum+(8*i);
        }
        System.out.println("Sum ---> "+sum);
    }
}
