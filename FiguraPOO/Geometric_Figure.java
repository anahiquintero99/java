package FiguraPOO;

abstract class Geometric_Figure {
  Point p1;
  final float PI = 3.1415926535F;

  public Geometric_Figure() {
    p1 = new Point();
  }

  public Geometric_Figure(int x1, int y1) {
    p1 = new Point(x1, y1);
  }

  public Geometric_Figure(Point p) {
    p1 = new Point(p.x, p.y);
  }

  // Metodos
  public abstract double perimeter();

  public abstract double area();

  public String printResult() {
    return "(" + p1.x + "," + p1.y + ")";
  }
}
