//package Harry_Java_Tutorial.Exercises.T68_Exercise_05;
package Exercise_05;

// use notepad to visualize the things clearly
public class Cylinder {
    private float height;
    private float radius;

    public void setHeight(float height){
        this.height=height;
    }
    public  void setRadius(float radius){
        this.radius=radius;
    }

    public float curvedSurfaceArea(){
        return (float) (2*Math.PI*radius*height);
    }

    public float flatSurfaceArea(){
        return (float) (2*Math.PI*Math.pow(radius,2));
    }

    public float totalSurfaceArea(){
        return curvedSurfaceArea()+flatSurfaceArea();
    }

    public float volume(){
        return curvedSurfaceArea()*(radius/2);
    }
}