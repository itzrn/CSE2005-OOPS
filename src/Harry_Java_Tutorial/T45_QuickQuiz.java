package Harry_Java_Tutorial;
class Animal{
    public void leg(){
        System.out.println("Have four legs");
    }

    public void ear(){
        System.out.println("Have 2 ears");
    }
}
class Dog extends Animal{
    public void voice(){
        System.out.println("Voice of Dog ---> barks bhau bhau");
    }
}
public class T45_QuickQuiz {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.voice();
        dog.ear();
        dog.leg();
    }
}
