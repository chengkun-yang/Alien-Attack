 /* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

 import java.util.List;

 /**
 * Ripley is a character that can fight aliens.
 */

// FILL IN YOUR IMPLEMENTATION OF THE RIPLEY CLASS HERE 
// This declaration may change in your implementation 
public class Ripley extends GameCharacter
{
    String name;
    int health;
    int attack;
    int speed;
  /**
   * Constructor for Ripley
   * @param name - passes in name
   * @param health - passes in health
   * @param attack - passes in attack
   * @param speed - passes in speed
   *
   */ 
  public Ripley(String name, int health, int attack, int speed) {
      super(name, health, attack, speed);
      this.name = name;
      this.health = health;
      this.attack = attack;
      this.speed = speed;
    }
  
  /**
   * Fight an alien 
   */
  public void fight(Alien alien) {
    //FILL IN YOUR FIGHT CODE HERE
    hit(alien);
  }

  // FILL IN ANYTHING ELSE YOU NEED HERE

}
