package squeakyClean;

class SqueakyClean {
  static String clean(String identifier) {
    String resultString = "";
    for (int i = 0; i < identifier.length(); i++) {
      if (identifier.charAt(i) == ' ') {
        resultString += "_";
      } else if (identifier.charAt(i) == '-') {
        resultString += Character.toUpperCase(identifier.charAt(i + 1));
        i++;
      } else if (identifier.charAt(i) == '3') {
        resultString += "e";
      } else if (identifier.charAt(i) == '0') {
        resultString += "o";
      } else if (identifier.charAt(i) == '4') {
        resultString += "a";
      } else if (identifier.charAt(i) == '1') {
        resultString += "l";
      } else if (identifier.charAt(i) == '7') {
        resultString += "t";
      } else if (identifier.charAt(i) == '!' || identifier.charAt(i) == '¡') {
        resultString += "";
      } else if (!Character.isLetter(identifier.charAt(i))) {
        resultString += "";
      } else {
        resultString += identifier.charAt(i);
      }
    }
    return resultString;
  }
}
