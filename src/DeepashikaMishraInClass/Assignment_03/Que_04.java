package DeepashikaMishraInClass.Assignment_03;

import java.util.Scanner;

abstract class Book_Que04{
    public String bookTitle;
    public double bookPrice;
    Book_Que04(String bName){
        this.bookTitle=bName;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }
    public void setBookPrice(double bookPrice){
        this.bookPrice=bookPrice;
    }
    public double getBookPrice() {
        return this.bookPrice;
    }
    abstract public void setPrice();
}
class Fiction_Que04 extends Book_Que04{
    Fiction_Que04(String fictionName){
        super(fictionName);
        setPrice();
    }
    @Override
    public void setPrice(){
        setBookPrice(24.99);
    }
}
class NonFiction_Que04 extends Book_Que04{
    NonFiction_Que04(String nonFictionName){
        super(nonFictionName);
        setPrice();
    }
    @Override
    public void setPrice(){
        this.bookPrice=37.99;
    }
}
public class Que_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        boolean check=true;
        while (check) {
            System.out.print("Enter Type of Book(Fiction/Non-Fiction) ---> ");
            String bName=sc.nextLine();
            System.out.println();
            if (bName.equals("Fiction") || bName.equals("fiction")) {
                check = false;
                System.out.print("Enter the Name of any Fiction Book ---> ");
                bName = sc.nextLine();
                Fiction_Que04 fiction_que04 = new Fiction_Que04(bName);
                System.out.format("Price for \"%s\" ---> %f", fiction_que04.getBookTitle(), fiction_que04.getBookPrice());
                System.out.println();
            } else if (bName.equals("Non-Fiction") || bName.equals("non-fiction")) {
                check = false;
                System.out.print("Enter the Name of any Non-Fiction Book ---> ");
                bName = sc.nextLine();
                NonFiction_Que04 nonFiction_que04 = new NonFiction_Que04(bName);
                System.out.format("Price for \"%s\" ---> %f", nonFiction_que04.getBookTitle(), nonFiction_que04.getBookPrice());
                System.out.println();
            } else
                System.out.println("Error!! ---> Enter The Valid Input\nRe-Enter\n");
        }
    }
}
