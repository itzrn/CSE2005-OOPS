package DhanavanthiniLabClass.Assignment_03;

import java.util.Scanner;

class BankQue_02 {

    String name;
    long accountNumber;
    double amount;
    String accountType;
    double withDraw;

    public long getAccountNumber(){
        return this.accountNumber;
    }
    public void setWithDraw(double withDraw) {
        this.withDraw = withDraw;
    }
    public double getAmount() {
        return this.amount;
    }
    public String getName(){
        return this.name;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getAccountType(){
        return this.accountType;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name ---> ");
        this.name=sc.nextLine();
        System.out.print("Enter Your Account Number ---> ");
        this.accountNumber= sc.nextLong();
        System.out.print("Enter Your Bank Balance ---> ");
        this.amount= sc.nextDouble();
    }
    public double updateAmount(){
        this.amount = this.amount - this.withDraw;
        return this.amount;
    }

}

public class Que_02ArrayOfObject {
    public static void main(String[] args) {
        System.out.println("\t\t\tWelcome To ABC Bank");
        Scanner cs=new Scanner(System.in);
        System.out.print("Enter Number of Customer of the Bank ---> ");
        int n=cs.nextInt();
        System.out.println();
        BankQue_02[] bankQue1s=new BankQue_02[n];
        for(int i=0;i<n;i++) {
            bankQue1s[i] = new BankQue_02();
            boolean check = true;
            String accType = null;
            while (check) {
                System.out.print("Enter Your Account Type(Current or Saving)---> ");
                accType = cs.next();
                if (accType.equals("Current") || accType.equals("Saving"))
                    check = false;
                else {
                    System.out.println();
                    System.out.println("Error!! ---> Enter the valid Account type\n Re-Enter Account Type --->");
                    System.out.println();
                }
            }
            bankQue1s[i].setAccountType(accType);
            bankQue1s[i].input();
            check = true;
            while (check) {
                System.out.print("Enter your Withdraw Amount ---> ");
                double wDraw = cs.nextDouble();
                if (bankQue1s[i].amount >=  wDraw) {
                    bankQue1s[i].setWithDraw(wDraw);
                    check = false;
                } else {
                    System.out.println();
                    System.out.println("Error!! ---> You Entered Invalid Withdraw Amount\n Re-Enter valid Withdraw Amount");
                    System.out.println();
                }
            }
            System.out.println();
        }
        System.out.println("ACCOUNT NUMBER\t\t\tNAME\t\t\t\t\tACCOUNT TYPE\t\t\tCURRENT BANK BALANCE");
        for(int i =0;i<n;i++){
            System.out.println(bankQue1s[i].getAccountNumber()+"\t\t\t\t\t\t"+bankQue1s[i].getName()+
                    "\t\t\t\t\t"+bankQue1s[i].getAccountType()+"\t\t\t\t\t"+bankQue1s[i].updateAmount());
        }
        System.out.println();
        double sum=0;
        for(int i=0;i<n;i++){
            sum=sum+bankQue1s[i].getAmount();
        }
        System.out.println("Total Amount of Money with Bank ---> "+sum);
    }
}