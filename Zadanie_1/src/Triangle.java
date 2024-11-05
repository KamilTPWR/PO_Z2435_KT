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

    public Triangle(Point p1, Point p2, Point p3) throws BadShapeException {
        if (!isTriangle(p1, p2, p3)) {  // Check if points form a triangle
            throw new BadShapeException("Not a Triangle");
        }
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.circumference = circumference();
        this.area = area();
    }

    private boolean isTriangle(Point p1, Point p2, Point p3) {
        Calculator calculator = new Calculator();

        double d1 = calculator.distance(p1, p2);
        double d2 = calculator.distance(p2, p3);
        double d3 = calculator.distance(p3, p1);

        // Check the triangle inequality
        return (d1 + d2 > d3) && (d1 + d3 > d2) && (d2 + d3 > d1);
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
