/**
 * Created by Igor on 2/7/2017.
 *
 * Rectangle class with ability to create Circle, get square and perimeter of circle.
 * It also has a method that determines is a point located inside a circle.
 * Method boundingBox creates the smallest Rectangle which contains the Circle
 */

public class Circle extends Rectangle {
    /**
     * @param radius is a radius of a circle
     */
    private double radius;

    /**
     * Constructor that uses all required fields
     * @param x1 is x coordinate of center of the circle
     * @param y1 is y coordinate of center of the circle
     * @param radius is a radius of the circle
     */
    public Circle(double x1, double y1, double radius) {
        super(x1,y1);
        this.radius = radius;
    }

    /**
     * Default constructor
     */
    public Circle() {
        super();
        this.radius = 0;
    }

    /**
     * Method that counts a square of the circle
     * @return square     *
     */
    @Override
    public double square() {
        double square = Math.PI*radius*radius ;
        return square;
    }

    /**
     * Method that perimeter a square of the circle
     * @return perimeter
     */
    @Override
    public double perimeter() {
        double perimeter = Math.PI*radius*2;
        return perimeter;
    }

    /**
     * Method that determines is a point located inside the circle
     * @param dx - x coordinate of the point
     * @param dy - y coordinate of the point
     * @return isInside - true if the point is located inside the circle
     */
    @Override
    public boolean isInside(int dx, int dy) {
        boolean isInside = false;
        if ((dx - getX())*(dx - getX()) + (dy - getY())*(dy - getY()) <= radius*radius ){
            isInside = true;
        };
        return isInside;
    }

    /**
     * Method that creates the smallest Rectangle which contains the Circle
     * @param ob is a Circle object
     * @return a Rectangle
     */
    public Rectangle boundingBox(Circle ob){
        Rectangle a = new Rectangle (getX(),getY(),radius*2,radius*2);
        return a;
    }
}
