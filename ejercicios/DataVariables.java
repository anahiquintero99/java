package ejercicios;

public class DataVariables {

  public static void main(String[] args) {
    int salary = 1000; // int
    // pension 3%
    double pension = salary * 0.03; // double
    double totalySalary = salary - pension;

    String emplyeename = "Anahi";

    System.out.println("El salario de " + emplyeename + " es de: $" + totalySalary);
  }
}
