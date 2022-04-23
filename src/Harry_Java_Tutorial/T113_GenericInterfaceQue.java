package Harry_Java_Tutorial;

interface Mathematics<T extends Number>{
    int powerOf(T t);
}

class PowerOFThree<T extends Number> implements Mathematics<T>{
    @Override
    public int powerOf(T i){
        return i.intValue()* i.intValue()* i.intValue();
    }
    public double powerOf1(T i){
        return i.doubleValue()*i.doubleValue()*i.doubleValue();
    }
}
public class T113_GenericInterfaceQue {
    public static void main(String[] args) {
        PowerOFThree<Integer>powerOFThree=new PowerOFThree<>();
        Integer a=Integer.valueOf(65);
        System.out.println(powerOFThree.powerOf(a));
        System.out.println(powerOFThree.powerOf1(a));
    }
}
