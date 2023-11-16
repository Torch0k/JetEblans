package org.example.graphic;

import org.example.myJetShip.JetShip;
import org.example.levels.Level1;
import org.example.listners.KeyBoardListner;
import org.example.menues.PauseMenu;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel {

    private JetShip jetShip;
    private KeyBoardListner keyBoardListner;
    private Level1 level1;
    private PauseMenu pauseMenu;
    private Timer timer;
    public Renderer() {
        jetShip = new JetShip(50, 50);
        keyBoardListner = new KeyBoardListner(jetShip,null, pauseMenu, this);
        addKeyListener(keyBoardListner);
        setFocusable(true);
        requestFocusInWindow();
        timer = new Timer(16, e -> {
            if (!isPaused()) {
                repaint();
                //System.out.println("игра играется ");
            }
        });
        timer.start();
    }
    private boolean paused = false;
    public void setPaused(boolean paused) {
        this.paused = paused;
    }
    public boolean isPaused() {
        return paused;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        jetShip.draw(g);
    }
    public void pauseTimer() {
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
    }
    public void resumeTimer() {
        if (timer != null && !timer.isRunning()) {
            timer.start();
        }
    }
    public PauseMenu getPauseMenu() {
        return pauseMenu;
    }
    public void setPauseMenu(PauseMenu pauseMenu) {
        this.pauseMenu = pauseMenu;
    }
    public KeyBoardListner getKeyBoardListner() {
        return keyBoardListner;
    }
}
