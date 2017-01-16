package ru.geekbrains.mks;

import javax.swing.*;
import java.awt.*;

public class Snake extends JFrame {
    private static Snake game_window;
    public static void main(String[] args) {
        game_window = new Snake();
        game_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game_window.setSize(600, 500);
        game_window.setLocation(750, 100);
        game_window.setResizable(false);
        game_window.setTitle("SNAKE");
        JPanel game_field = new JPanel();
        game_field.paintComponents();
        game_window.add(game_field);
        game_window.setVisible(true);
    }
    public static void onRepaint(Graphics g) {
        g.drawLine(10, 10, 80, 120);
    }

 //   public static class GameField extends JPanel {
 //       protected void paintComponent
 //   }
}
