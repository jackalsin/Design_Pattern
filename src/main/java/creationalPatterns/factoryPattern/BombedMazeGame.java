package creationalPatterns.factoryPattern;

import creationalPatterns.abstractFactoryPattern.system.concreteFactory.BombedWall;
import creationalPatterns.model.Door;
import creationalPatterns.model.Maze;
import creationalPatterns.model.Room;
import creationalPatterns.model.Wall;

/**
 * @author jacka
 * @version 1.0 on 1/17/2021
 */
public final class BombedMazeGame extends MazeGame {

  @Override
  public Maze makeMaze() {
    return new Maze();
  }

  @Override
  public Room makeRoom(int roomId) {
    return new Room(roomId);
  }

  @Override
  public Wall makeWall() {
    return new BombedWall();
  }

  @Override
  public Door makeDoor(final Room r1, final Room r2) {
    return new Door(r1, r2);
  }
}
