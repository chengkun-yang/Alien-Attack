 /* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

/** An object of class Alien represents an alien in the game.  */

// FILL IN HERE - This declaration may change in your implementation 
public class Alien extends GameCharacter{
  // FILL IN YOUR INSTANCE VARIABLES HERE
  private int speedDamage = 0;

  /** Constructor: an instance with a name, health, attack, speed, and damage */
   Alien(String name, int health, int attack, int speed, int speedDamage) {
       super(name, health, attack, speed);
        this.speedDamage = speedDamage;
   }

    /**
     * modification of hit method from gamecharacter class
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
