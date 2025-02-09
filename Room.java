 /* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

/**
 * Simple class to hold the room's data
 */
final class Room 
{ 
  private final String name;
  private final Alien alien;
  private final Item item;

  public Room(String name, Alien alien, Item item) {
     // FILL IN HERE
    this.name = name;
    this.alien = alien;
    this.item = item;
  }
  public String getName(){  return this.name;}
  public Alien getAlien(){ return this.alien;}
  public Item getItem(){  return this.item;}
  //getter methods
  //FILL IN ANYTHING ELSE YOU NEED HERE
}



