package Harry_Java_Tutorial.T65_Package.codeWithAryan01;
//package AccessModifersTest01;
public class AryanHug {
    public int x=5;
    protected int y=45;
    int z=6;
    private int a=78;

    public void met1(){
        System.out.println("Public int x ---> "+x);
        System.out.println("Protected int y --> "+y);
        System.out.println("int z ---> "+z);
        System.out.println("private int a ---> "+a);
        a=16;
        System.out.println("After change in private int a ---> "+a);
    }

    public static void main(String[] args) {
        System.out.println("This is time for Aryan to Hug!!");
    }
}
