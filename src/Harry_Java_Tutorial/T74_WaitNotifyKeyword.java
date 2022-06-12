package Harry_Java_Tutorial;

/*
Interthread Communication
Java includes an elegant interprocess communication mechanism via
the wait( ), notify( ), and notifyAll( ) methods.
These methods are implemented as final methods in Object,
so all classes have them.
All three methods can be called only from
within a synchronized context.
• wait( ) tells the calling thread to give up the monitor and go to sleep until some
other thread enters the same monitor and calls notify( ).
• notify( ) wakes up a thread that called wait( ) on the same object.
• notifyAll( ) wakes up all the threads that called wait( )
on the same object. One of the threads will be granted access.
These methods are declared within Object, as shown here:
final void wait( ) throws InterruptedException
final void notify( )
final void notifyAll( )


*/






class Q {
    int n;
    boolean valueSet = false;//it is false when no item is produced
    public synchronized int get()
    {
//        System.out.println(!valueSet);
        if(!valueSet)
            try {
                wait();//consumer has to wait if no item is produced
            }
            catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        System.out.println("Got: " + n);
        valueSet = false;
        notify();//consumer should notify producer, notifyAll() should be used when more than two threads are running
        return n;
    }
    synchronized void put(int n) {
        if(valueSet)
            try {
                wait();//if item produced then producer has to wait
            } catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();//producer thread notifies to consumer
    }
}
public class T74_WaitNotifyKeyword{
    public static void main(String []args)
    {
        Q q=new Q();
        Thread Producer=new Thread(new Runnable(){
            public void run() {
                int i = 0;
                while(true)
                    q.put(i++);
            }});
        Thread Consumer=new Thread(new Runnable(){
            public void run() {
                while(true)
                    q.get();
            }});
        Producer.start();
        Consumer.start();
    }
}
