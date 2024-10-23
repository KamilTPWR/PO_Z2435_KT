public class Triangle extends Shape{


    private Point a;
    private Point b;
    private Point c;
    private double area;
    private double circumference;

    public double area(){
        Calculator cal = new Calculator();
        double area = ((cal.distance(a , b) * cal.distance(a , b) * Math.sqrt(3) )/4);
        return area;
    }

    @Override
    public double circumference(){
        Calculator cal = new Calculator();
        return cal.distance(a , b)+cal.distance(b, c)+cal.distance(a, c);
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.circumference = circumference();
        this.area = area();
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
