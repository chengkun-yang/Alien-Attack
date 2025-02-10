 /* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

/**
 * The main game logic.
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
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
   * prints out each line of text corresponding to action
   */
  public void play() throws FileNotFoundException {
       // FILL IN THE MAIN LOOP FOR GAME PLAY HERE
    boolean turn;
    System.out.println("       Welcome to Alien Attack!\n" + "       ------------------------\n");
    System.out.println(ripley.getName() + " starts with health: " + ripley.getHealth() + " speed: " + ripley.getSpeed() + " attack: " + ripley.getAttack() + "\n");
    //basic gameplay combat loop
    for (Room room : rooms) {
      System.out.println("Room: " + room.getName() + ". " + ripley.getName() + " encounters a " + room.getAlien().getName());
      System.out.println("    " + room.getAlien().getName() + " - " + "health: " + room.getAlien().getHealth() + " speed: " + room.getAlien().getSpeed() + " attack: " + room.getAlien().getAttack() + " speed damage: " + room.getAlien().getSpeedDamage());
      //if alien is faster or same, returns false, else returns true
      turn = room.getAlien().getSpeed() <= ripley.getSpeed();
      //turn based to check who is faster and fighting portion
      while(ripley.isAlive() && room.getAlien().isAlive()) {
        if (turn) {
          System.out.println(ripley.getName() + " attacks " + room.getAlien().getName() + ", causing " + ripley.getAttack() + " damage.");
          ripley.fight(room.getAlien());
          turn = false;
        }
        else {
          System.out.println(room.getAlien().getName() + " attacks " + ripley.getName() + ", causing " + room.getAlien().getAttack() + " damage.");
          room.getAlien().fight(ripley);
          turn = true;
        }
      }
      //adds item if ripley kills alien
      if(ripley.isAlive()) {
        System.out.println(room.getAlien().getName() + " is defeated!");
        System.out.println(ripley.getName() + " finds " + room.getItem().getName() + "\n");
        ripley.useItem(room.getItem());
      }
      //breaks if ripley is dead before alien
      else if(ripley.isDead()) {
        System.out.println( ripley.getName() + " is dead - GAME OVER!");
        break;
      }
    }
    //if all rooms cleared, win message
    if(ripley.isAlive()) {
      System.out.println(ripley.getName() + " wins!");
    }
  }
}


