package ageSpace;

class AgeSpace {
  public double seconds;

  AgeSpace(double seconds) {
    this.seconds = seconds;
  }

  double getSeconds() {
    return this.seconds;
  }

  double onEarth() {
    return getSeconds() / 60 / 60 / 24 / 365.25;
  }

  double onMercury() {
    double yearEarth = getSeconds() / 60 / 60 / 24 / 365.25;
    return yearEarth / 0.2408467;
  }

  double onVenus() {
    double yearEarth = getSeconds() / 60 / 60 / 24 / 365.25;
    return yearEarth / 0.61519726;
  }

  double onMars() {
    throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
  }

  double onJupiter() {
    throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
  }

  double onSaturn() {
    throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
  }

  double onUranus() {
    throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
  }

  double onNeptune() {
    throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
  }

}
