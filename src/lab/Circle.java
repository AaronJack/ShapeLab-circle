package lab;

public class Circle{
    private int radius;
    private double area;

    public Circle(int theRadius){
        this.radius = theRadius;
    }

    public double getArea(){
        this.area = (3.14 * this.radius) * (3.14 * this.radius);
        return this.area;
    }
}
