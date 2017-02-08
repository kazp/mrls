/**
 * Created by Igor on 2/7/2017.
 *
 * Square class with ability to create Square, get square and perimeter of square.
 * It also has a method that determines is a point located inside a rectangle
 */
public class Square extends Rectangle{
    /**
     * @param side is any side of a square
     */
    private double side;

    /**
     * Constructor that uses all required fields
     * @param x1 is x coordinate of upper left corner of square
     * @param y1 is x coordinate of upper left corner of square
     * @param side is a side of square
     */
    public Square(double x1, double y1, double side) {
        super(x1,y1);
        this.side = side;
    }

    /**
     * Default constructor
     */
    public Square() {
        super();
        this.side = 0;
    }

    /**
     * Method that counts a square of square
     * @return square
     */
    @Override
    public double square() {
        double square = side * side;
        return square;
    }

    /**
     * Method that counts a perimeter of square
     * @return perimeter
     */
    @Override
    public double perimeter() {
        double perimeter = side * 4;
        return perimeter;
    }

    /**
     * Method that determines is a point located inside a square
     * @param dx - x coordinate of the point
     * @param dy - y coordinate of the point
     * @return isInside - true if the point is located inside the square
     */
    @Override
    public boolean isInside(int dx, int dy) {
        boolean isInside = false;
        if (dx > getX() && dx < getX()+side && dy < getY() && dy > getY() - side ){
            isInside = true;
        };
        return isInside;
    }
}
