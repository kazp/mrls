public class Circle extends Rectangle {

    private double radius;

    public Circle(double x1, double y1, double radius) {
        super(x1,y1);
        this.radius = radius;
    }

    public Circle() {
        super();
        this.radius = 0;
    }

    @Override
    public double square() {
        double square = Math.PI*radius*radius ;
        return square;
    }

    @Override
    public double perimeter() {
        double perimeter = Math.PI*radius*2;
        return perimeter;
    }

    @Override
    public boolean isInside(int dx, int dy) {
        boolean isInside = false;
        if ((dx - getX())*(dx - getX()) + (dy - getY())*(dy - getY()) <= radius*radius ){
            isInside = true;
        };
        return isInside;
    }

    public Rectangle boundingBox(Circle ob){
        Rectangle a = new Rectangle (getX(),getY(),radius*2,radius*2);
        return a;
    }
}
