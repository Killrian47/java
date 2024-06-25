package atbash;

public class Atbash {
  private static final String PLAIN_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
  private static final String CIPHER_ALPHABET = "zyxwvutsrqponmlkjihgfedcba";

  public static String encode(String plaintext) {
    StringBuilder encoded = new StringBuilder();
    int groupCount = 0;

    for (char ch : plaintext.toLowerCase().toCharArray()) {
      if (Character.isLetter(ch)) {
        int index = PLAIN_ALPHABET.indexOf(ch);
        encoded.append(CIPHER_ALPHABET.charAt(index));
        groupCount++;
      } else if (Character.isDigit(ch)) {
        encoded.append(ch);
        groupCount++;
      }

      if (groupCount == 5) {
        encoded.append(' ');
        groupCount = 0;
      }
    }

    if (encoded.length() > 0 && encoded.charAt(encoded.length() - 1) == ' ') {
      encoded.deleteCharAt(encoded.length() - 1);
    }

    return encoded.toString();
  }

  public static String decode(String ciphertext) {
    StringBuilder decoded = new StringBuilder();

    for (char ch : ciphertext.toLowerCase().toCharArray()) {
      if (Character.isLetter(ch)) {
        int index = CIPHER_ALPHABET.indexOf(ch);
        decoded.append(PLAIN_ALPHABET.charAt(index));
      } else if (Character.isDigit(ch)) {
        decoded.append(ch);
      }
    }

    return decoded.toString();
  }
}
