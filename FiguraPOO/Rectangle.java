package FiguraPOO;

public class Rectangle extends Geometric_Figure {
  Point p2;

  public Rectangle() {
    p2 = new Point();
  }

  public Rectangle(int x1, int y1, int x2, int y2) {
    super(x1, y1);
    p2 = new Point(x2, y2);
  }

  public Rectangle(Point p1, Point p2) {
    super(p1);
    p2 = new Point(p2.x, p2.y);
  }

  public double longF() {
    return Math.abs(p1.x - p2.x);
  }

  public double width() {
    return Math.abs(p1.y - p2.y);
  }

  public double perimeter() {
    return (longF() + width()) * 2;
  }

  public double area() {
    return (width() * longF());
  }

  public double diagonal() {
    return p1.distance(p2);
  }
}
