package Assignment.Hanugna.Assignment_09;
/*
Write a Java Program to implement the concept of Exceptional handling using predefined exception
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Que_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("\tArithmetic Exception");//this Exception Get Generate when user try to divide any number by zero
        System.out.print("Enter 'a' of format 'a/b' ---> ");
        int a= sc.nextInt();
        System.out.print("Enter 'b' of format 'a/b' ---> ");
        int b= sc.nextInt();
        System.out.println();
        System.out.println("\t\tDivision");
        try {
            System.out.println("a/b ---> "+a/b);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception ---> Division Can not be done By Zero!");
        }

        System.out.println();
        System.out.println("\tInputMismatch Exception");
        System.out.print("Enter C ---> ");
        int c=0;
        try {
            c= sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("InputMismatchException ---> Enter Number!!");
        }finally {
            System.out.println("c ---> "+c);
        }

    }
}
