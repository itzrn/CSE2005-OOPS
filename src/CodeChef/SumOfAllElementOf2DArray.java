package CodeChef;

import java.util.Scanner;

public class SumOfAllElementOf2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long[][] array = new long[n][m];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                array[i][j] = sc.nextLong();
            }
        }
        long sum = 0;
        for (long[] longs : array) {
            for (long aLong : longs) {
                sum = sum + aLong;
            }
        }
        System.out.println(sum);
    }
}
