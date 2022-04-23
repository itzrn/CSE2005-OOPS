import java.util.ArrayList;
interface Inner{
    void ar();
    class Aryan implements Inner{
        @Override
        public void ar() {
            System.out.println("Aryan");
        }

        public static void main(String[] args) {
            Aryan aryan=new Aryan();
            aryan.ar();
        }
    }
}

public class Dummy {
    public static void main(String[] args) {
        ArrayList<Integer>t1=new ArrayList<>();
        ArrayList<Integer>t2=new ArrayList<>();
        t1.add(1);
        t1.add(2);
        t1.add(3);
        t1.add(4);
        t1.add(5);
        t1.add(6);
        t2.add(9);
        t2.add(8);
        t2.add(7);
        t2.add(6);
        t2.add(5);
        t2.add(4);
        System.out.println(t1);
        System.out.println(t2);
//        for (int i=0;i<t1.size();i++){
//            for (int j=0;j<t2.size();j++){
//                if (t1.get(i)== t2.get(j)){
//                    t2.remove(j);
//                }
//            }
//        }
//        t1.addAll(t2);
//        System.out.println(t1);
//        for (int i=0;i<t1.size();i++){
//            for (int j=0;j<t2.size();j++){
//                if(t1.get(i)==t2.get(j)){
//                    t1.remove(i);
//                    break;
//                }
//            }
//        }
//        System.out.println(t1);

        ArrayList<Integer>t3=new ArrayList<>();
        for(int i=0;i<t1.size();i++){
            for(int j=0;j<t2.size();j++){
                if (t1.get(i)==t2.get(j)){
                    t3.add(t1.get(i));
                    break;
                }
            }
        }
        System.out.println(t3);
    }
}