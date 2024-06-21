package carsAssemble;

public class CarsAssemble {
  public double productionRatePerHour(int speed) {
    if (speed == 0) {
      return 0.0;
    } else if (speed >= 1 && speed < 5) {
      return speed * 221.0;
    } else if (speed >= 5 && speed < 9) {
      return (speed * 221) * 0.9;
    } else if (speed == 9) {
      return (speed * 221) * 0.8;
    } else {
      return (speed * 221) * 0.77;
    }
  }

  public int workingItemsPerMinute(int speed) {
    return (int) Math.floor(productionRatePerHour(speed) / 60);
  }
}