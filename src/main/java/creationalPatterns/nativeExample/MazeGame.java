package creationalPatterns.nativeExample;

import creationalPatterns.model.Door;
import creationalPatterns.model.Maze;
import creationalPatterns.model.Room;
import creationalPatterns.model.Wall;

import static creationalPatterns.model.Direction.*;

/**
 * @author zhixi
 * @version 1.0 on 1/16/2021
 */
public final class MazeGame {
  private MazeGame() {
  }

  public static Maze createmaze() {
    Maze aMaze = new Maze();
    Room r1 = new Room(1);
    Room r2 = new Room(2);
    Door theDoor = new Door(r1, r2);

    aMaze.addRoom(r1);
    aMaze.addRoom(r2);

    r1.setSide(NORTH, new Wall());
    r1.setSide(EAST, theDoor);
    r1.setSide(SOUTH, new Wall());
    r1.setSide(WEST, new Wall());

    r2.setSide(NORTH, new Wall());
    r2.setSide(EAST, new Wall());
    r2.setSide(SOUTH, new Wall());
    r2.setSide(WEST, theDoor);

    return aMaze;
  }

}
