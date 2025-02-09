 /* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

/** An object of class Alien represents an alien in the game.  */

// FILL IN HERE - This declaration may change in your implementation 
public class Alien extends GameCharacter{
  // FILL IN YOUR INSTANCE VARIABLES HERE
  private int speedDamage = 0;
  String name;
  int health;
  int attack;
  int speed;
  /** Constructor: an instance with a name, health, attack, speed, and damage */
   Alien(String name, int health, int attack, int speed, int speedDamage) {
       super(name, health, attack, speed);
       this.name = name;
       this.health = health;
       this.attack = attack;
       this.speed = speed;
       this.speedDamage = speedDamage;
   }
   public void fight(Ripley ripley){
       super.hit(ripley);
       ripley.slowDown(speedDamage);
   }
    public int getSpeedDamage() {
        return this.speedDamage;
    }
  // FILL IN OTHER METHODS HERE
}
