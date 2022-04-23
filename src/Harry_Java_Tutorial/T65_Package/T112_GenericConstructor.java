package Harry_Java_Tutorial.T65_Package;

//uses a generic constructor
public class T112_GenericConstructor {
    /**
     * You can declare Generic Constructor in a class
     * whether your class is generic or not
     *
     * How to know that a given Constructor is generic type --->
     * the parameter which we give to constructor is generic type
     */
    private double val;
    <T extends Number> T112_GenericConstructor(T arg){
        val=arg.doubleValue();
    }
    public void showAll(){
        System.out.println("Val ---> "+val);
    }
}
class TestGenericT112{
    public static void main(String[] args) {
        int a=8;//
        Integer a1=Integer.valueOf(a);// ---> AutoBoxing
        int a2=a1.intValue();//--->Boxing
        T112_GenericConstructor t112_genericConstructor=new T112_GenericConstructor(a1);
        t112_genericConstructor.showAll();
    }
}
