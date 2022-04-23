package DeepashikaMishraInClass.Assignment_04;

import java.util.ArrayList;
import java.util.Scanner;

interface MySet<String>{
    void Union(ArrayList<String>t1,ArrayList<String>t2);
    void Intersection(ArrayList<String>t1,ArrayList<String>t2);
    void Difference(ArrayList<String>t1,ArrayList<String>t2);
}
class MyHashSet<String> implements MySet<String>{
    @Override
    public void Union(ArrayList<String>t1,ArrayList<String>t2){
        for (String string : t1) {
            for (int j = 0; j < t2.size(); j++) {
                if (string == t2.get(j)) {
                    t2.remove(j);
                }
            }
        }
        t1.addAll(t2);
        System.out.println("Union ---> "+t1);
    }

    @Override
    public void Intersection(ArrayList<String>t1,ArrayList<String>t2){
        ArrayList<String>t3=new ArrayList<>();
        for (String value : t1) {
            for (String string : t2) {
                if (value == string) {
                    t3.add(value);
                    break;
                }
            }
        }
        System.out.println("Intersection ---> "+t3);
    }

    @Override
    public void Difference(ArrayList<String>t1,ArrayList<String>t2){
        for (int i=0;i<t1.size();i++){
            for (int j=0;j<t2.size();j++) {
                if (t1.get(i) == t2.get(j)) {
                    t1.remove(i);
                    i--;
                    break;
                }
            }
        }
        System.out.println("Difference ---> "+t1);
    }
}

public class Que_03 {
    public static void main(String[] args) {
        System.out.println("\t\t\t\tDOING FOR INTEGER");
        ArrayList<Integer>t1=new ArrayList<>();
        ArrayList<Integer>t2=new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number of Element you want in List 1 ---> ");
        int a= sc.nextInt();
        for(int i=0;i<a;i++){
            t1.add(i, sc.nextInt());
        }
        System.out.print("Enter the Number of Element you want in List 2 ---> ");
        int b= sc.nextInt();
        for (int i=0;i<b;i++){
            t2.add(i, sc.nextInt());
        }
        MySet<Integer>mySet01=new MyHashSet<>();
        mySet01.Intersection(t1,t2);
        mySet01.Difference(t1,t2);
        mySet01.Union(t1,t2);
    }
}
