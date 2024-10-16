public class Point {

    private int X;
    private int Y;

    //Konstruktor
    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    //gethery
    public int getX() {
        return X;
    }
    public int getY(){
        return Y;
    }

    //settery
    public void setX(int X) {
        this.X = X;
    }
    public void setY(int b) {
        this.Y = Y;
    }

    public void showInfo(){
        System.out.println("X: " + X);
        System.out.println("Y: " + Y);
    }
}
