package Harry_Java_Tutorial.ChapterPracticeSet.T35_Chapter_07;

import java.util.Scanner;

public class Que6 {
    static void average(float ...ave){
        float sum=0;
        for(float i:ave){
            sum=sum+i;
        }
        float av=sum/ ave.length;
        System.out.println("Average of all given number ---> "+av);
    }
    static float[] input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element you want to sum up ---> ");
        int a= sc.nextInt();
        float[] arra=new float[a];
        for(int i = 0;i<a;i++){
            System.out.format("Enter %d number ---> ",(i+1));
            arra[i]= sc.nextFloat();
        }
        return arra;
    }

    public static void main(String[] args) {
        average(input());
    }
}
