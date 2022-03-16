package Harry_Java_Tutorial.ChapterPracticeSet.T60_Chapter_11;

public class Main {
    public static void main(String[] args) {
        System.out.println("Que_01 and Que_02");
        FountainPen fountainPen=new FountainPen();
        fountainPen.changeNib();
        fountainPen.refill();
        fountainPen.write();
        System.out.println();
        System.out.println("Que_03");
        Human human=new Human();
        human.eat();
        human.sleep();
        human.bite();
        human.jump();
        System.out.println();
        System.out.println("Que_04");
        System.out.println("Demonstrating Polymorphism using Telephone class from SmartTelephone class");
        Telephone telephone=new SmartTelephone();
        telephone.disConnect();
        telephone.lift();
        telephone.ring();
        System.out.println();
        System.out.println("Que_05");
        System.out.println("Demonstrating polymorphism using Monkey class from Human class");
        System.out.println("Monkey as human ---> ");
        Monkey monkey=new Human();
        monkey.jump();
        monkey.bite();
        System.out.println("Lavish as Human --->");
        BasicAnimal lavish=new Human();
        lavish.eat();
        lavish.sleep();
        System.out.println();
        System.out.println("Que_06");
        System.out.println("See java package, with java file TVRemote and SmartTVRemote");
        System.out.println();
        System.out.println("Que_07");
        System.out.println("Demonstrating polymorphism using TVRemote class from TV class");
        TVRemote tvRemote=new TV();
        tvRemote.switchOn();
        tvRemote.switchOff();
    }
}
