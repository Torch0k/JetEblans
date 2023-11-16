package org.example.menues;

import org.example.listners.KeyBoardListner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PauseMenu extends JFrame {
    public PauseMenu(KeyBoardListner keyBoardListener) {
        setTitle("Pause Menu");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton continueButton = new JButton("Продолжить");
        JButton exitButton = new JButton("Выйти");

        ActionListener continueListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyBoardListener.togglePause();
                setVisible(false);
            }
        };

        continueButton.addActionListener(continueListener);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(continueButton, gbc);

        gbc.gridy = 1;
        panel.add(exitButton, gbc);


        add(panel);

        setVisible(false); // Начинаем с невидимого состояния
    }
}
