package ch.heig.game.window;

import ch.heig.game.render.GameRender;
import ch.heig.game.utils.Input;

import javax.swing.*;


public class Window extends JFrame {
    public GameRender gameCanvas;


    public Window(){
        // create a empty canvas
        gameCanvas = new GameRender();

        add(gameCanvas);

        // add input listener
        addKeyListener(new Input());


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
