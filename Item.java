 /* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

/**
 * Simple class to hold item data.
 */
final class Item extends GameCharacter
{
  private final String name;
  private final int health;
  private final int attack;
  private final int speed;

  Item(String name, int health, int attack, int speed) {
    super(name, health, attack, speed);
    this.name = name;
    this.health = health;
    this.attack = attack;
    this.speed = speed;
  }


  // FILL IN WHATEVER ELSE YOU NEED HERE 
}



