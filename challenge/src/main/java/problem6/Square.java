package problem6;

public class Square extends Forme{
    private double edge;
    public Square(double edge){
        this.edge = edge;
    }
    @Override
    public double getSurface(){
        double surface = edge*edge;
        return Math.round(surface*100)/100;
    }
}