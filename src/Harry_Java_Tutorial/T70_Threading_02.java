package Harry_Java_Tutorial;
class MyThread_01 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<40000){
            System.out.println("My cooking Thread1 is Running");
            System.out.println("I am Happy!");
            System.out.println();
            i++;
        }
    }
}

class MyThread_02 extends Thread{
    @Override
    public void run(){
        int i =0;
        while (i<60000){
            System.out.println("My Chatting Thread2 is Running");
            System.out.print("I am in Love! ");
            aryan();
            System.out.println();
            i++;
        }
//        MyThread_01 myThread_01=new MyThread_01(); We can make object of
//        any class in any method, not necessary only in main method
    }
    private void aryan(){
        System.out.println("Aryan");
    }
}
public class T70_Threading_02 {
    public static void main(String[] args) {
        // first way to make Thread
        MyThread_01 myThread_01=new MyThread_01();
        MyThread_02 myThread_02=new MyThread_02();
        myThread_01.start();
        myThread_02.start();
        /*
        The above same operation can be done by given thread as a parameter to a thread
        Thread t=new Thread(new MyThread_01()); // (We can give parameter to a thread as target thread or target runnable)
        MyThread_02 myThread_02=new MyThread_02();
        t.start();
        myThread_02.start();
         */
    }
}
// methods in thread concept ---> https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html