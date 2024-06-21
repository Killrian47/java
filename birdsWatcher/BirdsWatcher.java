package birdsWatcher;

class BirdWatcher {
  private final int[] birdsPerDay;

  public BirdWatcher(int[] birdsPerDay) {
    this.birdsPerDay = birdsPerDay.clone();
  }

  public int[] getLastWeek() {
    return birdsPerDay;
  }

  public int getToday() {
    return birdsPerDay[birdsPerDay.length - 1];
  }

  public void incrementTodaysCount() {
    birdsPerDay[birdsPerDay.length - 1] += 1;
  }

  public boolean hasDayWithoutBirds() {
    for (int birds : birdsPerDay) {
      if (birds == 0) {
        return true;
      }
    }
    return false;
  }

  public int getCountForFirstDays(int numberOfDays) {
    int result = 0;
    int limit = Math.min(numberOfDays, birdsPerDay.length);
    for (int i = 0; i < limit; i++) {
      result += birdsPerDay[i];
    }
    return result;
  }

  public int getBusyDays() {
    int countBusyDays = 0;
    for (int birds : birdsPerDay) {
      if (birds >= 5) {
        countBusyDays += 1;
      }
    }
    return countBusyDays;
  }
}
