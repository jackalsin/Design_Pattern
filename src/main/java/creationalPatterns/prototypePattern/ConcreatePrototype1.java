package creationalPatterns.prototypePattern;

/**
 * @author zhixi
 * @version 1.0 on 1/18/2021
 */
public final class ConcreatePrototype1 extends Prototype {
  @Override
  public Prototype Clone() throws CloneNotSupportedException {
    return (Prototype) super.clone();
  }
}
