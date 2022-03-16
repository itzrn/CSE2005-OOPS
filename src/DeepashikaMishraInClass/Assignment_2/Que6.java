package DeepashikaMishraInClass.Assignment_2;

/*
Write a java program to create a 1D-array. Find the maximum even no present in that array.
 */
import java.util.Scanner;

public class Que6 {
    static int[] creatingArray(int n){
        int[]a=new int[n];
        Scanner cs=new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.format("Enter %d Element ---> ",(i+1));
            a[i]=cs.nextInt();
        }
        return a;
    }
    static int greatest(int[]n){
        int c=0;
        for (int j : n) {
            if (j % 2 == 0)
                c = c + 1;
        }
        int[] c1=new int[c];
        int c2=0;
        for (int k : n) {
            if (k % 2 == 0) {
                c1[c2] = k;
                c2 += 1;
            }
        }
        int big=c1[0];
        for(int i=1;i<c;i++){
            if(c1[i]>big)
                big=c1[i];
        }
        return big;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of element ---> ");
        System.out.println("Max ---> "+greatest(creatingArray(sc.nextInt())));
    }
}
