package Exercise1;

public class Vector2D {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Vector2D(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX() {
        return x2 - x1;
    }

    public double getY() {
        return y2 - y1;
    }

    public Vector2D add(Vector2D other) {
        double newX = getX() + other.getX();
        double newY = getY() + other.getY();

        return new Vector2D(x1, y1, x1 + newX, y1 + newY);
    }

    public double scalarMult(Vector2D other) {
        return getX() * other.getX() + getY() * other.getY();
    }

    public Vector2D multiply(double k) {
        double newX = getX() * k;
        double newY = getY() * k;

        return new Vector2D(x1, y1, x1 + newX, y1 + newY);
    }

    public double length() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
    }

    public void print() {
        System.out.println("(" + x1 + ", " + y1 + ") -> ("
                + x2 + ", " + y2 + ")");
    }
}
