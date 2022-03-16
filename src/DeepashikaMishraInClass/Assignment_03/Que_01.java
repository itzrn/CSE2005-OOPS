package DeepashikaMishraInClass.Assignment_03;

import java.util.Scanner;

public class Que_01 {
    private String holderName;
    private long accountNumber;
    public double balanceAmount;
    public double depositAmount;
    public double withdrawAmount;


    public double deposit(){
        balanceAmount=balanceAmount+depositAmount;
        return balanceAmount;
    }

    public double withDraw(){
        balanceAmount=balanceAmount-withdrawAmount;
        return balanceAmount;
    }

    public  void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Holder Name ---> ");
        this.holderName= sc.nextLine();
        System.out.print("Enter Account Number ---> ");
        this.accountNumber= sc.nextLong();
        System.out.print("Enter Bank Balance ---> ");
        balanceAmount= sc.nextDouble();
        System.out.println();
    }

    public void displayDeposit(){
        System.out.print("\""+this.holderName+"\" With Account Number \""+this.accountNumber+"\" Have ");
        System.out.println("BANK BALANCE ---> "+deposit());
    }
    public void displayWithdraw(){
        System.out.print("\""+this.holderName+"\" With Account Number \""+this.accountNumber+"\" Have ");
        System.out.println("BANK BALANCE ---> "+withDraw());
    }
}
class BankQue_01{
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        Que_01 que_01=new Que_01();
        que_01.input();
        boolean check=true;
        while(check) {
            System.out.print("Deposit or Withdraw ---> ");
            String choose= cs.next();
            if (choose.equals("Deposit") || choose.equals("deposit")) {
                System.out.print("Enter Your Deposit Money ---> ");
                que_01.depositAmount= cs.nextDouble();
                System.out.println();
                check=false;
                que_01.displayDeposit();
            }
            else if (choose.equals("Withdraw") || choose.equals("withdraw")) {
                while (check) {
                    System.out.print("Enter Your Withdraw Amount ---> ");
                    que_01.withdrawAmount = cs.nextDouble();
                    System.out.println();
                    if (que_01.withdrawAmount > que_01.balanceAmount) {
                        System.out.println("Invalid Entry!!\nRe-Enter Withdraw Amount");
                        System.out.println();
                    } else
                        check = false;
                }
                que_01.displayWithdraw();
            }
            else {
                System.out.println();
                System.out.println("Error !! ---> Invalid Entry\nEnter a valid Transition --->");
                System.out.println();
            }
        }
    }
}