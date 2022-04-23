package Harry_Java_Tutorial.ChapterPracticeSet.T76_Chapter_13;
class ThreadQue_03a extends Thread{
    public void run(){
        while (true){
            System.out.println("Good Morning!!");
        }
    }
}
class ThreadQue_03b extends Thread{
    @Override
    public void run(){
        boolean t=true;
        while (t){
            System.out.println("Welcome!!");
            t=false;
        }
    }
}
public class Que_03 {
    public static void main(String[] args) {
        ThreadQue_03a t1=new ThreadQue_03a();
        ThreadQue_02a t2=new ThreadQue_02a();
        t1.setPriority(6);
        t2.setPriority(9);
        //check priority once by comment above two lines
        // Max_Priority value ---> 10
        // Min_Priority value ---> 1
        // Normal_Priority value ---> 5
        System.out.println("t1 priority ---> "+t1.getPriority());
        System.out.println("t2 priority ---> "+t2.getPriority());
//        t1.start();
//        t2.start();
    }
}
