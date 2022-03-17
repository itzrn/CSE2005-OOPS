package DhanavanthiniLabClass.Assignment_05;
/*
Create a SmartShopping class with one billGenerate method.
This method is responsible for generating a bill mentioning the total price and
names of the items purchased by a general customer. It has items to sell like mobile, laptop, and camera.
1, 2, and 3 are the codes respectively for the said items. Their prices are respectively 10000, 60000, and 80000.
There are other two different categories of customers like,
PremiumCustomers and RegularCustomers to the SmartShopping system.
PremiumCustomers will get a discount of 10% on whatever item they buy.
So, in PremiumCustomers class you need to override billGenerate method.
RegularCustomer will get discount of 20% if purchase amount is more than 50000.
So, you need to override again the same method defined in SmartShopping class.
General customer will not get any discount.
Take user inputs of each of the types of customers
(i.e., General customer or Premium Customer or Regular Customer), item want to buy (i.e., the code), etc.
as per the requirements. Generate the bill mentioning total payable amount, item purchased, and type of the customer.
Generate at least one bill per category. Also consider each customer can buy single item in one transaction.
 */

import java.util.Scanner;

class SmartShopping{
    public double billGenerator(int a){
        if(a==1)
            return 10000;
        else if (a==2)
            return 60000;
        else
            return 80000;
    }
}
class PremiumCustomers extends SmartShopping{
    @Override
    public double billGenerator(int a) {
        if (a==1)
            return 9000;
        else if (a==2)
            return 54000;
        else
            return 72000;
    }
}
class RegularCustomers extends SmartShopping{
    @Override
    public double billGenerator(int a){
        if (a==1)
            return 8000;
        else if (a==2)
            return 48000;
        else
            return 64000;
    }
}
public class Bill {
    static void itemsAvailable(){
        System.out.println("Types of Customer ---> Premium Customer, Regular Customer and General Customer");
        System.out.println();
        System.out.println("Code --->\t\tItem");
        System.out.println("1    --->\t\tMobile");
        System.out.println("2    --->\t\tLaptop");
        System.out.println("3    --->\t\tCamera");
        System.out.println();
    }
    static String inputTypeCustom(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Type Of Customer ---> ");
        return sc.nextLine();
    }
    static int inputChoice(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Choice ---> ");
        return sc.nextInt();
    }
    static int errorCheck(int a){
        boolean check=true;
        while (check) {
            if (a == 1 || a == 2 || a == 3)
                check=false;
            else {
                System.out.println("Error!! ---> Invalid Choice, Re-Enter it!!");
                a=inputChoice();
            }
        }
        return a;
    }
    static void display(double amt){
        System.out.println("Amount To pay ---> "+amt);
    }
    static String inputName(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Customer Name ---> ");
        return sc.nextLine();
    }

    public static void main(String[] args) {
        PremiumCustomers premiumCustomers=new PremiumCustomers();
        RegularCustomers regularCustomers=new RegularCustomers();
        SmartShopping smartShopping=new SmartShopping();
        itemsAvailable();
//        errorCheck(inputChoice());
        String typeCustom;
        String name=inputName();
        double amount;
        boolean check=true;
        while (check) {
            typeCustom = inputTypeCustom();
            switch (typeCustom) {
                case "Premium Customer":
                case "Premium customer":
                case "premium customer":
                    amount=premiumCustomers.billGenerator(errorCheck(inputChoice()));
                    System.out.println();
                    System.out.println("\t\tBill");
                    System.out.println("Discount: 10%");
                    System.out.println("Name of Customer ---> "+name);
                    display(amount);
                    check = false;
                    break;
                case "Regular Customer":
                case "Regular customer":
                case "regular customer":
                    amount=regularCustomers.billGenerator(errorCheck(inputChoice()));
                    System.out.println();
                    System.out.println("\t\tBill");
                    System.out.println("Discount: 20%");
                    System.out.println("Name of Customer ---> "+name);
                    display(amount);
                    check = false;
                    break;
                case "General Customer":
                case "General customer":
                case "general customer":
                    amount=smartShopping.billGenerator(errorCheck(inputChoice()));
                    System.out.println();
                    System.out.println("\t\tBill");
                    System.out.println("Discount: 0%");
                    System.out.println("Name of Customer ---> "+name);
                    display(amount);
                    check = false;
                    break;
                default:
                    System.out.println("Error!! ---> Enter the valid Customer Type!!");
            }
        }
    }
}