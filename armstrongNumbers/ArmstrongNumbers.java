package armstrongNumbers;

/**
 * ArmstrongNumbers
 */
public class ArmstrongNumbers {

  public static Boolean isArmstrongNumber(int numberToCheck) {
    String numberStr = String.valueOf(numberToCheck);
    int numberOfDigits = numberStr.length();

    int sum = 0;
    int temp = numberToCheck;
    while (temp > 0) {
      int oneDigit = temp % 10;
      sum += Math.pow(oneDigit, numberOfDigits);
      temp = temp / 10;
    }
    return sum == numberToCheck;
  }
}