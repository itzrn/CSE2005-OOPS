import java.util.Scanner;
abstract class P{
    abstract public void setPrice();
}
class P1 extends P{
    P1(){
//        setPrice();
    }
    public void setPrice(){
        System.out.println("I am Abstract setPrice()");
    }
}
public class Dummy2 {
    public static void main(String[] args) {
        P1 p1=new P1();
    }
}