package DhanavanthiniLabClass.Assignment_04;

import java.util.Scanner;

public class Que_01 {
    static void menu(){
        System.out.println("1 ---> To Get a character from String");
        System.out.println("2 ---> To reverse a string");
        System.out.println("3 ---> To sort a string");
        System.out.println("4 ---> To Swapping every pair of character");
        System.out.println("5 ---> To remove leading zeros");
        System.out.println("6 ---> To compare two String");
        System.out.println("7 ---> To insert a String into another String");
        System.out.println("8 ---> To concatenate two String");
        System.out.println();
    }

    static String pairSwapping(int a,String b){
        String c="";
        for (int i=0;i<a;i+=2){
            c=c+b.charAt(i+1);
            c=c+b.charAt(i);
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner cs=new Scanner(System.in);
        menu();
        System.out.print("Enter your choice To perform the particular task ---> ");
        int choice= sc.nextInt();
        System.out.println();
        switch (choice){
            case 1:
                System.out.print("Enter a String ---> ");
                String string1= sc.next();
                System.out.print("Enter the Character of which you want the index ---> ");
                String char1=sc.next();
                for (int i =0;i<string1.length();i++){
                    if (char1.charAt(0) ==string1.charAt(i)){
                        System.out.format("Index of %s in %s is %d",char1,string1,(i+1));
                        break;
                    }
                }
                break;

            case 2:
                System.out.print("Enter a String ---> ");
                String string2= sc.next();
                String string_02="";
                for(int i =string2.length()-1;i>=0;i--){
                    string_02=string_02+string2.charAt(i);
                }
                System.out.println("Your Reversed String ---> "+string_02);
                break;

            case 3:
                System.out.print("Enter a String ---> ");
                String string3= sc.next();
                String string_03="";
                int big;
                int small;
                char[] strarr=new char[string3.length()];
                for (int i=0;i<string3.length();i++){
                    strarr[i]=string3.charAt(i);
                }
                char temp;
                for(int i=0;i<string3.length();i++){
                    small=strarr[i];
                    for(int j=i+1;j<string3.length();j++){
                        big=strarr[j];
                        temp=strarr[i];
                        if (small>big) {
                            small = big;
                            strarr[i]=strarr[j];
                            strarr[j]=temp;
                        }
                    }
                    string_03=string_03+(char)small;
                }
                System.out.println("After performing the task ---> "+string_03);
                break;

            case 4:
                System.out.print("Enter a String ---> ");
                String string4=sc.next();
                int a=string4.length();
                if(a%2==0)
                    System.out.println("After performing task ---> "+pairSwapping(a,string4));
                else {
                    String b = pairSwapping(a - 1, string4) + string4.charAt(a - 1);
                    System.out.println("After performing the task ---> "+b);
                }
                break;

            case 5:
                System.out.print("Enter a integer ---> ");
                int integer5=sc.nextInt();
                System.out.println("Your integer without leading zero's ---> "+integer5);
                break;
            case 6:
                System.out.print("Enter String first ---> ");
                String string6 = sc.next();
                System.out.print("Enter String second ---> ");
                String string61= sc.next();
                if (string6.length()>string61.length() || string61.length()>string6.length()){
                    System.out.println("Your Entered two Strings are not same!!");
                    break;
                }
                else {
                    int count = 0;
                    for (int i = 0; i < string61.length(); i++) {
                        if (string6.charAt(i)!=string61.charAt(i)) {
                            System.out.println("Your Entered two Strings are not same!!");
                            count=count+1;
                            break;
                        }
                    }
                    if (count==0){
                        System.out.println("Your given two String are same !!");
                    }
                }
                break;

            case 7:
                System.out.print("Enter the sets of String ---> ");
                String string7=cs.nextLine();
                System.out.print("Enter a String Which is to be inserted ---> ");
                String string71= sc.next();
                System.out.format("Enter the index after at which you want to insert '%s' --->",string71);
                int index=sc.nextInt();
                String string73="";
                for (int i =0;i<index;i++){
                    string73+=string7.charAt(i);
                }
                string73 =string73+" "+string71;
                for (int i =index;i<string7.length();i++){
                    string73+=string7.charAt(i);
                }
                System.out.println("Your modified String ---> "+string73);
                break;

            case 8:
                System.out.print("Enter First String ---> ");
                String string8=sc.next();
                System.out.print("Enter Second String ---> ");
                String string82=sc.next();
                for(int i =0;i<string82.length();i++){
                    string8+=string82.charAt(i);
                }
                System.out.println("Your Concatenated string ---> "+string8);
                break;

            default:
                System.out.println("Error!! ---> Enter the choice between 1 to 8");
        }
    }
}