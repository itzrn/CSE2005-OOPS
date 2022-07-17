package FATSem2;
class Line2{
    int count=0;
    String[] talk={"Aryan ---> Hy Hello Nayan","Nayan ---> Hello Aryan","Aryan ---> Kasa Ha bhai tu?",
            "Nayan ---> Thik!\n\t\t   Tu Bata, Tu kasa hai?","Aryan ---> Sab Badiya",
            "Nayan ---> Are ek baat bata!","Aryan ---> H bol!",
            "Nayan ---> Tera is Summer Vacation m kya plans ha?","Aryan ---> DSA soch rha hoon complete krne ka",
            "Nayan ---> Acha ok bhai mera bhi same plan ha, or ab tu bhi DSA hi kar rha to sath milke krenga",
            "Aryan ---> Are Bilkul","Nayan ---> Ha Bhai","Aryan ---> chal thik jab start krna DSA to batana",
            "Nayan ---> bilkul Bhai","Aryan ---> Ha ok bye ... Ttyl","Nayan ---> Byee...ttyl"};
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
class Person1 implements  Runnable{
    Line2 line;
    Person1(Line2 line){
        this.line=line;
    }

    @Override
    public void run(){
        for (int i=0;i<8;i++){
            line.print();
        }
    }
}

class Person2 implements Runnable{
    Line2 line;
    Person2(Line2 line){
        this.line=line;
    }

    @Override
    public void run(){
        for (int i=0;i<8;i++){
            line.print();
        }
    }
}

public class TwoPersonCommunicationRunnable {
    public static void main(String[] args) {
        Line2 line2=new Line2();
        Person1 person1=new Person1(line2);
        Person2 person2=new Person2(line2);

        Thread t1=new Thread(person1);
        Thread t2=new Thread(person2);

        t1.start();
        t2.start();
    }
}
