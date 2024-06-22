package needForSpeed;

class NeedForSpeed {
  public int speed;
  public int battery = 100;
  public int batteryDrain;
  public int distanceDriven = 0;

  NeedForSpeed(int speed, int batteryDrain) {
    this.speed = speed;
    this.batteryDrain = batteryDrain;
  }

  public boolean batteryDrained() {
    return this.battery <= 0;
  }

  public int distanceDriven() {
    return this.distanceDriven;
  }

  public void drive() {
    if (this.battery > 0) {
      this.distanceDriven += this.speed;
      this.battery -= this.batteryDrain;
    }
  }

  public static NeedForSpeed nitro() {
    return new NeedForSpeed(50, 4);
  }
}

class RaceTrack {
  public int distance;

  RaceTrack(int distance) {
    this.distance = distance;
  }

  public boolean tryFinishTrack(NeedForSpeed car) {
    while (!car.batteryDrained() && car.distanceDriven < this.distance) {
      car.drive();
    }
    return car.distanceDriven() >= this.distance;
  }
}
