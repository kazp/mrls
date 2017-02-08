/**
 * Created by Igor on 2/7/2017.
 *
 * Rectangle class with ability to create Rectangle, move it, get x any y coordinates, get square and perimeter of rectangle.
 * It also has a method that determines is a point located inside a rectangle
 */

public class Rectangle {
    /**
     * @param x1 is x coordinate of upper left corner of rectangle
     * @param y1 is y coordinate of upper left corner of rectangle
     * @param height is a height of rectangle
     * @param width is a width of rectangle
     */
    private double x1;
    private double y1;
    private double height;
    private double width;

    /**
     * Constructor that uses all required fields
     */
    public Rectangle(double x1, double y1, double height, double width) {
        this.x1 = x1;
        this.y1 = y1;
        this.height = height;
        this.width = width;
    }

    /**
     *Constructor that uses coordinates only
     */
    public Rectangle(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
        this.height = 0;
        this.width = 0;
    }

    /**
     * Default constructor
     */
    public Rectangle() {
        this.x1 = 0;
        this.y1 = 0;
        this.height = 0;
        this.width = 0;
    }

    /**
     * Method that counts a square of rectangle
     * @return square
     */
    public double square() {
        double square = height * width;
        return square;
    }

    /**
     * Method that counts a perimeter of rectangle
     * @return perimeter
     */
    public double perimeter() {
        double perimeter = height + height + width + width;
        return perimeter;
    }

    /**
     * Method that determines is a point located inside a rectangle
     * @param dx - x coordinate of the point
     * @param dy - y coordinate of the point
     * @return isInside - true if the point is located inside the rectangle
     */
    public boolean isInside(int dx, int dy) {
        boolean isInside = false;
        if (dx > x1 && dx < x1+width && dy < y1 && dy > y1 - height ){
            isInside = true;
        };
        return isInside;
    }

    /**
     * Method to move rectangle
     * @param dx - x coordinate of required location
     * @param dy - y coordinate of required location
     */
    public void move(int dx, int dy) {
        this.x1 = dx;
        this.y1 = dy;
    }

    /**
     * Method to get x coordinate of rectangle
     * @return x coordinate of rectangle
     */
    double getX (){
        return x1;
    }

    /**
     * Method to get y coordinate of rectangle
     * @return y coordinate of rectangle
     */
    double getY (){
        return y1;
    }

    /**
     * Method to get height of rectangle
     * @return height
     */
    double getHeight (){
        return height;
    }

    /**
     * Method to get width of rectangle
     * @return width
     */
    double getWidth (){
        return width;
    }

}
