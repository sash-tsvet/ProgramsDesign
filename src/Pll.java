/**
 * Created by user10 on 16.09.2016.
 */
public class Pll implements Shape{
    private double a;
    private double b;
    private double c;

    public Pll(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double volume(){
        return a*b*c;
    }
}
