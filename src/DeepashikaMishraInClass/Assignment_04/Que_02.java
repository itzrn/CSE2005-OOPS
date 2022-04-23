package DeepashikaMishraInClass.Assignment_04;

import java.util.ArrayList;
import java.util.Scanner;

class CountEvenOdd{
    public  <T extends  Number> int countEven(ArrayList<T>L1){
        int c=0;
        for (T t : L1) {
            if (t.doubleValue() % 2 == 0) {
                c++;
            }
        }
        return c;
    }
    public  <T extends Number> int countOdd(ArrayList<T>L1){
        int c=0;
        for (T t : L1) {
            if (t.doubleValue() % 2 != 0) {
                c++;
            }
        }
        return c;
    }
}
public class Que_02 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of element You want in ArrayList ---> ");
        int n=sc.nextInt();
        System.out.println("Enter Your Values ---> ");
        for (int i=0;i<n;i++){
            arrayList.add(i, sc.nextInt());
        }
        System.out.println();
        System.out.println(arrayList);
        CountEvenOdd countEvenOdd=new CountEvenOdd();
        System.out.println("Number of Even Element ---> "+countEvenOdd.countEven(arrayList));
        System.out.println("Number of Odd Element ---> "+countEvenOdd.countOdd(arrayList));
    }
}
