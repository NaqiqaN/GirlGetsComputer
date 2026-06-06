
package main;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

        // CREATE WINDOW
        JFrame window = new JFrame();
        window.setTitle("2D Adventure");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        // ADD GAME PANEL
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        // FINALIZE WINDOW
        window.pack();
        window.setLocationRelativeTo(null); // center on screen
        window.setVisible(true);

        // START GAME
        gamePanel.setupGame();
        gamePanel.startGameThread();
    }
}