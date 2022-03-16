package DeepashikaMishraInClass.Assignment_03;

import java.util.Scanner;

interface Publication{
    void journalCount(int a);
    void projectCount(int b);
    void patternCount(int c);
}
class Department{
    String departmentName;
    String hodName;
    int totalStudent;
    int noOfSection;
    Department(String departmentName,String hodName,int totalStudent,int noOfSection){
        this.departmentName=departmentName;
        this.hodName=hodName;
        this.totalStudent=totalStudent;
        this.noOfSection=noOfSection;
    }
    public void showDepartmentDetail(){
        System.out.println("Department Detail --> ");
        System.out.println(this.departmentName);
        System.out.println(this.hodName);
        System.out.println("Total Number of Student ---> "+this.totalStudent);
        System.out.println("Number of Section ---> "+this.noOfSection);
    }
}
class StaffMember extends Department implements Publication{
    private String staffMember;
    private int staffId;
    private String staffQualification;
    private String designation;
    private String experience;

    public String getStaffMember() {
        return staffMember;
    }

    public void setStaffMember(String staffMember) {
        this.staffMember = staffMember;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffQualification() {
        return staffQualification;
    }

    public void setStaffQualification(String staffQualification) {
        this.staffQualification = staffQualification;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }


    StaffMember(String departmentName, String hodName,int totalStudent,int noOfSection){
        super(departmentName,hodName,totalStudent,noOfSection);
    }
    void showStaffDetails(){
        System.out.println("Staff Detail --->");
        System.out.println(getStaffMember());
        System.out.println(getStaffId());
        System.out.println(getStaffQualification());
        System.out.println(getDesignation());
        System.out.println(getExperience());
    }
    public void journalCount(int a){
        System.out.println("Journal Count of "+this.staffMember+" ---> "+a);
    }
    public void projectCount(int b){
        System.out.println("Project Count of "+this.staffMember+" ---> "+b);
    }
    public void patternCount(int c){
        System.out.println("Pattern Count of "+this.staffMember+" ---> "+c);
    }

}
public class Que_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Department Name ---> ");
        String departmentName= sc.next();
        System.out.print("Enter HOD Name ---> ");
        String hodName= sc.next();
        System.out.print("Enter Total number of Student ---> ");
        int totalStudent=sc.nextInt();
        System.out.print("Enter Number of section ---> ");
        int noOfSection= sc.nextInt();
        StaffMember staffMember=new StaffMember(departmentName,hodName,totalStudent,noOfSection);
        System.out.print("Enter Staff Member Name ---> ");
        staffMember.setStaffMember(sc.next());
        System.out.print("Enter Staff ID ---> ");
        staffMember.setStaffId(sc.nextInt());
        System.out.print("Enter Staff Qualification ---> ");
        staffMember.setStaffQualification(sc.next());
        System.out.print("Enter Staff Designation ---> ");
        staffMember.setDesignation(sc.next());
        System.out.print("Enter Staff Experience ---> ");
        staffMember.setExperience(sc.next());
        System.out.print("Enter Staff Journal Count ---> ");
        int a= sc.nextInt();
        System.out.print("Enter Staff projectCount ---> ");
        int b= sc.nextInt();
        System.out.print("Enter Staff patternCount ---> ");
        int c= sc.nextInt();
        System.out.println();
        System.out.println();
        System.out.println("Department Details ---> ");
        staffMember.showDepartmentDetail();
        System.out.println();
        System.out.println("Staff Detail ---> ");
        staffMember.showStaffDetails();
        System.out.println();
        staffMember.journalCount(a);
        staffMember.projectCount(b);
        staffMember.patternCount(c);
    }
}