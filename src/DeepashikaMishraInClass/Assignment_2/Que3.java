package DeepashikaMishraInClass.Assignment_2;

/*
Write a java program to print and count the number of matching vowels in a pair of string using for loop.
(Without using inbuilt function)
 */
import java.util.Scanner;

public class Que3 {
    static void matchingVowel(String a, String b){
        int []count= {0,0,0,0,0,0,0,0,0,0};
        for (int i=0;i<a.length();i++){
                for (int j = 0; j < b.length(); j++) {
                 if(a.charAt(i)=='a'&&b.charAt(j)=='a')
                     count[0]=count[0]+1;
                 if(a.charAt(i)=='e'&&b.charAt(j)=='e')
                     count[1]=count[1]+1;
                 if(a.charAt(i)=='i'&&b.charAt(j)=='i')
                     count[2]=count[2]+1;
                 if(a.charAt(i)=='o'&&b.charAt(j)=='o')
                     count[3]=+1;
                 if(a.charAt(i)=='u'&&b.charAt(j)=='u')
                     count[4]=+1;
                 if(a.charAt(i)=='A'&&b.charAt(j)=='A')
                     count[5]=+1;
                 if(a.charAt(i)=='E'&&b.charAt(j)=='E')
                     count[6]=+1;
                 if (a.charAt(i)=='I'&&b.charAt(j)=='I')
                     count[7]=+1;
                 if(a.charAt(i)=='O'&&b.charAt(j)=='O')
                     count[8]=+1;
                 if(a.charAt(i)=='U'&&b.charAt(j)=='U')
                     count[9]=+1;
                }
        }
        if(count[0]>0)
            System.out.print("a ");
        if(count[1]>0)
            System.out.print("e ");
        if(count[2]>0)
            System.out.print("i ");
        if(count[3]>0)
            System.out.print("o ");
        if(count[4]>0)
            System.out.print("u ");
        if(count[5]>0)
            System.out.print("A ");
        if(count[6]>0)
            System.out.print("E ");
        if(count[7]>0)
            System.out.print("I ");
        if(count[8]>0)
            System.out.print("O ");
        if(count[9]>0)
            System.out.print("U ");
        int c=0;
        for(int k = 0;k<=9;k++){
            if(count[k]>0)
                c=c+1;
        }
        System.out.println();
        System.out.format("Total number of matching character's are ---> %d",c);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First String ---> ");
        String a=sc.next();
        System.out.print("Enter Second String ---> ");
        String b=sc.next();
        matchingVowel(a,b);
    }
}