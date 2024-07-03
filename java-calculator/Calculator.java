/**
 * Calculator
 */
public class Calculator {

  public static int add(int a, int b) {
    return a + b;
  }

  public static int substract(int a, int b) {
    return a - b;
  }

  public static int multiply(int a, int b) {
    return a * b;
  }

  public static int divide(int a, int b) {
    if (b != 0) {
      return a / b;
    } else {
      throw new ArithmeticException("Cannot divide by zero");
    }
  }

  public static void main(String[] args) {
    System.out.println("Bienvenue sur la calculatrice en java");
    java.io.Console console = System.console();
    String askForFirstNumber = console.readLine("Ton premier chiffre: ");
    int firstNumber = Integer.parseInt(askForFirstNumber);
    String operand = console.readLine("L'opérateur: ");
    String askForSecondNumber = console.readLine("Ton second chiffre: ");
    int secondNumber = Integer.parseInt(askForSecondNumber);
    switch (operand) {
      case "+":
        System.out.println("Le résultat pour cette opération est : " + Calculator.add(firstNumber, secondNumber));
        break;
      case "-":
        System.out.println("Le résultat pour cette opération est : " + Calculator.substract(firstNumber, secondNumber));
        break;
      case "/":
        System.out.println("Le résultat pour cette opération est : " + Calculator.divide(firstNumber, secondNumber));
        break;
      case "*":
        System.out.println("Le résultat pour cette opération est : " + Calculator.multiply(firstNumber, secondNumber));
        break;
      default:
        break;
    }
  }
}