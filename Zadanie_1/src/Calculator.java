import java.lang.Math;

public class Calculator {
    public double distanceX(Point p1, Point p2){
        double i = p1.getX() - p2.getX();
        return i;
    }
    public double distanceY(Point p1, Point p2){
        double i = p1.getY() - p2.getY();
        return i;
    }
    public double distance(Point p1, Point p2){
        return Math.sqrt((distanceX(p1,p2)*distanceX(p1, p2))+(distanceY(p1,p2)*distanceY(p1, p2)));
    }

}
