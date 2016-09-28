/**
 * Created by user10 on 16.09.2016.
 */
public class Cube implements Shape {
    private double b;

    public Cube(double b) {
        this.b = b;
    }

    public double volume(){
        return b*b*b;
    }
}
