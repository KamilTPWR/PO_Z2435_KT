public class Square extends Shape{


    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private double area;
    private double circumference;



    public double area(){
        Calculator cal = new Calculator();
        area = cal.distance(a , b)*cal.distance(a , b);
        return area;
    }

    @Override
    public double circumference(){
        Calculator cal = new Calculator();
        return 4*cal.distance(a , b);
    }

    //nowe, zmienione
    public Square(Point p1, Point p2, Point p3, Point p4) throws BadShapeException {
        if (!isSquare(p1, p2, p3, p4)) {  // Sprawdzamy, czy punkty tworzą kwadrat
            throw new BadShapeException("Not a Square");
        }
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.circumference = circumference();
        this.area = area();
    }

    private boolean isSquare(Point p1, Point p2, Point p3, Point p4) {
        Calculator calculator = new Calculator();

        double d1 = calculator.distance(p1, p2);
        double d2 = calculator.distance(p2, p3);
        double d3 = calculator.distance(p3, p4);
        double d4 = calculator.distance(p4, p1);

        return d1 > 0 && d1 == d2 && d2 == d3 && d3 == d4; // zamiast pisać if i dawać TRUE
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
