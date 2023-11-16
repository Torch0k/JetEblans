package org.example.menues;



import org.example.listners.MainMenuButtonListener;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {

    public MainMenu(){


        //окно его величесвта игры
        setTitle("SimpleJetGame");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton startButton = new JButton("старт");
        JButton exitButton = new JButton("выйти");

//размер кнопок
        Dimension buttonSize = new Dimension(100, 50);

        startButton.setPreferredSize(buttonSize);
        exitButton.setPreferredSize(buttonSize);
        //прослушка кнопок
        MainMenuButtonListener buttonListener = new MainMenuButtonListener(this);
        startButton.addActionListener(buttonListener);
        exitButton.addActionListener(buttonListener);


        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        // отступы между кнопками
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(startButton, gbc);


        gbc.gridy = 1;
        panel.add(exitButton, gbc);

        // Добавляем панель на фрейм
        add(panel);

        setVisible(true);
    }

}
