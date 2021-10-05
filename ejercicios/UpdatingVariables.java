package ejercicios;

public class UpdatingVariables {
  public static void main(String[] args) {
    // Salario
    int salary = 1000;

    // suma de bono y salario
    int bono = 200;
    salary = salary + bono;

    // Descontar pension $50
    int pension = 50;
    salary = salary - pension;

    // 2 horas extra c/u $30
    // Comoda $45
    int hourExtra = 30;
    int snaks = 45;

    salary = (salary + (hourExtra * 2)) - snaks;

    // nombre del empleado
    String emplyeename = "Anahi Quintero";

    System.out.println(emplyeename + " tiene un salario de $" + salary);

  }
}