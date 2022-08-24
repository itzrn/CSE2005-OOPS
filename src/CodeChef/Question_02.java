package CodeChef;

import java.util.LinkedList;
import java.util.Scanner;

//public class Question_02 {
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] array = new int[n];
//        for (int i = 0;i < n;i++){
//            array[i] = sc.nextInt();
//        }
//
//        boolean check = true;
//        LinkedList<Integer> list = new LinkedList<>();
//        int temp;
//
//        for (int i= 0;i<n;i++){
//            for (int j=0;j<3;j++){
//                if (j == 0)
//                    temp = array[i];
//                else if (j == 1)
//                    temp = 2 * array[i];
//                else
//                    temp = 0;
//                for (int k=0;k<n;k++){
//                    if (temp == array[k])
//                        list.add(temp);
//                    else if (array[k] - array[i] == temp)
//                        list.add(temp);
//                    else if (array[i] - array[k] == temp)
//                        list.add(temp);
//                    else if (array[k] + array[i] == temp)
//                        list.add(temp);
//                    else
//                        list.add(array[k]);
//                }
//
//
//                for (int k=1;k<n;k++){
//                    if (!list.get(0).equals(list.get(k))) {
//                        check = false;
//                        break;
//                    }
//                }
//                if (check){
//                    System.out.println("yes");
//                    break;
//                }
//                list=new LinkedList<>();
//                check=true;
//            }
//        }
//    }
//}
