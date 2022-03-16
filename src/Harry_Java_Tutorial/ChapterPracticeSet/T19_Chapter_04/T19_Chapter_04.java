package Harry_Java_Tutorial.ChapterPracticeSet.T19_Chapter_04;

import java.util.Scanner;

public class T19_Chapter_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que 1 --->");
        System.out.print("Enter a number --->");
        int a = sc.nextInt();
        if(a==18){
            System.out.println("I am 18!");
        }
        else{
            System.out.println("I am not 18!");
        }
        System.out.println();
        System.out.println("Que 2 --->");
        System.out.print("Enter first subject marks ---> ");
        float m1 = sc.nextFloat();
        System.out.print("Enter second subject marks ---> ");
        float m2 = sc.nextFloat();
        System.out.print("Enter third subject marks ---> ");
        float m3 = sc.nextFloat();
        float per = (m1+m2+m3)/3;
        if(m1>33 && m2>33 && m3>33){
            if(per > 40)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
        }
        else
            System.out.println("FAIL");
        System.out.println();
        System.out.println("Que 3 ---> ");
        float tax;
        System.out.print("Enter your income tax ---> ");
        double ic = sc.nextDouble();
        if(ic<250000){
            System.out.println("No Tax");
        }
        else if(ic<500000 && ic>250000){
            tax=(float) (ic*0.05);
            System.out.println("Tax ---> "+tax);
        }
        else if (ic<1000000 && ic>500000){
            tax = (float)(ic*0.2);
            System.out.println("Tax ---> "+tax);
        }
        else{
            tax = (float) (ic*0.3);
            System.out.println("Tax ---> "+tax);
        }
        System.out.println();
        System.out.println("Que 4 ---> ");
        System.out.print("Enter the number of day(in a week) ---> ");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("enter the valid number Day!");
        }
        System.out.println();
        System.out.println("Que 5 ---> ");
        System.out.print("Enter year \uD83D\uDE0A---> ");
        int year = sc.nextInt();

        System.out.println();
        System.out.println("Que 6 ---> ");
        System.out.print("Enter Website ---> ");
        String web = sc.next();
        if(web.endsWith(".org")){
            System.out.println("This is an Organization Website");
        }
        else if (web.endsWith(".in")){
            System.out.println("This is an Indian Website");
        }
        else if (web.endsWith(".com")){
            System.out.println("This is an Commercial website");
        }
    }
}
