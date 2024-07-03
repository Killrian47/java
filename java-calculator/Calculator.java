/**
 * Calculator
 */
public class Calculator {
  private static final String ADD = "+";
  private static final String SUBSTRACT = "-";
  private static final String MULTIPLY = "*";
  private static final String DIVIDE = "/";

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
    if (b == 0) {
      throw new ArithmeticException("Cannot divide by zero");
    }
    return a / b;
  }

  public static void main(String[] args) {
    System.out.println("Bienvenue sur la calculatrice en java");

    java.io.Console console = System.console();

    try {
      int firstNumber = readNumber(console, "Ton premier chiffre: ");
      String operand = console.readLine("L'opérateur: ");
      int secondNumber = readNumber(console, "Ton second chiffre: ");

      int result = calculate(firstNumber, secondNumber, operand);
      System.out.println(
          "Le résult pour l'opération suivante " + firstNumber + " " + operand + " " + secondNumber + " est égal à "
              + result);
    } catch (NumberFormatException e) {
      System.err.println("Entrée invalide, vous devez entrer des chiffres valides.");
    } catch (ArithmeticException e) {
      System.err.println(e.getMessage());
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }
  }

  private static int readNumber(java.io.Console console, String prompt) throws NumberFormatException {
    String userInput = console.readLine(prompt);
    return Integer.parseInt(userInput);
  }

  private static int calculate(int a, int b, String operand) {
    switch (operand) {
      case ADD:
        return add(a, b);
      case SUBSTRACT:
        return substract(a, b);
      case MULTIPLY:
        return multiply(a, b);
      case DIVIDE:
        return divide(a, b);
      default:
        throw new IllegalArgumentException("Opérateur invalide: " + operand);
    }
  }
}