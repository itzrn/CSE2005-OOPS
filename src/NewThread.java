class NewThread_01 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<600000;i++){
            System.out.println("Aryan");
        }
    }
}

class NewThread_02 extends Thread{
    @Override
    public void run(){
        for (int j=0;j<90000;j++){
            System.out.println("Ashmit");
        }
    }
}
public class NewThread {
    public static void main(String[] args) {
        NewThread_01 newThread_01=new NewThread_01();
        NewThread_02 newThread_02=new NewThread_02();
//        newThread_01.aryan();
        newThread_01.start();
        newThread_02.start();
    }
}
