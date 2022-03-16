package ByChacha;

public class Calculater {
    int x;
    int y;
    public Calculater(int a, int b){
        this.x=a;
        this.y=b;
    }
    public Calculater(){

    }

    /**
     * scope -- public or private or protected
     *     4 types of method/function -->
     *     a) Method without parameter and without return(a method without scope is default private)
     *            void abs(without parameter)--> return null{
     *
     *            }
     *     b) Method with return type and without parameter
     *             returns ---> int(4 byte space), float(4 byte space), string, double(8 byte), long, user define data type
     *             int abc{
     *                 return something
     *             }
     *     c) Method without return type and with parameter
     *              void abc(int a, int b){
     *
     *              }
     *     d) Method with return type and with parameter
     *              int abc(int a, int b){
     *              c = a + b
     *              return c;
     *              }
     */
    int add(int a, int b){
        int sum = a + b;// a and b have space --->2^32-1, 2^32-1
        return sum;
    }

    int subtract(int a, int b){
        int sub = a - b;
        return sub;
    }

    int multiply(int a, int b){
        int mult = a * b;
        return mult;
    }

    float divide(int a, int b){
        float div = (float)a/b;
        return div;
    }
    int add(){
        int sum = x + y;// a and b have space --->2^32-1, 2^32-1
        return sum;
    }

    int subtract(){
        int sub = x - y;
        return sub;
    }

    int multiply(){
        int mult = x * y;
        return mult;
    }

    float divide(){
        float div = (float)x/y;
        return div;
    }

    public static void main(String[] args) {
        Calculater calculater= new Calculater( 16,  7);
        System.out.println("add --->"+calculater.add());
        System.out.println(" Subtract --->"+calculater.subtract());
        System.out.println("Multiply --->"+calculater.multiply());
        System.out.println("Divide --->"+calculater.divide());
        calculater = new Calculater();
        System.out.println("add --->"+calculater.add(16,7));
        System.out.println(" Subtract --->"+calculater.subtract(169,7));
        System.out.println("Multiply --->"+calculater.multiply(160,7));
        System.out.println("Divide --->"+calculater.divide(164,7));
    }
}
