package creationalPatterns.abstractFactoryPattern.system;

import creationalPatterns.abstractFactoryPattern.system.abstractFactory.MazeFactory;
import creationalPatterns.abstractFactoryPattern.system.abstractFactory.MazeGame;
import creationalPatterns.abstractFactoryPattern.system.concreteFactory.BombedMazeFactory;
import creationalPatterns.model.Maze;
import org.junit.jupiter.api.Test;

/**
 * @author jacka
 * @version 1.0 on 1/17/2021
 */
class MazeGameTest {
  @Test
  void testOnlineCase1() {
    // if you need a normal one
    final Maze normalMazeGame = new MazeGame().createmaze(new MazeFactory());
    // if you need a bombed normal one
    final Maze bombedMazeGame = new MazeGame().createmaze(new BombedMazeFactory());
  }

}