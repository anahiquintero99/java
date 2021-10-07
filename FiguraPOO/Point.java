package FiguraPOO;

public class Point {
  int x, y;

  public Point() {
  };

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point p) {
    return (Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2)));
  }
}
