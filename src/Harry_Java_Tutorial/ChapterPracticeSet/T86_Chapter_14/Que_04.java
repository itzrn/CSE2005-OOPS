package Harry_Java_Tutorial.ChapterPracticeSet.T86_Chapter_14;

import java.util.Scanner;

public class Que_04 {
    public static void main(String[] args) {
        System.out.print("Enter the Number of Member You Have in Your family ---> ");
        Scanner sc = new Scanner(System.in);
        int NoMem= sc.nextInt();
        String[] FamilyMemberName=new String[NoMem];
        System.out.println("Enter Family Member Name According To Your Priority --->");
        for (int i =0;i<NoMem;i++){
            FamilyMemberName[i]= sc.next();
        }
        System.out.println();
        System.out.print("Enter Index of Particular Member According tp your Priority ---> ");
        int count=0;
        boolean check=true;
        while (check && count<=5) {
            int indPri = sc.nextInt();
            try {
                System.out.println("According To Your Priority ---> " + FamilyMemberName[indPri - 1]);
                check=false;
            } catch (ArrayIndexOutOfBoundsException Ari) {
                System.out.println("Error !!");
                System.out.print("Enter Valid Index ---> ");
                count++;
            }
            if(count>5)
                System.out.println("Session timeOut, You tried Max Time!");
        }
    }
}
