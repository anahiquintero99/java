package FiguraPOO;

public class Main {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(6, 6, 3, 3);
    System.out.println("\n El largo del rectangulo: " + rectangle.longF());
    System.out.println("\n El ancho del rectangulo: " + rectangle.width());
    System.out.println("\n El perimetro: " + rectangle.perimeter());
    System.out.println("\n El area: " + rectangle.area());
    System.out.println("\n El area: " + rectangle.diagonal());
  }
}
