package ejercicios;

public class Casting {
  public static void main(String[] args) {

    // En un año ubicar 30 perritos
    // Cuantos perritos ubique al mes

    double monthlyDogs = 30.0 / 12.0;
    System.out.println(monthlyDogs);

    // Estimación
    int estimatedMonthlyDogs = (int) monthlyDogs;
    System.out.println(estimatedMonthlyDogs);
  }
}
