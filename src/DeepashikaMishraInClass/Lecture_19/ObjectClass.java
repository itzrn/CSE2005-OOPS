package DeepashikaMishraInClass.Lecture_19;

import java.util.ArrayList;
// object itself is a class, this class is present in java.lang package
// object class contains many inbuilt methods, which fulfill programmers requirement
public class ObjectClass {
    public static void main(String[] args) {
        //getClass() with object
        Object obj1=new Object();
        System.out.println("CLass of obj1 ---> "+obj1.getClass());

        //getClass() with String
        String obj2=new String();
        System.out.println("Class of obj2 ---> "+obj2.getClass());

        //getClass() with ArrayList
        ArrayList<Integer> obj3=new ArrayList<>();
        System.out.println("Class of obj3 ---> "+obj3.getClass());

        //hashCode() with object, hash code is an integer value, which is associated with object and
        // will give the location of an object
        Object obj4 =new Object();
        System.out.println(obj4.hashCode());

        // every Object has its own hash value
        Object obj5 =new Object();
        System.out.println(obj5.hashCode());

        Object obj6=new Object();
        Object obj7 =new Object();
        System.out.println(obj6.equals(obj7)); // true or false

        //assign obj7 to obj8
//        Object obj8 =new obj7();
//        System.out.println(obj7.equals(obj8));

        System.out.println();
        System.out.println("toString()");
        System.out.println(obj1.toString());

        System.out.println(obj4.toString()); // ---> it give the hash code of object in hexadecimal format

        String[] arr={"Python","Java","C++"};
        System.out.println(arr.toString());

        // cloning means ---> creating duplicate of something
    }
}
