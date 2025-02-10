 /* Author: Chengkun Yang
 * Date: 2/9/2025
 * EID: cy7496
 */

/** An object of class Alien represents an alien in the game.  */

// FILL IN HERE - This declaration may change in your implementation 
public class Alien extends GameCharacter{
  // FILL IN YOUR INSTANCE VARIABLES HERE
  private int speedDamage = 0;

  /** Constructor: an instance with a name, health, attack, speed, and damage
   * @param name - alien name
   * @param health - alien health
   * @param attack - alien attack
   * @param speed - alien speed
   * @param speedDamage - alien speedDamage to Ripley
   */
   Alien(String name, int health, int attack, int speed, int speedDamage) {
       super(name, health, attack, speed);
        this.speedDamage = speedDamage;
   }

    /**
     * modification of hit method from gamecharacter class, inflicts slow
     * @param ripley - ripley object to be attacked
     */
   public void fight(Ripley ripley){
       super.hit(ripley);
       ripley.slowDown(speedDamage);
   }

    /**
     * Getter for speedDamage
     * @return speedDamage - the amount speed is reduced by
     */
    public int getSpeedDamage() {
        return this.speedDamage;
    }
  // FILL IN OTHER METHODS HERE
}
