package Harry_Java_Tutorial.ChapterPracticeSet.T86_Chapter_14;

import java.util.Scanner;

class CustomException extends Exception{
    @Override
    public String getMessage(){
        return "Session timeOut, You tried Max Time!";
    }
}
public class Que_05 {
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
            if(count>5){
                try {
                    throw new CustomException();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
