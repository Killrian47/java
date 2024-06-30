package inherit;

/**
 * Warrior
 */
public class Warrior extends Fighter {
  public boolean isVulnerable() {
    return false;
  }

  int getDamagePoints(Fighter fighter) {
    if (fighter.isVulnerable()) {
      return 10;
    } else {
      return 6;
    }
  }

  @Override
  public String toString() {
    return "Fighter is a Warrior";
  }
}