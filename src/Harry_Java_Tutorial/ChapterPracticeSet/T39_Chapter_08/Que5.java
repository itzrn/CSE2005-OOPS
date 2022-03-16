package Harry_Java_Tutorial.ChapterPracticeSet.T39_Chapter_08;
class TommyVeCetti{
    public void hit(){
        System.out.println("Hitting The Enemy....");
    }
    public void run(){
        System.out.println("Running From The Enemy....");
    }
    public void fire(){
        System.out.println("Firing On The Enemy....");
    }
}
public class Que5 {
    public static void main(String[] args) {
        TommyVeCetti Tommy=new TommyVeCetti();
        Tommy.fire();
        Tommy.hit();
        Tommy.run();
    }
}
