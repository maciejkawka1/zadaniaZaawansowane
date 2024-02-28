package zad9;

public class Circle {

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }
    //promien
    public double getRadius(){
        double x = this.center.getX() - this.point.getX();
        double y = this.center.getY() - this.point.getY();

        return (double) Math.round(Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2))) * 100) / 100;
    }

    //obw
    public double getPerimeter(){
        return (double) Math.round(2 * Math.PI * this.getRadius() * 100) / 100;
    }
    //pole
    public double getArea(){
        return (double) Math.round(Math.PI * Math.pow(this.getRadius(), 2) * 100) / 100;
    }

}
