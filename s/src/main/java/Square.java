/**
 * Created by Igor on 2/7/2017.
 */
public class Square extends Rectangle{

    private double side;

    public Square(double x1, double y1, double side) {
        super(x1,y1);
        this.side = side;
    }

    public Square() {
        super();
        this.side = 0;
    }
    @Override
    public double square() {
        double square = side * side;
        return square;
    }
    @Override
    public double perimeter() {
        double perimeter = side * 4;
        return perimeter;
    }
    @Override
    public boolean isInside(int dx, int dy) {
        boolean isInside = false;
        if (dx > getX() && dx < getX()+side && dy < getY() && dy > getY() - side ){
            isInside = true;
        };
        return isInside;
    }
}
