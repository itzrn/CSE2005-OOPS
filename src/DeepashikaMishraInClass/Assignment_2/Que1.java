package DeepashikaMishraInClass.Assignment_2;

import java.util.Scanner;
class Que1 {
    int months,princ;
    double roi;
    Que1(int months, int princ){
        this.months=months;
        this.princ=princ;
        if (months<12)
            roi=7;
        else if (months>=12 && months <=23)
            roi =7.5;
        else if (months>=24 && months <=35)
            roi =7.75;
        else
            roi =8;

    }
    void CalMatrty(){
        double matrty=princ*Math.pow((1+((roi/100)/4)),4*((int) (months/12)));
        System.out.println("Maturity amount for "+" principal "+princ+" months "+months+" rate of intrest "+roi+" is "+matrty);
    }
    public static void main(String[] args){
        Scanner inp =new Scanner(System.in);
        System.out.println("Enter a principal amount:");
        int p= inp.nextInt();
        System.out.println("Enter the months  :");
        int m =inp.nextInt();
        Que1 ob =new Que1( m, p);
        ob.CalMatrty();
    }
}
