//package Harry_Java_Tutorial.Exercises.T68_Exercise_05;
package Exercise_05;

// use notepad to visualize the things clearly
public class Square {
    private float length;

    public void setLength(float length){
        this.length=length;
    }

    public float area(){
        return  length*length;
    }
    public float perimeter(){
        return 4*length;
    }
}
