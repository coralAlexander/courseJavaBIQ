package exercise_rectangle;

public class Rectangle {
    private Point p1;
    private Point p2;

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public int calcPerimeter(Rectangle r) {
        return ((r.p1.getX() - r.p2.getX()) + (r.p2.getY() - r.p1.getY())) * 2;
    }

    public int calcSquare(Rectangle r) {
        return ((r.p1.getX() - r.p2.getX()) * (r.p2.getY() - r.p1.getY()));

    }

    public boolean isFirstContainesSecond(Rectangle r2) {
        return (p1.getX() >= r2.p1.getX() &&
                r2.p2.getX() >= p2.getX() &&
                r2.p1.getY() >= p1.getY() &&
                p2.getY() >= r2.p2.getY());
    }

    public boolean isSecondContainsFirst(Rectangle r2) {
        return (p1.getX() <= r2.p1.getX() &&
                r2.p2.getX() <= p2.getX() &&
                r2.p1.getY() <= p1.getY() &&
                p2.getY() <= r2.p2.getY());
    }

    public int whoIsWinner(Rectangle r2) {
        System.out.println(calcPerimeter(this));
        System.out.println(calcSquare(this));
        System.out.println(calcPerimeter(r2));
        System.out.println(calcSquare(r2));

        if (this.isFirstContainesSecond(r2) &&
                (calcPerimeter(this) > calcPerimeter(r2) &&
                        calcSquare(this) > calcSquare(r2))) {
            return 0;}

        if (this.isFirstContainesSecond(r2) ||
                (calcPerimeter(this) > calcPerimeter(r2) &&
                        calcSquare(this) > calcSquare(r2))) {
            return 1;
        } else if (this.isSecondContainsFirst(r2) ||
                (calcPerimeter(this) < calcPerimeter(r2) &&
                        calcSquare(this) < calcSquare(r2))) {
            return -1;
        } else {

            return 0;
        }

    }
}
