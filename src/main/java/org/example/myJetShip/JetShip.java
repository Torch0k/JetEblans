package org.example.myJetShip;

import javax.swing.*;
import java.awt.*;

public class JetShip extends JComponent {
    private int x;
    private int y;
    private int speed;
    private int healthPoints;
    private Image image;

    public JetShip(int x, int y) {
        this.x = x;
        this.y = y;
        this.speed = 3;
        this.healthPoints = healthPoints;

        ImageIcon icon = new ImageIcon("src/main/java/Textures/JetShip.png");
        image = icon.getImage();

        setPreferredSize(new Dimension(image.getWidth(this), image.getHeight(this)));
    }

    public void moveBy(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
        repaint();
    }

    public void draw(Graphics g) {
        g.drawImage(image, x, y, this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}