package Harry_Java_Tutorial.ChapterPracticeSet.T67_Chapter_12;
//package Problem_04;

//import Folder.Folder_01.Folder_02.Que_03;

class C1 extends Que_03{
    void Que_03(){
        System.out.println(proInt);
//        System.out.println(defInt); ---> not allowed, as default can not be access outside the package
    }
}

public class Que_04{
    public static void main(String[] args) {
        System.out.println("I am Main Method!");
        C1 c1=new C1();
        c1.Que_03();
    }
}