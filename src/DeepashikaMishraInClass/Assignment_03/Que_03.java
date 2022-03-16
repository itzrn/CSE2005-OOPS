package DeepashikaMishraInClass.Assignment_03;

import java.util.Scanner;

class CollageCourse{
    private final String department;
    private final int courseNumber;
    private final int credit;
    public float courseFee;

    CollageCourse(String department, int courseNumber, int credit){
        this.department=department;
        this.courseNumber=courseNumber;
        this.credit=credit;
        this.courseFee=0f;
    }

    public void  display(){
        System.out.format("Course Name ---> %s%d",department,courseNumber);
        courseFee=credit*120;
        System.out.println();
    }

    public  void theoryDisplay(){
        System.out.println("Course Amount to Pay ---> "+courseFee);
    }
}
class LabCourse extends CollageCourse{

    LabCourse(String dep, int curNum, int cre) {
        super(dep, curNum, cre);
    }

    @Override
    public void  display(){
        super.display();
        System.out.format("Total Amount for the Given Course which is embedded with Lab---> %f$",(super.courseFee+50));
    }
}
public class Que_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Course Department --->");
        String name= sc.next();
        System.out.print("Enter Course Number ---> ");
        int courseNo= sc.nextInt();
        System.out.print("Enter Number of Credits ---> ");
        int noOfCredit=sc.nextInt();
        LabCourse labCourse=new LabCourse(name,courseNo,noOfCredit);
        CollageCourse collageCourse=new CollageCourse(name,courseNo,noOfCredit);
        if(name.equals("CHY")||name.equals("BIO")||name.equals("CIS")||name.equals("PHY"))
            labCourse.display();
        else {
            collageCourse.display();
            collageCourse.theoryDisplay();
        }
    }
}
