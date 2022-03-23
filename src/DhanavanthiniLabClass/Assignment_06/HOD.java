package DhanavanthiniLabClass.Assignment_06;
interface LabInCharge{
    String LabName = "Computer Science";
    int roomNum = 302;
    void install();
}

abstract class PHDScholar{
    public String scholarName;
    public int labConducted;

    PHDScholar(String scholarName,int labConducted){
        this.scholarName=scholarName;
        this.labConducted=labConducted;
    }

    abstract public void help();
    public void LabAssigned(){
        System.out.println("Scholar Name ---> "+scholarName);
        System.out.println("Number of time's lab conducted ---> "+labConducted);
        System.out.println("This is labAssigned() method of PHD Scholar!");
        System.out.println();
    }
}

class Professor extends PHDScholar implements LabInCharge{
    private String Subject;
    private String emp_id;

    Professor(String scholarName,int labConducted){
        super(scholarName,labConducted);
    }
    public void setSubject(String Subject){
        this.Subject=Subject;
    }
    public void setEmp_id(String emp_id){
        this.emp_id=emp_id;
    }

    @Override
    public void help(){
        System.out.println("This is help() method of PHD-Scholar class\n\t\tIn Professor class!");
        System.out.println();
    }
    @Override
    public void install(){
        System.out.println("This install() method of interface labInCharge!");
        System.out.println();
    }

    public void teaches(){
        System.out.println("Subject ---> "+Subject);
        System.out.println("Employee Id ---> "+emp_id);
        System.out.println("This is teaches() Method of class Professor!");
    }
}

public class HOD {
    public static void main(String[] args) {
        Professor professor=new Professor("Aryan",6);
        System.out.println("\t\t"+professor.LabName);
        System.out.println("\t\t\t\t"+professor.roomNum);
        System.out.println();
        professor.install();
        professor.help();
        professor.LabAssigned();
        professor.setSubject("Computer");
        professor.setEmp_id("94763484");
        professor.teaches();
    }
}