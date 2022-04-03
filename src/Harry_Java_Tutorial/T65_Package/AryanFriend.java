package Harry_Java_Tutorial.T65_Package;
//package Harry_Java_Tutorial.T65_Package;
//package codeWithAryan;

import Harry_Java_Tutorial.T65_Package.codeWithAryan01.AryanSmile;
class AryanFun extends Aryan{// this is subclass for the class which is in different package
    void meth2(){
        System.out.println(x);
        System.out.println(y);
//        System.out.println(z);
//        System.out.println(a);
    }
}

public class AryanFriend {
    public static void main(String[] args) {
        AryanSmile aryanSmile=new AryanSmile();
        aryanSmile.run();
        Aryan aryan=new Aryan();
        AryanFun aryanFun=new AryanFun();
        System.out.println("This is AryanFriend Class!!");
        System.out.println(aryan.x);
        System.out.println();
        aryanFun.meth2();
        aryanFun.met1();
    }
}
