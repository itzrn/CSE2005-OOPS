package Harry_Java_Tutorial;

//Zero is neither Even nor Odd

class Number01{
    int i=0;
    public synchronized void odd(){//it will print even number
        if (i%2!=0){
            try {
                wait();
            }catch (Exception e){
                System.out.println("Error!");
            }
        }
        System.out.println("Even ---> "+(i));
        i++;
        notify();
    }
    public synchronized void even(){//it will print odd number, assuming zero(0) as even
        if (i%2==0){
            try {
                wait();
            }catch (Exception e){
                System.out.println("Error!");
            }
        }
        System.out.println("Odd  ---> "+(i));
        i++;
        notify();
    }
}
class Odd01 extends Thread{
    Number01 number01;
    Odd01(Number01 number01){
        this.number01=number01;
    }
    public void run(){
        for (int i=0;i<100;i++){
            number01.even();
        }
    }

}
class Even01 extends Thread{
    Number01 number01;
    Even01(Number01 number01){
        this.number01=number01;
    }

    public void run(){
        for (int i=0;i<=100;i++){
            number01.odd();
        }
    }
}
public class T74_EvenOddUsingThread {
    public static void main(String[] args) {
        Number01 number01=new Number01();
        Odd01 odd01=new Odd01(number01);
        Even01 even01=new Even01(number01);
        even01.start();
        odd01.start();
    }
}
