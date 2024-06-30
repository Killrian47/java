package inherit;

/**
 * Wizard
 */
public class Wizard extends Fighter {
  public boolean spellPrepared = false;

  public boolean isVulnerable() {
    return !this.spellPrepared;
  }

  public boolean prepareSpell() {
    return this.spellPrepared = true;
  }

  @Override
  public String toString() {
    return "Fighter is a Wizard";
  }

  public int getDamagePoints(Fighter fighter) {
    if (this.spellPrepared) {
      return 12;
    } else {
      return 3;
    }
  }
}