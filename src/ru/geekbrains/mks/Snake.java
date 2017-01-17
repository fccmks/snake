package ru.geekbrains.mks;

import javax.swing.*;
import java.awt.*;

public class Snake extends JFrame {
    private static Snake game_window;
    public static void main(String[] args) {
        game_window = new Snake();
        game_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game_window.setSize(500, 400);
        game_window.setLocation(750, 100);
        game_window.setResizable(false);
        game_window.setTitle("SNAKE");
        GameField game_field = new GameField();
        game_window.add(game_field);
        game_window.setVisible(true);
    }
    public static void drawSym(Graphics g) {
        g.drawString("#", 50, 50);
        g.drawRect(30, 30, 30, 30);
    }

//    Итак, как всё это работает. Класс GameField является наследником JPanel. То есть создание объекта класса GameField
//    равноценно созданию объекта класса JPanel. А в JPanel можно рисовать и размещать объекты ГУИ. Но как?! С ГУИями всё
//    понятно - создается объект нужного типа (кнопка, список, поле ввода итд) и описываются его свойства, а вот с
//    рисованием немного сложнее. Для рисования есть тип данных (или класс, что практически равноценно) - Graphics. Для
//    отображения созданных объектов есть метод - paintComponent. По доктринам ООП созданием объектов и их отображением
//    занимаются разные методы\классы.        

    public static class GameField extends JPanel {
        protected void paintComponent(Graphics g) {
//            super.paintComponent(g); не понимаю, зачем это нужно
            drawSym(g);
        }
    }
}
