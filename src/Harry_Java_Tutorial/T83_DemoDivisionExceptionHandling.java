package Harry_Java_Tutorial;

import java.util.Scanner;

class myException083 extends ArithmeticException{
    @Override
    public String toString(){
        return "Input MisMatch Exception";
    }
}

public class T83_DemoDivisionExceptionHandling {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 'a' of format 'a/b' ---> ");
        int a= sc.nextInt();
        System.out.print("Enter 'b' of format 'a/b' ---> ");
        int b= sc.nextInt();
        if (b==0){
            try {
                throw new myException083();
            }catch (myException083 e){
                System.out.println(e+"");
            }
        }else
            System.out.println(a/b);
    }
}
