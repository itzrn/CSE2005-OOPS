package DSAJAVA.Array;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Sorting<Number> sorting=new Sorting<>();//or instead of number it can be---> Integer, Double, Float, Long
        System.out.print("Enter the Number of element you Want in the array ---> ");
        int[]array=new int[sc.nextInt()];
        System.out.println();
        System.out.println("Enter your all element ---> ");
        for (int i=0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        array=sorting.selectionSort(array);
        for (int j : array) {
            System.out.print(j + " ");
        }


        Sorting<Long>longSorting=new Sorting<>();
        Long[]longs={1655L,25L,35L,99L,5L,67L,78L,48L};
        longs=longSorting.selectionSortGeneric(longs);
        for (Long aLong : longs) {
            System.out.print(aLong+" ");
        }

        int[]a={2,3445,66,767,75345,2323,576,75674563,232};
        int[]b=sorting.bubbleSort(a);
        for (int j : b) {
            System.out.println(j+" ");
        }

        a=sorting.insertionSort(a);
        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}
