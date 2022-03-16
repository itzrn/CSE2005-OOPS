package Harry_Java_Tutorial.ChapterPracticeSet.T52_Chapter_10;

class BaseT52{
    BaseT52(){
        System.out.println("I am the constructor of BaseT52 class !!");
    }
}
class Derived_01T52 extends BaseT52{
    Derived_01T52(){
        System.out.println("I am the constructor of Derived_01T52 class !!");
    }
}

class Derived_02T52 extends Derived_01T52{
    Derived_02T52(){
        System.out.println("I am constructor od Derived_02T52 class !!");
    }
}
public class Que5 {
    public static void main(String[] args) {
        Derived_02T52 derived_02T52 =new Derived_02T52();
    }
}
