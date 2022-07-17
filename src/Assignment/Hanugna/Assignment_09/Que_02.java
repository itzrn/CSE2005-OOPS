package Assignment.Hanugna.Assignment_09;

/*
Write a java program to implement the concept of Exceptional handling by creating user defined exception
use --->
throw, throws, finally keyword
 */
import java.util.InputMismatchException;
import java.util.Scanner;
class myException083 extends Exception{
    @Override
    public String toString(){
        return "Input MisMatch Exception";
    }

}
public class Que_02 {
    public static float area (int radius) throws myException083{
        if (radius<0 ){
            throw new myException083();
        }
        return (float) (Math.PI*radius*radius);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 'a' of format 'a/b' ---> ");
        int a= sc.nextInt();
        System.out.print("Enter 'b' of format 'a/b' ---> ");
        int b= sc.nextInt();
        if (b==0){
            try {
                throw new myException083();
            }catch (Exception e){
                System.out.println(e+"");
            }
        }else
            System.out.println(a/b);

        System.out.println();
        System.out.print("Enter Radius ---> ");
        int radius=0;

        try {
            radius= sc.nextInt();
            System.out.println("Area ---> "+area(radius));
        }catch (myException083 e){
            System.out.println("Radius can Not be Negative");
        }catch (InputMismatchException e){
            System.out.println("Letter Not Allowed!");
        }finally {
            System.out.println("Radius ---> "+radius);
        }
    }
}
