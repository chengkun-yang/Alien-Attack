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
    boolean turn;
    System.out.println("       Welcome to Alien Attack!\n" + "       ------------------------\n");
    System.out.println("Ripley starts with health: " + ripley.getHealth() + " speed: " + ripley.getSpeed() + " attack: " + ripley.getAttack() + "\n");
    for (Room room : rooms) {
      System.out.println("Room: " + room.getName() + ". " + "Ripley encounters a " + room.getAlien().getName());
      System.out.println("    " + room.getAlien().getName() + " - " + "health: " + room.getAlien().getHealth() + " speed: " + room.getAlien().getSpeed() + " attack: " + room.getAlien().getAttack() + " speed damage: " + room.getAlien().getSpeedDamage());
      turn = room.getAlien().getSpeed() <= ripley.getSpeed(); //if alien is faster or same, returns false, else returns true
      while(ripley.isAlive() && room.getAlien().isAlive()) {
        if (turn) {
          System.out.println("Ripley attacks " + room.getAlien().getName() + ", causing " + ripley.getAttack() + " damage.");
          ripley.fight(room.getAlien());
          turn = false;
        }
        else {
          System.out.println(room.getAlien().getName() + " attacks Ripley, causing " + room.getAlien().getAttack() + " damage.");
          room.getAlien().fight(ripley);
          turn = true;
        }
      }
      if(ripley.isAlive()) {
        System.out.println(room.getAlien().getName() + " is defeated!");
        System.out.println("Ripley finds " + room.getItem().getName() + "\n");
        ripley.useItem(room.getItem());
      }
      else if(ripley.isDead()) {
        System.out.println("Ripley is dead - GAME OVER!\n");
        break;
      }
    }
    if(ripley.isAlive()) {
      System.out.println("Ripley wins!\n");
    }
  }
}


