import java.lang.Math;

public class Circle {
    private double area;
    private double circumference;

    public Circle(Point p1, Point p2) {
        Calculator cal = new Calculator();
        var radius = cal.distance(p1, p2)/2;
        this.area = (Math.PI * radius*radius)*0.5;
        this.circumference = (2* Math.PI * radius);
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
