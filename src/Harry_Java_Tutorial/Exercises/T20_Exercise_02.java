package Harry_Java_Tutorial.Exercises;
// Rock Paper Scissor game ---->
import java.util.Random;
import java.util.Scanner;

public class T20_Exercise_02 {
    public static void main(String[] args) {
        Random rd = new Random();
        System.out.println("Let's have fun with Game");
        System.out.println("Enter For");
        System.out.println("Scissor ---> 1");
        System.out.println("Paper ---> 2");
        System.out.println("Rock ---> 3");
        Scanner sc = new Scanner(System.in);
        int l=0;
        int w = 0;
        int n = 0;
        while (n==0) {
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter your choice ---> ");
                int b = sc.nextInt();
                int a = rd.nextInt(3) + 1;
                if (b == 1) {
                    if (a == 1) {
                        System.out.println("DRAW");
                    }
                    if (a == 2) {
                        System.out.println("WON");
                        w = w + 1;
                    }
                    if (a == 3) {
                        System.out.println("LOST");
                        l = l + 1;
                    }
                } else if (b == 2) {
                    if (a == 1) {
                        System.out.println("LOST");
                        l = l + 1;
                    }
                    if (a == 2) {
                        System.out.println("DRAW");
                    }
                    if (a == 3) {
                        System.out.println("WON");
                        w = w + 1;
                    }
                } else {
                    if (a == 1) {
                        System.out.println("WON");
                        w = w + 1;
                    }
                    if (a == 2) {
                        System.out.println("LOST");
                        l = l + 1;
                    }
                    if (a == 3) {
                        System.out.println("DRAW");
                    }
                }
            }
            System.out.println();
            System.out.println("LOST---> " + l + " WON---> " + w);
            if (w > l) {
                n=1;
                System.out.println("YOU WON THE SERIES ");
            }
            else if (w < l) {
                n=1;
                System.out.println("YOU LOST THE SERIES");
            }
            else {
                System.out.println("SERIES GOT TIE");
                System.out.println("LET'S TRY ANOTHER ROUND");
            }
        }
    }
}
