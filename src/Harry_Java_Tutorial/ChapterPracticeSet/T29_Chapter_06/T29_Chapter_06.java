package Harry_Java_Tutorial.ChapterPracticeSet.T29_Chapter_06;

import java.util.Scanner;

public class T29_Chapter_06 {
    public static void main(String[] args) {
        System.out.println("Que 1 ---> ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element you want in the Array ---> ");
        int a = sc.nextInt();
        float[]ar=new float[a];
        for(int i = 0;i<a;i++){
            System.out.print("Enter "+(i+1)+" Element ---> ");
            ar[i]=sc.nextFloat();
        }
        float sum=0.0f;
        for (int i=0;i<a;i++){
            sum=sum+ar[i];
        }
        System.out.println("Sum of ur all given elements ---> "+sum);
        System.out.println();
        System.out.println("Que 2 --->");
        int[]ar1={1,2,3,4,5,6,7,8,9};
        System.out.print("Enter a number to check whether it present in the list or not ---> ");
        int b = sc.nextInt();
        int c=0;
        for (int j : ar1) {
            if (b == j) {
                c++;
                System.out.println("We found the integer");
                break;
            }
        }
        if(c==0){
            System.out.println("We couldn't find the integer");
        }
        System.out.println();
        System.out.println("Que 3 --->");
        System.out.print("Enter the number of student ---> ");
        a= sc.nextInt();
        float[] marks=new float[a];
        for (int i = 0;i<a;i++){
            System.out.print("Enter "+(i+1)+" student mark ---> ");
            marks[i]= sc.nextFloat();
        }
        sum = 0;
        for(float z:marks){
            sum =sum + z;
        }
        System.out.println("Average marks for all student in physics --->"+(sum/a));
        System.out.println();
        System.out.println("Que 4 --->");
        int [][]mat1={{1,2,3},
                      {4,5,6}};
        int [][]mat2={{7,8,9},
                      {3,4,5}};
        int [][]result={{0,0,0},
                        {0,0,0}};
        for (int i =0;i< mat1.length;i++){//row number of time
            for(int j=0;j<mat1[i].length;j++){//column number of time
                result[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Que 5 ---> ");
        System.out.print("Enter the number of element you want to give in a array ---> ");
        int an = sc.nextInt();
        int z=0;
        String[] str=new String[an];
        for(int i=0;i<an;i++){// taking Array input
            ++z;
            if(z==1){
                System.out.print("Enter "+z+"st String ---> ");
                str[i]= sc.next();
            }
            else if(z==2){
                System.out.print("Enter "+z+"nd String ---> ");
                str[i]= sc.next();
            }
            else if (z==3){
                System.out.print("Enter "+z+"rd String ---> ");
                str[i]= sc.next();
            }
            else {
                System.out.print("Enter " + z + "th String ---> ");
                str[i] = sc.next();
            }
        }
        // reversing the array
        an=an/2;
        String str1;
        for(int i =0;i<an;i++){
            str1=str[i];
            str[i]=str[str.length-(1+i)];
            str[str.length-1-i]=str1;
        }
        //printing the array
        for (String s : str) {
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println("Que 6 ---> ");
        System.out.print("Enter the number of element you want in the array ---> ");
        int a1= sc.nextInt();
        int[] com=new int[a1];
        for(int i=0;i<a1;i++){
            System.out.print("Enter "+(i+1)+" element ---> ");
            com[i]= sc.nextInt();
        }
        int big=com[0];
        for(int i=1;i<a1;i++){
            if(com[i]>big)
                big=com[i];
        }
        System.out.println("Maximum number among given input ---> "+big);
        System.out.println();
        System.out.println("Que 7 ---> ");
        System.out.print("Enter the number of element you want in the array ---> ");
        int a2= sc.nextInt();
        int[] com1=new int[a2];
        for(int i=0;i<a2;i++){
            System.out.print("Enter "+(i+1)+" element ---> ");
            com1[i]= sc.nextInt();
        }
        int small=com[0];
        for(int i=1;i<a2;i++){
            if(com1[i]<small)
                small=com1[i];
        }
        System.out.println("Minimum number among given input ---> "+small);
        System.out.println(Integer.MAX_VALUE);// it will give the max range of integer data type
        System.out.println(Integer.MIN_VALUE);// it will give the min range of integer data type
        /*
        so where I used small in that i can keep the Integer.MIN_VALUE
         */
        System.out.println();
        System.out.println("Que 8 ---> ");
        System.out.print("Enter the number of element you want in the array ---> ");
        int a3= sc.nextInt();
        int[]ar3=new int[a3];
        for(int i=0;i<a3;i++){
            System.out.print("Enter "+(i+1)+" element ---> ");
            ar3[i]= sc.nextInt();
        }
        boolean issoted=true;
        for(int i=0;i<a3-1;i++){//checking for ascending order array,similarly can be done for descending order
            if(ar3[i]>ar3[i+1]){
                System.out.println("Array is not sorted");
                issoted=false;
                break;
            }
        }
        if(issoted)
            System.out.println("Array is sorted");
    }
}
