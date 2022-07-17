package Assignment.Hanugna.Assignment_10;
/*
Write A java Program to read Excel data using Collection
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ExcelSheetFormat<T,t> {
    public void display(ArrayList<T> name, ArrayList<t> regNo){
        System.out.println("The Following Output in Excel Format --->");
        System.out.println();
        System.out.println("Serial-No.\t\tNAME\t\t\t\t\t\t\tREGISTRATION-NUMBER");
        for (int i=0;i<name.size();i++){
            System.out.format("%d\t\t\t\t%s\t\t\t\t\t\t\t\t\t\t%s",(i+1),name.get(i),regNo.get(i));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ExcelSheetFormat<String,String> excelSheetFormat=new ExcelSheetFormat<>();
        ArrayList<String>name=new ArrayList<>();
        ArrayList<String>Id=new ArrayList<>();
        System.out.println("Enter The List --->");
        boolean check=true;
        int c=0;
        while (check){
            System.out.println(c+1);
            System.out.print("Name ---> ");
            name.add(sc.next());
            System.out.print("Registration-Number ---> ");
            Id.add(sc.next());
            System.out.println();
            if (c>=2) {
                System.out.print("If You Want to Increase Your List type true else type false ---> ");
                check = sc.nextBoolean();
            }
            c++;
        }
        excelSheetFormat.display(name,Id);
    }
}
