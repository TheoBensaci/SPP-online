package ch.heig.game.render;

import java.awt.*;

public interface IDrawable {
    void draw(Graphics g);

    int getLayer();
}
