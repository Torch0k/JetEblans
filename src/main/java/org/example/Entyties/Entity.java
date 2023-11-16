package org.example.Entyties;

import javax.swing.*;
import java.awt.*;

public class Entity extends JComponent {   // прородитель всех врагов
    protected int x;
    protected int y;
    protected int healthPoints;
    protected int damageDeal;
    protected int speed;
    protected Image image;

    public Entity(int x, int y, int healthPoints, int damageDeal, int speed, String imagePath) {
        this.x = x;
        this.y = y;
        this.healthPoints = healthPoints;
        this.damageDeal = damageDeal;
        this.speed = speed;

        ImageIcon icon = new ImageIcon(imagePath);
        image = icon.getImage();

        setPreferredSize(new Dimension(image.getWidth(this), image.getHeight(this)));
    }

    public void moveBy(int moveX, int moveY) {
        x += moveX;
        y += moveY;
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

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getDamageDeal() {
        return damageDeal;
    }

    public int getSpeed() {
        return speed;
    }
}
