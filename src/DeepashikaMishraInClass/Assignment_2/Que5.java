package DeepashikaMishraInClass.Assignment_2;
/*
Write a java program using loop and switch case to display a number in words.
(Without using inbuilt function)
 */
import java.util.Scanner;

public class Que5 {
    static int rev(int n){
        int reve=0;
        while (n>0){
            reve=reve*10+(n%10);
            n=n/10;
        }
        return reve;
    }
    static void numberToWOrdDisplay(int n){
        int rem;
        while (n>0){
            rem=n%10;
            switch (rem){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                default:
                    System.out.print("Nine ");
            }
            n=n/10;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ---> ");
        numberToWOrdDisplay(rev(sc.nextInt()));
    }
}
