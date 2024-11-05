
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(3, 5);
        Point p4 = new Point(6, 7);

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
            throw new RuntimeException(errorMessage); //Runtime Aby przerwac dziaalanie programu
        }

        square.showInfo();

        Triangle triangle = new Triangle(p1,p2,p3);
        triangle.showInfo();

        System.out.println(calc.calculateAreaSum(square,triangle));

    }
}
