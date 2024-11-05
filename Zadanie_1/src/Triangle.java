public class Triangle extends Shape{

    private Point a;
    private Point b;
    private Point c;
    private double area;
    private double circumference;

    //Użycie od teraz wzoru Herona
    public double area(){
        Calculator cal = new Calculator();

        double sideA = cal.distance(a, b);
        double sideB = cal.distance(b, c);
        double sideC = cal.distance(c, a);

        double s = (sideA + sideB + sideC) / 2;

        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
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
