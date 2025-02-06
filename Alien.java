 /* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

/** An object of class Alien represents an alien in the game.  */

// FILL IN HERE - This declaration may change in your implementation 
public class Alien extends GameCharacter{
  // FILL IN YOUR INSTANCE VARIABLES HERE
  private final int speedDamage = 0;
  /** Constructor: an instance with a name, health, attack, speed, and damage */
   Alien(String name, int health, int attack, int speed, int speedDamage) {
    // FILL IN YOUR CONSTRUCTOR HERE
       name = lines[1].trim();
       health = Integer.parseInt(lines[2]);
       attack = Integer.parseInt(lines[3]);
       speed = Integer.parseInt(lines[4]);
       super(speedDamage) = Integer.parseInt(lines[5]);
   }
   public void fight(Ripley ripley){
       super.hit(ripley);
       ripley.slowDown(speedDamage);
   }
  // FILL IN OTHER METHODS HERE
}
