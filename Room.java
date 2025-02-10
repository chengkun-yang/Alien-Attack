 /* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

 /** Class to hold room's data
  * requires getters to pull objects from room object
  Author: Chengkun Yang
  EID: cy7496
  */

final class Room 
{ 
  private final String name;
  private final Alien alien;
  private final Item item;

  /**
   * Default constructor for room object
   * @param name - name of room
   * @param alien - alien object
   * @param item - item object
   */
  public Room(String name, Alien alien, Item item) {
     // FILL IN HERE
    this.name = name;
    this.alien = alien;
    this.item = item;
  }

  /**
   * Getters for room object
   */
  public String getName(){  return this.name;}
  public Alien getAlien(){ return this.alien;}
  public Item getItem(){  return this.item;}
  //FILL IN ANYTHING ELSE YOU NEED HERE
}



