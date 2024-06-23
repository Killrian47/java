public class SalaryCalculator {
  public double salaryMultiplier(int daysSkipped) {
    return daysSkipped < 5 ? 1.0 : 1.0 * 0.85;
  }

  public int bonusMultiplier(int productsSold) {
    return productsSold >= 20 ? 13 : 10;
  }

  public double bonusForProductsSold(int productsSold) {
    return bonusMultiplier(productsSold) * productsSold;
  }

  public double finalSalary(int daysSkipped, int productsSold) {
    double salary = (1000.0 + bonusForProductsSold(productsSold)) * salaryMultiplier(daysSkipped);
    return salary >= 2000.0 ? 2000.0 : salary;
  }
}
