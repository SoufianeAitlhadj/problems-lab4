package problem6;

public class Circle extends Forme{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getSurface() {
        double area = 3.14 * radius * radius;
        return Math.round(area * 100.0) / 100.0; // 2 decimal places
    }

}