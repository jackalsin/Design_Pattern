package creationalPatterns.prototypePattern;

/**
 * @author zhixi
 * @version 1.0 on 1/18/2021
 */
public abstract class Prototype implements Cloneable {
  public abstract Prototype Clone() throws CloneNotSupportedException;
}
