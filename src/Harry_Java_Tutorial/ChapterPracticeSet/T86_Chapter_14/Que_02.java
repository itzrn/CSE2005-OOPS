package Harry_Java_Tutorial.ChapterPracticeSet.T86_Chapter_14;

public class Que_02 {
    public static void main(String[] args) {
        try {
            int a=666/0;
        }catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }catch (ArithmeticException e){
            System.out.println("HaHa");
        }
    }
}
