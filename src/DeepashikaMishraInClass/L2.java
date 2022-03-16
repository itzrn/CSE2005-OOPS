package DeepashikaMishraInClass;


import java.util.Scanner;

public class L2 {
    public static void main(String[] args)
    {
        int a=5,b=6;
        int sum =a+b;
        System.out.println("The sum of two number --->"+a+b);
        /*
        the above print statement, wil print
        The sum of two number --->56
        "it's because a and b getting treat as String"
        so, this print statement concatenating a and b as String
        but --->
        System.out.println("The sum of two number --->"+(a+b));
        the above line will print the sum
         */
        // {} ---> these braces meant to distinguish the block of statements, within it consider as single unit
        // in print statement, '+' with string act as concatenating operator always
        System.out.println(a+b);
        System.out.println();
        final int z= 76;// here final keyword make the value of z permanent though out the whole code
        System.out.println("Final value of z, which will never get change through out the code --->"+z);
        System.out.println();
        char ch1,ch2,ch3;
        ch1=88;ch2='8';ch3='X';
        System.out.println("it will print the character, whose ASCII value is 88 -->"+ch1);
        System.out.println("it will print '8', as here '8' is getting treat as character --->"+ch2);
        System.out.println("it will print the character --->"+ch3);
        System.out.println();
        System.out.println('A');
        System.out.println('A'+'B');// it will print the sum of unicode of 'A' and 'B'
        System.out.println("A"+"B"+'A');
        System.out.println();
        System.out.println("To take input --->");
        Scanner sc = new Scanner(System.in);
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter integer --->");// to take integer input
        int y=sc.nextInt();
        System.out.println(y);
        System.out.print("Enter Decimal Number --->");// to take Float Input
        double x = sc.nextFloat();
        System.out.println(x);
        System.out.print("Enter A character --->");// to take a character input
        char w = sc.next().charAt(0);// it's actually printing the Character at 0th index of the string
        System.out.println(w);
        System.out.print("Enter A String --->");// to take String Input
        String v = sc.next();
        System.out.println(v);
        System.out.print("Enter a Statement --->");// to take Statement as input(more than one string)
        String u = cs.nextLine();
        System.out.println(u);
    }
}