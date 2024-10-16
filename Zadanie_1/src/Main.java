
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);

        System.out.println();
        p1.showInfo();
        p2.showInfo();

        System.out.println();

        Calculator calc = new Calculator();
        calc.showInfo(p1,p2);

        Circle circle = new Circle(p1,p2);
        circle.showInfo();
    }
}
