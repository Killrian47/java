package reverseString;

public class ReverseString {
  public static String reverse(String inputString) {
    return new StringBuilder(inputString).reverse().toString();
  }
}