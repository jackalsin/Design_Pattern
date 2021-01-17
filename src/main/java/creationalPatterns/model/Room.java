package creationalPatterns.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhixi
 * @version 1.0 on 1/16/2021
 */
public final class Room extends MapSite {
  private final Map<Direction, MapSite> sides = new HashMap<>();

  private final int roomNo;

  public Room(final int roomNo) {
    this.roomNo = roomNo;
  }

  @Override
  public void enter() {

  }

  public int roomNo() {
    return roomNo;
  }

  public void setSide(final Direction direction, final MapSite site) {
    sides.put(direction, site);
  }
}
