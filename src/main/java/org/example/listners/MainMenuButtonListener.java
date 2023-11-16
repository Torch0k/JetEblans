package org.example.listners;

import org.example.levels.Level1;
import org.example.menues.MainMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuButtonListener implements ActionListener {
    private MainMenu mainMenu;

    // Корректное название конструктора
    public MainMenuButtonListener(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "старт":
                System.out.println("Нажата кнопка 'старт'");
                startGame();
                break;
            case "выйти":
                System.out.println("Нажата кнопка 'выйти'");
                System.exit(0);
                break;
        }
    }

    private void startGame() {
        javax.swing.SwingUtilities.invokeLater(() -> {
            Level1 level1 = new Level1();
            level1.setVisible(true);
            if (mainMenu != null) {
                mainMenu.setVisible(false);
            }
        });
    }
}
