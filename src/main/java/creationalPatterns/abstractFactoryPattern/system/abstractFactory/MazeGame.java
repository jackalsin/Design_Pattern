package creationalPatterns.abstractFactoryPattern.system.abstractFactory;

import creationalPatterns.model.Door;
import creationalPatterns.model.Maze;
import creationalPatterns.model.Room;

import static creationalPatterns.model.Direction.EAST;
import static creationalPatterns.model.Direction.NORTH;
import static creationalPatterns.model.Direction.SOUTH;
import static creationalPatterns.model.Direction.WEST;

/**
 * @author jacka
 * @version 1.0 on 1/17/2021
 */
public final class MazeGame {
  public Maze createmaze(final MazeFactory factory) {
    final Maze aMaze = factory.makeMaze();
    final Room r1 = factory.makeRoom(1);
    final Room r2 = factory.makeRoom(2);
    final Door door = factory.makeDoor(r1, r2);
    aMaze.addRoom(r1);
    aMaze.addRoom(r2);

    r1.setSide(NORTH, factory.makeWall());
    r1.setSide(EAST, door);
    r1.setSide(SOUTH, factory.makeWall());
    r1.setSide(WEST, factory.makeWall());

    r2.setSide(NORTH, factory.makeWall());
    r2.setSide(EAST, factory.makeWall());
    r2.setSide(SOUTH, factory.makeWall());
    r2.setSide(WEST, door);

    return aMaze;
  }
}
