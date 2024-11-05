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

        return false;
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
