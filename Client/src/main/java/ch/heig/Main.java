package ch.heig;

import ch.heig.game.Game;
import ch.heig.game.TestObj;

public class Main {
    public static void main(String[] args) {
        Game g = Game.creatGame(true);
        TestObj t = new TestObj(false);
    }
}