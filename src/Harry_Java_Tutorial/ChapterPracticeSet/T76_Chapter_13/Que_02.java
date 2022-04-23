package Harry_Java_Tutorial.ChapterPracticeSet.T76_Chapter_13;

class ThreadQue_02 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("Good Morning!!");
        }
    }
}

class ThreadQue_02a extends Thread{
    @Override
    public void run(){
        while (true){
            try {
                Thread.sleep(200);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome!!");
        }
    }
}
public class Que_02 {
    public static void main(String[] args) {
        ThreadQue_02 threadQue_02=new ThreadQue_02();
        ThreadQue_02a threadQue_02a=new ThreadQue_02a();
        threadQue_02.start();
        threadQue_02a.start();
    }
}
