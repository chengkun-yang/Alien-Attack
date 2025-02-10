 /* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

 /** Class to hold item data
  * Author: Chengkun Yang
  * EID: cy7496
  */
final class Item
{
  private final String name;
  private final int health;
  private final int attack;
  private final int speed;

  /**
   * Default constructor for item class
   * @param name - item name
   * @param health - item health value
   * @param attack - item attack value
   * @param speed - item speed value
   */
  Item(String name, int health, int attack, int speed) {
    this.name = name;
    this.health = health;
    this.attack = attack;
    this.speed = speed;
  }

  /**
   * Getters for item class
   */
  public String getName() {
    return this.name;
  }
  public int getHealth() {
    return this.health;
  }
  public int getAttack() {
    return this.attack;
  }
  public int getSpeed() {
    return this.speed;
  }


  // FILL IN WHATEVER ELSE YOU NEED HERE 
}



