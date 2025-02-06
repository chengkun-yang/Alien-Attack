 /* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

/**
 * Ripley is a character that can fight aliens.
 */

// FILL IN YOUR IMPLEMENTATION OF THE RIPLEY CLASS HERE 
// This declaration may change in your implementation 
public class Ripley extends GameCharacter
{

  /**
   * Constructor for Ripley
   */ 
  public Ripley(String name, int health, int attack, int speed) {
      name = ripleyParts[0].trim();
      health = Integer.parseInt(ripleyParts[1]);
      attack = Integer.parseInt(ripleyParts[2]);
      speed = Integer.parseInt(ripleyParts[3]);
    }
  
  /**
   * Fight an alien 
   */
  public void fight(Alien alien) {
    //FILL IN YOUR FIGHT CODE HERE
    hit(alien);
  }

  @Override
  public void slowDown(int speedDamage) {
    super.slowDown(speedDamage);
  }
  // FILL IN ANYTHING ELSE YOU NEED HERE

}
