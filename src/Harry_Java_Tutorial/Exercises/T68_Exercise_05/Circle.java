//package Harry_Java_Tutorial.Exercises.T68_Exercise_05;
package Exercise_05;

// use notepad to visualize the things clearly
public class Circle {
    private float radius;

    public void setRadius(float radius){
        this.radius=radius;
    }

    public  float area(){
        return (float) (Math.PI*radius*radius);
    }

    public float perimeter(){
        return area()*(2/radius);
    }
}
