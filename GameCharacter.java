 /* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

/**
 * Represents a character in the game.
 */
public class GameCharacter {

  private    String name;
  private int health;
  private int attack;
  private int speed;

  /** Constructor: An instance with a name, initial health, attack points, and speed */
  public GameCharacter(String name, int health, int attack, int speed) {
    this.name = name;
    this.health = health;
    this.attack = attack;
    this.speed = speed;
  }

  /** Getters and setters */
  public String getName() {
    return this.name;
  }
  public void setName(String tempName) {
    this.name = tempName;
  }
  public int getHealth() {
    return this.health;
  }
  public void setHealth(int tempHealth) {
    this.health = tempHealth;
  }
  public int getAttack() {
    return this.attack;
  }
  public void setAttack(int tempAttack) {
    this.attack = tempAttack;
  }
  public int getSpeed() {
    return this.speed;
  }
  public void setSpeed(int tempSpeed) {
    this.speed = tempSpeed;
  }

  // FILL IN ANY accessors or mutators that are missing
  
  /**
   * Attacks the given target by reducing its health by the attack value.
   * @param target - object to have health reduced
   */
  public void hit(GameCharacter target) {
      // FILL IN HERE
    target.setHealth(target.getHealth() - this.getAttack());
  }

  /**
   * Reduces the speed of the character by the given amount.
   * @param speedDamage - how much slower the character gets
   */
  public void slowDown(int speedDamage) {
      // FILL IN HERE
    this.setSpeed(this.getSpeed() - speedDamage);
  }

  /** 
   * Increases character's attributes based on those of the item found
   * @param item - object item with stats to be added to ripley
   */ 
  public void useItem(Item item) {
      //FILL IN HERE
    this.health = this.health + item.getHealth();
    this.speed = this.speed + item.getSpeed();
    this.attack = this.attack + item.getAttack();
  }

  /**
   * Basic functions to check health of alien or ripley
   */
  public boolean isAlive() {
    return this.health > 0;
  }

  public boolean isDead() {
    return this.health <= 0;
  }
}
