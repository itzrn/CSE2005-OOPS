//package Harry_Java_Tutorial.Exercises.T68_Exercise_05;
package Exercise_05;

// use notepad to visualize the things clearly
public class Sphere {
    private float radius;

    public void setRadius(float radius){
        this.radius=radius;
    }

    public float volume(){
        return (float) (4/3*Math.PI*Math.pow(radius,3));
    }
    public float surfaceArea(){
        return (float) (4*Math.PI*radius*radius);
    }
}