package FAT;

class Line1{
    int count=0;
    String[] talk={"Aryan ---> Hi","Pallavi ---> Hello","Aryan ---> How are you Pallavi?","Pallavi ---> I am fine Aryan!\n\t\t\t What About you?","Aryan ---> I am also good Pallavi.","Pallavi ---> That's nice to Listen"};
    public synchronized void print(){
        System.out.println(talk[count]);
        count++;
        try{
            Thread.sleep(400);
        }catch (Exception e){
            System.out.println("Error!");
        }
    }
}

class PersonOne extends Thread{
    Line1 line;
    PersonOne(Line1 line){
        this.line=line;
    }

    @Override
    public void run(){
        for (int i=0;i<3;i++){
            line.print();
        }
    }
}

class PersonTwo extends Thread{
    Line1 line;
    PersonTwo(Line1 line){
        this.line=line;
    }

    @Override
    public void run(){
        for (int i=0;i<3;i++){
            line.print();
        }
    }
}

public class TwoPersonCommunicationThread {
    public static void main(String[] args) throws Exception{
        Line1 line=new Line1();
        PersonOne personOne=new PersonOne(line);
        PersonTwo personTwo=new PersonTwo(line);

        personOne.start();
        personTwo.start();

        /*
        no need to use join method,
        personOne.join();
        personTwo.join();
         */

    }
}
