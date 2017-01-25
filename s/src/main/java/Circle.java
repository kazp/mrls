public class Circle extends Rectangle {

    double radius;
    final double Pi = 3.14;

    public Circle(double x1, double y1, double radius) {
        this.x1 = x1;
        this.y1 = y1;
        this.radius = radius;
    }

    public Circle() {
        this.x1 = 0;
        this.y1 = 0;
        this.radius = 0;
    }
    @Override
    public double square() {
        double square = Pi*radius*radius ;
        return square;
    }
    @Override
    public double perimeter() {
        double perimeter = Pi*radius*2;
        return perimeter;
    }
    @Override
    public boolean isInside(int dx, int dy) {
        boolean isInside = false;
        if (dx > x1-radius & dx < x1+radius & dy >y1-radius & dy <y1 + radius ){
            isInside = true;
        };
        return isInside;
    }
    public Rectangle boundingBox(Circle ob){
        Rectangle A = new Rectangle ();
        A.x1=ob.x1;
        A.y1=ob.y1;
        A.height = ob.radius*2;
        A.width = ob.radius*2;
        return A;
    }
}
