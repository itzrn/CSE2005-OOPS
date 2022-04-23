package Harry_Java_Tutorial.ChapterPracticeSet.T76_Chapter_13;

public class Que_04 {
    public static void main(String[] args) {
        ThreadQue_03b t1=new ThreadQue_03b();// t1 is in NEW state
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());//here t1 is in RUNNABLE state

        //Que_05
        System.out.println(Thread.currentThread().getState());
    }
}
