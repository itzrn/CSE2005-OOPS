package Harry_Java_Tutorial.ChapterPracticeSet.T67_Chapter_12;

//package Folder.Folder_01.Folder_02;

class Calculator{
    public void calculator(int a, int b){
        System.out.println("Your result is ---> "+ a+b);
    }
}
class ScientificCalculator{
    public void calculator(int a, int b){
        System.out.println("Your result is ---> "+ Math.sin(a+b));
    }
}
class HybridCalculator{
    public void calculator(int a,int b){
        System.out.println("Your result 1 ---> "+a+b);
        System.out.println("Your result 2 ---> "+Math.sin(a+b));
    }
}
public class Que_03 {
    protected int proInt=4;
    int defInt=5;
    public static void main(String[] args) {
        System.out.println("I am Main Method!");
    }
}