package Harry_Java_Tutorial.ChapterPracticeSet.T39_Chapter_08;

class Employee{
    //try not to make duplicate class under same package
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
public class Que1 {
    public static void main(String[] args) {
        Employee aryan=new Employee();
        aryan.setName("CodeWithAryan");
        aryan.salary=987766;
        System.out.println(aryan.getSalary());
        System.out.println(aryan.getName());// ye line likhne ke baad agar upar vali line n likhi hoti, to ye null print krta
    }
}