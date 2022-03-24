package CSI_VCODE;
interface Anonymous{
    int getValue();
//    void getPrint();
}
public class Que_50 {
    private int a=90;

    public static void main(String[] args) {
        int a=78;
        Anonymous anonymous=new Anonymous() {
            @Override
            public int getValue() {
                return 10;
            }
            public void getPrint(){// here this method will not create any error
                //but when it will get call using object, it will show compilation error
                //as this method is undefined in the interface class
                System.out.println(a);
            }
        };
        /*
        anonymous.getPrint(); ---> not allowed
        bcz method getPrint() is Undefined in Anonymous class which causes compilation error

        anonymous.getPrint(); want to make this line in use
        you have to make a method in interface class
         */
        System.out.println(anonymous.getValue());
    }
}
