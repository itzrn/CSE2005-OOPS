package Harry_Java_Tutorial;

import java.util.Scanner;

// Making my own Exception Class
class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
public class T83_ExceptionClass {
    public static void main(String[] args) {
        MyException myException=new MyException();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number ---> ");
        int a= sc.nextInt();
        /**
         * throw keyword se kisi custom exception class ko throw kr skte h, uske object ke devara
         * and even inbuilt class Exception kaa object bna ke  Exception ko throw kr skte h
         */
        if (a<90){
            try {
                System.out.println("Aryan");
                throw myException;// or u can throw like ---> throw new MyException();(Making object of MyException Class)
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e);// it is by-default understood as e.toString()
                e.printStackTrace();// this is not error, what you will get in terminal,
                // this is used to know in which line we got error


                // only these three methods are not there, we have more, u cn see on internet
                System.out.println("Aryan");
            }
        }
    }
}
