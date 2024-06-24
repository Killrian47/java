package darts;

class Darts {
  int score(double xOfDart, double yOfDart) {
    double result = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);
    if (result > 10) {
      return 0;
    } else if (result <= 10 && result > 5) {
      return 1;
    } else if (result <= 5 && result > 1) {
      return 5;
    } else if (result <= 1 && result >= 0) {
      return 10;
    }
    return 0;
  }
}
