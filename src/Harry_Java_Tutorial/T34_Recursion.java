package Harry_Java_Tutorial;

import java.util.Scanner;

public class T34_Recursion {
    static int factorial(int n){
        // factorial(n) = n*factorial(n-1)
        if(n==0 || n==1)
            return 1;
        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number n ---> ");
        int n=sc.nextInt();
        System.out.println("The value of factorial of your given number ---> "+factorial(n));

    }
}
