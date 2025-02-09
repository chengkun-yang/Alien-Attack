 /* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

/**
 * The main game logic.
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

 /** Runs through main gameplay loop
  Author: Chengkun Yang
  EID: cy7496
  */
public final class Game {
  private final Ripley ripley;
  private final List<Room> rooms;

   /**
    * default constructor to pass ripley and room values
    * @param ripley - the ripley object to be passed into Ripley.java
    * @param rooms - the rooms object to be passed into Room.java
    */
  public Game(Ripley ripley, List<Room> rooms) {
    this.ripley = ripley;
    this.rooms = rooms;
  }
  
  /**
   * This method implements the main loop in the game
   */
  public void play(){
       // FILL IN THE MAIN LOOP FOR GAME PLAY HERE
    System.out.println("       Welcome to Alien Attack!\n" + "       ------------------------\n" + "\n");
    System.out.println("Ripley starts with health: " + ripley.getHealth() + " speed: " + ripley.getSpeed() + " attack:" + ripley.getAttack() + "\n");
    for (Room room : rooms) {
      this.ripley.isAlive();
      System.out.println("Game not implemented yet!");
    }
  }
}


