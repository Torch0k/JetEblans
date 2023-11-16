package org.example.listners;


import org.example.myJetShip.JetShip;
import org.example.graphic.Renderer;
import org.example.levels.Level1;
import org.example.menues.PauseMenu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoardListner implements KeyListener {
    private JetShip jetShip;
    private Level1 level1;
    private PauseMenu pauseMenu;
    private Renderer renderer;

    public KeyBoardListner(JetShip jetShip,Level1 level1,PauseMenu pauseMenu,Renderer renderer) {
        this.jetShip = jetShip;
        this.pauseMenu= pauseMenu;
        this.level1=level1;
        this.renderer=renderer;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        handleKeyPress(e);
        System.out.println("Key pressed: " + e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            togglePause();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //  логика при отпускании клавиш
    }

    private void handleKeyPress(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                jetShip.moveBy(0, -5);
                break;
            case KeyEvent.VK_DOWN:
                jetShip.moveBy(0, 5);
                break;
            case KeyEvent.VK_RIGHT:
                jetShip.moveBy(5, 0);
                break;
            case KeyEvent.VK_LEFT:
                jetShip.moveBy(-5, 0);
                break;
        }
    }
    public void togglePause() {
        if (level1 != null && level1.isPaused()) {
            level1.setPaused(false);
            renderer.resumeTimer();
            pauseMenu.setVisible(false);
        } else {
            if (level1 != null) {
                level1.setPaused(true);
            }
            renderer.pauseTimer();
            showPauseMenu();
        }
    }
    public void showPauseMenu() {
        if (renderer != null && renderer.getPauseMenu() != null) {
            renderer.getPauseMenu().setVisible(true);
        }
    }
}