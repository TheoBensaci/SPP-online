package ch.heig.game.utils;

import ch.heig.game.Game;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener {

    private static boolean up=false;
    private static boolean down=false;
    private static boolean right=false;
    private static boolean left=false;
    private static boolean a=false;
    private static boolean b=false;
    private static boolean c=false;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public static boolean getUp(){
        return up;
    }
    public static boolean getDown(){
        return down;
    }
    public static boolean getLeft(){
        return left;
    }
    public static boolean getRight(){
        return right;
    }

    public static boolean getA(){
        return a;
    }
    public static boolean getB(){
        return b;
    }
    public static boolean getC(){
        return c;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_W -> up=true;
            case KeyEvent.VK_S -> down=true;
            case KeyEvent.VK_D -> right=true;
            case KeyEvent.VK_A -> left=true;
            case KeyEvent.VK_J -> a=true;
            case KeyEvent.VK_K -> b=true;
            case KeyEvent.VK_R -> c=true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_W -> up=false;
            case KeyEvent.VK_S -> down=false;
            case KeyEvent.VK_D -> right=false;
            case KeyEvent.VK_A -> left=false;
            case KeyEvent.VK_J -> a=false;
            case KeyEvent.VK_K -> b=false;
            case KeyEvent.VK_R -> c=false;
        }
    }

    public static Point getMousePos(){
        Point p = MouseInfo.getPointerInfo().getLocation();
        Point q = Game.Instance.window.gameCanvas.getLocationOnScreen();
        p.x-=q.x;
        p.y-=q.y;
        return p;
    }
}
