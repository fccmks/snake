package ru.geekbrains.mks;

import javax.swing.*;

public class Snake extends JFrame {
    private static Snake game_window;
    public static void main(String[] args) {
        game_window = new Snake();
        game_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game_window.setSize(600, 500);
        game_window.setLocation(750, 100);
        game_window.setResizable(false);
        game_window.setTitle("SNAKE");
        game_window.setVisible(true);
    }
}
