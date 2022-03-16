package DeepashikaMishraInClass;

import java.util.*;

public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number --->");
        int a = sc.nextInt();
//        System.out.println(a);
        System.out.print("Enter Second number --->");
        int b = sc.nextInt();
        System.out.print("Enter third number --->");
        int c = sc.nextInt();
        // using if-else_if-else ladder
        int big;
        if((a>b) && (a>c)) {
            big = a;
        }
        else if ((b>a)&&(b>c)) {
            big = b;
        }
        else {
            big = c;
        }
        System.out.println("Biggest number among the given three number --->"+big);
        // using nested if-else
        if (a>b){
            if (a>c){
                System.out.println("Big --->"+a);
            }
            else{
                System.out.println("Big --->"+c);
            }
        }
    }
}
