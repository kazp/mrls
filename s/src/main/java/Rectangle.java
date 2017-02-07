public class Rectangle {

    private double x1; //x coordinate of upper left corner
    private double y1; //y coordinate of upper left corner
    private double height;
    private double width;

    public Rectangle(double x1, double y1, double height, double width) {
        this.x1 = x1;
        this.y1 = y1;
        this.height = height;
        this.width = width;
    }

    public Rectangle(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
        this.height = 0;
        this.width = 0;
    }

    public Rectangle() {
        this.x1 = 0;
        this.y1 = 0;
        this.height = 0;
        this.width = 0;
    }

    public double square() {
        double square = height * width;
        return square;
    }

    public double perimeter() {
        double perimeter = height + height + width + width;
        return perimeter;
    }

    public boolean isInside(int dx, int dy) {
        boolean isInside = false;
        if (dx > x1 && dx < x1+width && dy < y1 && dy > y1 - height ){
            isInside = true;
        };
        return isInside;
    }

    public void move(int dx, int dy) {
        this.x1 = dx;
        this.y1 = dy;
    }

    double getX (){
        return x1;
    }

    double getY (){
        return y1;
    }

    double getHeight (){
        return height;
    }

    double getWidth (){
        return width;
    }

}
