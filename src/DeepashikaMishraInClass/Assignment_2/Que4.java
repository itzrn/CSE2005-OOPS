package DeepashikaMishraInClass.Assignment_2;
/*
Write a java program to print and count the number of matching vowels in a pair of string using for loop.
(Without using inbuilt function)
 */
import java.util.Scanner;

public class Que4 {
    static int[][] creatingArray(int row,int column){
        int arr[][]=new int[row][column];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.format("Enter (%d,%d)th element of the matrix ---> ",(i+1),(j+1));
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        return arr;
    }
    static void display(int arry[][]){
        for(int i=0;i< arry.length;i++){
            for(int j=0;j<arry[i].length;j++)
                System.out.print(arry[i][j]+" ");
            System.out.println();
        }
    }
    static void sumRow(int x[][]){
        int sum;
        for (int i=0;i<x.length;i++){
            sum=0;
            for(int j=0;j<x[i].length;j++){
                sum=sum+x[i][j];
            }
            System.out.println("Sum of "+(i+1)+" Row ---> "+sum);
        }
    }
    static void sumColumn(int y[][]){
        int sum;
        int a=0;
        for (int j =0;j<y[a].length;j++){
            sum=0;
            for(int i=0;i<y.length;i++){
                sum=sum+y[i][j];
            }
            System.out.format("Sum of %d Column ---> %d",(j+1),sum);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.print("Enter the number of Row's you want in the Matrix ---> ");
        int row= cs.nextInt();
        System.out.print("Enter the number of column you want the matrix ---> ");
        int column= cs.nextInt();
        System.out.println();
        int [][]arrr;
        arrr=creatingArray(row,column);
        System.out.println("your given Matrix is --->");
        display(arrr);
        System.out.println();
        System.out.println("Row Summation of your given matrix --->");
        sumRow(arrr);
        System.out.println();
        System.out.println("Colum Summation of your given matrix --->");
        sumColumn(arrr);
    }
}
