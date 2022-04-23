package Harry_Java_Tutorial;

class ThreadPriority01 extends Thread{
    ThreadPriority01(String name){
        super(name);
    }
    public void run(){
//        System.out.println("This is ThreadPriority01 class!! ---> "+Thread.currentThread().getName());

        for (int i=0;i<40504830;i++){
            System.out.println("This is ThreadPriority01 class!! ---> "+Thread.currentThread().getName());
//            Thread.currentThread().getName();  instead of this we can also use
//            this.getName();
        }
    }
}

public class T74_ThreadPriorities {
    public static void main(String[] args) {
        // jvm ko ready queue milti hai
        //or ye Ready queue ke andar vo sare thread
        // milenga jo ready to run hai
        // Ready Queue : T1 T2 T3 T4 T5
        ThreadPriority01 t1=new ThreadPriority01("Aryan");
        ThreadPriority01 t2=new ThreadPriority01("Ashmit");
        ThreadPriority01 t3=new ThreadPriority01("Dharamendra");
        ThreadPriority01 t4=new ThreadPriority01("Manoj");
        ThreadPriority01 t5=new ThreadPriority01("Tejas (most Important)");
        /**
        t5.setPriority(1);
        t3.setPriority(2);
        t1.setPriority(3);
        t2.setPriority(4);
        t4.setPriority(5);
         greater the priority number, greater the priority
         **/
        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
