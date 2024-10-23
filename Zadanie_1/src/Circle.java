import java.lang.Math;

public class Circle extends Shape{


    private double radius;
    private Point center;
    private double area;
    private double circumference;

    public double area(){
        area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double circumference(){
        return 2 * Math.PI * radius;
    }

    public Circle(Point center, Point p2) {
        this.center = center;
                Calculator cal = new Calculator();
        this.radius = cal.distance(center, p2)/2;
        this.area = area();
        this.circumference();
    }


    public double getArea() {
        return area;
    }
    public double getCircumference() {
        return circumference;
    }

    public void showInfo(){
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
