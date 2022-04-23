package DeepashikaMishraInClass.Assignment_04;


import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "Matrix addition Not Possible";
    }
}
public class Que_01 {
    public static int[][] input(int a, int b,String c){
        int[][] matrix=new int[a][b];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                System.out.format("Enter %dX%d position of %s Matrix ---> ",(i+1),(j+1),c);
                matrix[i][j]=sc.nextInt();
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of rows for First Matrix ---> ");
        int r1= sc.nextInt();
        System.out.print("Enter Number of Column for First Matrix ---> ");
        int c1= sc.nextInt();
        System.out.print("Enter Number of rows for Second Matrix ---> ");
        int r2= sc.nextInt();
        System.out.print("Enter Number of Column for Second Matrix ---> ");
        int c2= sc.nextInt();

        if (r1!=r2 || c1!=c2){
            try {
                throw new MyException();
            }catch (MyException e){
                System.out.println(e);
            }
        }else {
            int[][]m1=input(r1,c1,"First");
            int[][]m2=input(r2,c2,"Second");
            int[][]sum=new int[r1][c2];
            for (int i=0;i<r1;i++){
                for (int j=0;j<c1;j++){
                    sum[i][j]=m1[i][j]+m2[i][j];
                }
            }
            System.out.println();
            System.out.println("Sum of Ur Given Two Matrix ---> ");
            for (int i=0;i<r1;i++){
                for (int j=0;j<c1;j++){
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
