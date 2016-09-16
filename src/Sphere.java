/**
 * Created by user10 on 16.09.2016.
 */
public class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double volume(){
        return 4/3*Math.PI*radius*radius*radius;
    }
}
