package Harry_Java_Tutorial.ChapterPracticeSet.T15_Chapter_03;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;

public class T15_Chapter_03 {
    public static void main(String[] args) {
        System.out.println("QUE 1 ---> ");
        Scanner sc = new Scanner(System.in);
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter a Uppercase String --->");
        String name = sc.next();
        System.out.println("Your given String in lowercase ---> "+name.toLowerCase());
        System.out.println();
        System.out.println("QUE 2 ---> ");
        System.out.print("Enter a set of Strings which contain space in it --->");
        String name1 = cs.nextLine();
        System.out.println("Replacing space with underscore ---> "+name1.replace(" ","_"));
//        System.out.println("replacing all space with '_' ---> "+name1.replaceAll(" ","_"));
        System.out.println();
        System.out.println("QUE 3 --->");
        System.out.print("Enter Name ---> ");
        String name2 = cs.nextLine();
        String txt = "Dear <|name|>, trans a lot";
        System.out.println(txt.replace("<|name|>",name2));
        System.out.println();
        System.out.println("QUE 4 --->");
        System.out.print("Enter a set of Strings which contain double and triple spaces ---> ");
        String name3 = cs.nextLine();
        System.out.println("Index for double space, if present ---> "+name3.indexOf("  "));
        System.out.println("Index for triple spaces, if present ---> "+name3.indexOf("   "));
        System.out.println();
        System.out.println("QUE 5 --->");
        System.out.println("\"Dear Aryan,\n  This Java course is nice.\nThanks!\"");
    }
}
