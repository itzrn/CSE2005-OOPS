package DeepashikaMishraInClass.Assignment_2;
/*
The formula for computing the number of ways of choosing ‘r’ different things from a set of
‘n’ things is the define as C(n, r) = n!/(r! * (n – r)!).
Write a function, int com(int n, int r) to find the value of the C(n, r).
This function further invokes a recursive method, int fac(int n).
Here, method int fac(int n) recursively finds factorial of a number passed as an argument.
Write the complete java program.
 */
import java.util.Scanner;
public class Que2 {
    static long fac(int n){
        if(n==0 || n==1)
            return 1;
        else
            return n*fac(n-1);
    }
    static long com(int n,int r){
        int a=n-r;
        long b=fac(n);
        long c=fac(r);
        long d=fac(a);
        return b/(c*d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of 'n' different things ---> ");
        int m= sc.nextInt();
        System.out.print("Enter 'r' different things to choose ---> ");
        int r =sc.nextInt();
        System.out.println();
        System.out.format("The number of ways of choosing %d different things \nFrom the set of %d different things ---> ",r,m);
        System.out.println(com(m,r));
    }
}
