package Harry_Java_Tutorial;

//Multiple Inheritance
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class T54_InterfaceExampleD implements Printable,Showable {
    public void print() {
        System.out.println("Hello");
    }
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args){
        T54_InterfaceExampleD obj = new T54_InterfaceExampleD();
        obj.print();
        obj.show();
    }
}
