package Harry_Java_Tutorial.ChapterPracticeSet.T76_Chapter_13;
class ThreadQue_01 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("Good Morning!!");
        }
    }
}

class ThreadQue_01a extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("Welcome!!");
        }
    }
}
public class Que_01 {
    public static void main(String[] args) {
        ThreadQue_01 threadQue_01=new ThreadQue_01();
        ThreadQue_01a threadQue_02=new ThreadQue_01a();
        threadQue_01.start();
        threadQue_02.start();
    }
}
