
public class Main {
    public static void main(String[] args) {
        //Punkty do kwadratu
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 1);
        Point p3 = new Point(1, 1);
        Point p4 = new Point(1, 0);

        //Punkty do trójkąta
        Point p5 = new Point(0, 0);
        Point p6 = new Point(1, 0);
        Point p7 = new Point(0, 1);

        System.out.println();
        p1.showInfo();
        p2.showInfo();

        System.out.println();

        Calculator calc = new Calculator();
        calc.showInfo(p1,p2);

        Circle circle = new Circle(p1,p2);
        circle.showInfo();

        //Sliczny konstrukt
        Square square;
        try {
            square = new Square(p1,p2,p3,p4);
        } catch (BadShapeException errorMessage) {
            errorMessage.printMessage();
            throw new RuntimeException(errorMessage); //Runtime Aby przerwac dzialanie programu
        }
        square.showInfo();

        //Sliczny konstrukt
        Triangle triangle;
        try {
            triangle = new Triangle(p5,p6,p7);
        } catch (BadShapeException errorMessage) {
            errorMessage.printMessage();
            throw new RuntimeException(errorMessage); //Runtime Aby przerwac dzialanie programu
        }
        triangle.showInfo();

        System.out.println(calc.calculateAreaSum(square,triangle));

    }
}
