package org.example.levels;

import org.example.graphic.Renderer;
import org.example.menues.PauseMenu;

import javax.swing.*;

public class Level1 extends JFrame {

    private Renderer renderer;
    private PauseMenu pauseMenu;

    public Level1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        renderer = new Renderer();
        pauseMenu = new PauseMenu(renderer.getKeyBoardListner());
        renderer.setPauseMenu(pauseMenu);
        add(renderer);

        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void setPaused(boolean paused) {
        renderer.setPaused(paused);
    }
    public boolean isPaused() {
        return renderer.isPaused();
    }
}
