package creationalPatterns.model;

/**
 * @author zhixi
 * @version 1.0 on 1/16/2021
 */
public final class Door extends MapSite {
  private final Room room1, room2;
  private boolean isOpen;

  public Door(final Room room1, final Room room2) {
    if (room1 == null || room2 == null) {
      throw new NullPointerException();
    }
    this.room1 = room1;
    this.room2 = room2;
  }

  @Override
  public void enter() {

  }

  public Room otherSideRoom(final Room room) {
    if (room == null) {
      throw new NullPointerException();
    }
    if (room.equals(room1)) {
      return room2;
    } else if (room.equals(room2)) {
      return room1;
    } else {
      throw new IllegalArgumentException();
    }
  }

  public boolean isOpen() {
    return isOpen;
  }
}
