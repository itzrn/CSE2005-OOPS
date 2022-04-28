//package DhanavanthiniLabClass.Assignment_08.arssoft.number;
package Aryan;
import java.util.Scanner;

public class Main {// use static methods, then and only then when you don't want to make the object of class,
    // but it should be in the same class
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Aryan.Armstrong obj=new Aryan.Armstrong();
        Aryan.factorial obj1=new Aryan.factorial();
        Aryan.Palindrome onj2=new Aryan.Palindrome();
        System.out.println("\tArmstrong");
        System.out.print("Enter A Number ---> ");
        System.out.println(obj.armstrong(sc.nextInt()));
        System.out.println();
        System.out.println("\tPalindrome");
        System.out.print("Enter A Number ---> ");
        System.out.println(onj2.palindrome(sc.nextInt()));
        System.out.println();
        System.out.println("\tFactorial");
        System.out.print("Enter A Number ---> ");
        System.out.println(obj1.fact(sc.nextInt()));

    }
}
