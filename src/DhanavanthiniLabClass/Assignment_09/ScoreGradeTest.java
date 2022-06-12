package DhanavanthiniLabClass.Assignment_09;

import java.util.Scanner;

public class ScoreGradeTest {
    ScoreException scoreException=new ScoreException();
    public int input(int n) {
        String name;
        int id;
        int []marks =new int[3];
        Scanner sc =new Scanner(System.in);
        System.out.format("Enter %d Student Name  ---> ",(n+1));
        name= sc.next();
        System.out.format("Enter %d Student Id ---> ",(n+1));
        id= sc.nextInt();
        System.out.format("%s \tWith Id ---> %d",name,id);
        System.out.println();
        for (int i=0;i<3;i++){
            System.out.format("Enter %d Subject Marks ---> ",(i+1));
            while (true) {
                try {
                    marks[i]= scoreException.inputMarks(sc.nextInt());
                    break;
                } catch (ScoreException e) {
                    System.out.println(" In valid Input !");
                    System.out.print("Enter Correct Input ---> ");
                }
            }
        }
        int sum=0;
        for (int i=0;i<3;i++){
            sum=sum+marks[i];
        }
        return sum;
    }


    public String avg(int n){
        if (n/3 >= 90)
            return "A";
        else if(n/3>=80 && n/3<90)
            return "B";
        else if (n/3>=70&&n/3<80)
            return "C";
        else if(n/3>=60&&n/3<70)
            return "D";
        else
            return "F";
    }

    public static void main(String[] args) {
        ScoreGradeTest scoreGradeTest=new ScoreGradeTest();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No of Students ---> ");
        int n= sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("Grade ---> "+scoreGradeTest.avg(scoreGradeTest.input(i)));
            System.out.println();
        }
    }
}

