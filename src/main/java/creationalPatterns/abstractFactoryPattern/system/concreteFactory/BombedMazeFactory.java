package creationalPatterns.abstractFactoryPattern.system.concreteFactory;

import creationalPatterns.abstractFactoryPattern.system.abstractFactory.MazeFactory;
import creationalPatterns.model.Wall;

/**
 * @author jacka
 * @version 1.0 on 1/17/2021
 */
public final class BombedMazeFactory extends MazeFactory {
  @Override
  public Wall makeWall() {
    return new BombedWall();
  }
}
