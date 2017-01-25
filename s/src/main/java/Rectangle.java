public class Rectangle {
    double x1, y1; //coordinates of upper left corner
    double height, width;

    public Rectangle(double x1, double y1, double height, double width) {
        this.x1 = x1;
        this.y1 = y1;
        this.height = height;
        this.width = width;
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
        if (dx > x1 & dx < x1+width & dy < y1 & dy > y1 - height ){
            isInside = true;
        };
        return isInside;
    }

    public void move(int dx, int dy) {
        this.x1 = dx;
        this.y1 = dy;
    }

}
