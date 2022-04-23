package DhanavanthiniLabClass.Assignment_07;

/**
 * Implement a java program to check whether the given number is odious or not.
 * Note: An odious number is a non-negative number that has an odd number of 1’s in its binary representation.
 * 111 is the binary representation for number 7 which is an odious number.
 *
 * hint: Integer.toBinaryString
 */

import java.util.Scanner;
public class Que_02 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number ---> ");
        int a = sc.nextInt();
        String store = Integer.toBinaryString(a);
        if (store.length()%2 == 0){
            System.out.println("Non- Odious Number!");
        }
        else {
            for (int i=0;i<store.length();i++){
                if (store.charAt(i)=='0'){
                    System.out.println("Non-Odious Number!");
                    break;
                }
            }
            System.out.println("Odious Number!");
        }
    }
}