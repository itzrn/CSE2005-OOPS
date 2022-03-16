package DeepashikaMishraInClass;

public class L1 {
    // in online compiler, name of the class is always given 'Main'
    // before class we can write 'public' or not, it depends on compiler to co
    public static void main(String[] args) {// void is a return type, which has nothing return type
        System.out.println("My First Program --->");
        System.out.println("Hello World");
        System.out.printf("Aryan");
        System.out.println();
        /*
         * println is a function which print the output
         * it is of three type --->
         * println --->it put controller to the next line
         * print --->it won't put controller to the next line
         * printf --->when you are using format specifier, even it won't put the
         *            controller to the next line
         */
        System.out.println("Sum of two number --->");
        int a = 5, b=6;// every variable should get initialize
        System.out.println(a+b);
        /*
        Escape Sequence            Description
        \t                         Horizontal tab
        \r                         Carriage return
        \n                         New line
        \"                         Double quote
        \\                         Backslash
         */
        // there are two types of data type ---> primitive and non-primitive/reference data type
        System.out.println();
        System.out.println("Type casting");
        int c = 5;
        float d = c;
        System.out.println("c --> "+c);
        System.out.println("d --> "+d);
//        int f = 5.6; ---> this will show error
        int f = (int)5.6;
        System.out.println("f ---> "+f);
        double e = 5.6;
        int g = (int)e;
        System.out.println("e ---> "+e);
        System.out.println("g ---> "+g);
        System.out.println();
        System.out.println("To print ASCII value --->");
        char ch1 ,ch2;
        ch1 = 88;
        ch2 = 'A';
        int z = 'A';
        System.out.println("ch1 and ch2 ---->(respectively) "+ch1+", "+ch2);
        System.out.println("z ---> "+z);
        /*
        typecasting, which is automatically happening by it own, is called implicit type casting
        typecasting, which we need to do it, is called explicit type casting
         */
    }
}