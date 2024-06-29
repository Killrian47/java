package exception;

class CalculatorConundrum {
  public String calculate(int operand1, int operand2, String operation) throws Exception {
    String result = "";
    if ("+".equals(operation)) {
      int operationResult = operand1 + operand2;
      result = operand1 + " + " + operand2 + " = " + operationResult;
    } else if ("/".equals(operation)) {
      try {
        int x = operand1 / operand2;
      } catch (ArithmeticException e) {
        throw new Exception("Division by zero is not allowed", e);
      }
      int operationResult = operand1 / operand2;
      result = operand1 + " / " + operand2 + " = " + operationResult;
    } else if ("*".equals(operation)) {
      int operationResult = operand1 * operand2;
      result = operand1 + " * " + operand2 + " = " + operationResult;
    } else if (operation == null) {
      throw new IllegalArgumentException("Operation cannot be null");
    } else if (operation.equals("")) {
      throw new IllegalArgumentException("Operation cannot be empty");
    } else {
      throw new Exception("Operation '" + operation + "' does not exist");
    }
    return result;
  }
}
