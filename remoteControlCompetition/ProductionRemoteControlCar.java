package remoteControlCompetition;

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
  public int distanceTravelled = 0;
  public int numberOfVictories = 0;

  public void drive() {
    this.distanceTravelled += 10;
  }

  public int getDistanceTravelled() {
    return this.distanceTravelled;
  }

  public int getNumberOfVictories() {
    return this.numberOfVictories;
  }

  public void setNumberOfVictories(int numberOfVictories) {
    this.numberOfVictories += numberOfVictories;
  }

  @Override
  public int compareTo(ProductionRemoteControlCar other) {
    // For descending order, compare other.victories with this.victories
    return Integer.compare(other.numberOfVictories, this.numberOfVictories);
  }
}
