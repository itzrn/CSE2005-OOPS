package CSI_VCODE;

public class MyOwn_50 {
    private int a=90;
    private int me(){
        a=a+200;
        return a;
    }
    public static void main(String[] args) {
        int a=60;
        System.out.println("Without making object ---> "+a);
        MyOwn_50 myOwn_50=new MyOwn_50();
        System.out.println("by using object ---> "+myOwn_50.a);
        System.out.println("Value of a get change using me() method ---> "+myOwn_50.me());
    }
}
