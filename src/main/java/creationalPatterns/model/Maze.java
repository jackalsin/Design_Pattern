package creationalPatterns.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhixi
 * @version 1.0 on 1/16/2021
 */
public final class Maze {
  private Map<Integer, Room> rooms = new HashMap<>();

  public Room roomNo(final int id) {
    return rooms.get(id);
  }

  public Room addRoom(final Room room) {
    return rooms.put(room.roomNo(), room);
  }
}
