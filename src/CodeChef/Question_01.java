package CodeChef;
/*
Given an array find the element in the array which occurs the maximum number of time.
if more than 1 element occurs maximum number of time print -1
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int countZero = 0;
        for (int i=0;i<n;i++){
            array[i] = sc.nextInt();
            if (array[i] == 0)
                countZero++;
        }

        LinkedList<Integer> list = new LinkedList<>();
        int count = 0;
        for (int i=0;i<n;i++) {
            if (array[i] != 0) {
                for (int j = i+1; j < n; j++) {
                    if (array[i] == array[j]) {
                        if (count == 0)
                            list.add(array[i]);
                        count++;
                        array[j] = 0;
                    }
                }
                array[i] = 0;
                count = 0;
            }
        }
        if (list.size() == 1 && (countZero == 0 || countZero == 1))
            System.out.println(list.get(0));
        else if(list.size() == 0 && countZero>1)
            System.out.println(0);
        else
            System.out.println(-1);
    }
}
