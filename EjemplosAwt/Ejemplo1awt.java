package EjemplosAwt;

import java.awt.*;

public class Ejemplo1awt extends Panel {
  Ejemplo1awt() {
    setBackground(Color.BLACK);
  }

  public void paint(Graphics g) {

    // Green
    g.setFont(new Font("Helvetica", Font.PLAIN, 16));
    g.setColor(new Color(0, 255, 0));
    g.drawString("Prueba AWT", 30, 100);
    g.setColor(new Color(1.0f, 0, 0));
  }

  public static void main(String[] args) {
    Frame f = new Frame("Prueba de AWT");
    Ejemplo1awt gp = new Ejemplo1awt();
    f.add(gp);
    f.setSize(600, 300);
    f.setVisible(true);
  }
}