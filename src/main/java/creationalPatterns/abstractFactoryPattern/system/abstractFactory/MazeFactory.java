package creationalPatterns.abstractFactoryPattern.system.abstractFactory;

import creationalPatterns.model.Door;
import creationalPatterns.model.Maze;
import creationalPatterns.model.Room;
import creationalPatterns.model.Wall;

/**
 * @author jacka
 * @version 1.0 on 1/17/2021
 */
public class MazeFactory {

  public Maze makeMaze() {
    return new Maze();
  }

  public Wall makeWall() {
    return new Wall();
  }

  public Room makeRoom(final int n) {
    return new Room(n);
  }

  public Door makeDoor(final Room r1, final Room r2) {
    return new Door(r1, r2);
  }
}
