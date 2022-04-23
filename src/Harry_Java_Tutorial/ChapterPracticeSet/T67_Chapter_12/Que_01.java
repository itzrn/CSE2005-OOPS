package Harry_Java_Tutorial.ChapterPracticeSet.T67_Chapter_12;
//package Calc;

class CalculatorQue01 {
    public void calculator(int a, int b){
        System.out.println("Your result is ---> "+ a+b);
    }
}
class ScientificCalculatorQue01 {
    public void calculator(int a, int b){
        System.out.println("Your result is ---> "+ Math.sin(a+b));
    }
}
class HybridCalculatorQue01 {
    public void calculator(int a,int b){
        System.out.println("Your result 1 ---> "+a+b);
        System.out.println("Your result 2 ---> "+Math.sin(a+b));
    }
}
public class Que_01 {
    public static void main(String[] args) {
        System.out.println("I am Main Method!");
        System.out.println();
        CalculatorQue01 calculatorQue01=new CalculatorQue01();
        calculatorQue01.calculator(2,5);
        System.out.println();
        ScientificCalculatorQue01 scientificCalculatorQue01=new ScientificCalculatorQue01();
        scientificCalculatorQue01.calculator(8,9);
        System.out.println();
        HybridCalculatorQue01 hybridCalculatorQue01=new HybridCalculatorQue01();
        hybridCalculatorQue01.calculator(67,89);
    }
}
