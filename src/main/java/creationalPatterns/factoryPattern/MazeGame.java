package creationalPatterns.factoryPattern;

import creationalPatterns.model.Door;
import creationalPatterns.model.Maze;
import creationalPatterns.model.Room;
import creationalPatterns.model.Wall;

import static creationalPatterns.model.Direction.EAST;
import static creationalPatterns.model.Direction.NORTH;
import static creationalPatterns.model.Direction.SOUTH;
import static creationalPatterns.model.Direction.WEST;

/**
 * @author jacka
 * @version 1.0 on 1/17/2021
 */
public abstract class MazeGame {

  public Maze createMaze() {
    final Maze aMaze = makeMaze();
    final Room r1 = makeRoom(1),
        r2 = makeRoom(2);
    final Door theDoor = makeDoor(r1, r2);
    aMaze.addRoom(r1);
    aMaze.addRoom(r2);

    r1.setSide(NORTH, makeWall());
    r1.setSide(EAST, theDoor);
    r1.setSide(SOUTH, makeWall());
    r1.setSide(WEST, makeWall());

    r2.setSide(NORTH, makeWall());
    r2.setSide(EAST, makeWall());
    r2.setSide(SOUTH, makeWall());
    r2.setSide(WEST, theDoor);

    return aMaze;
  }

  // factory method

  public abstract Maze makeMaze();

  public abstract Room makeRoom(final int roomId);

  public abstract Wall makeWall();

  public abstract Door makeDoor(final Room r1, final Room r2);
}
