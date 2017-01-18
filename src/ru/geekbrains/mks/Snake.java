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
    // Хотел адаптировать консольную игру Snake, которую писал преподаватель в процессе обучения ООП на GeekBrains.
    // Правда, писал он ее на C#. В нем можно указать координаты для вывода символа. Причем координаты измеряются
    // в строках и символах, в Джаве же я такого не нашел - тут координаты в пикселях. Поэтому при выводе двух и более
    // символов с шагом координат в единицу C# выводит их как соседние символы в одной строке (если меняется координата
    // Х) или в разных строках, но на одной позиции (если меняется координата Y); а Джава из-за пиксельной системы
    //координат накладывает символы друг на друга, так как символ имеет ширину и высоту в несколько пикселей.
    public static void drawSym(Graphics g) {
        Point p1 = new Point(140, 120, "++++");
        Point p2 = new Point(140, 122, "+");
        char[] oneCharBuffer = {'#', '#'};
        char[] oneCharBuffer2 = {'#'};
        g.drawString(p1.sym, p1.x, p1.y);
        g.drawString(p2.sym, p2.x, p2.y);
        g.drawChars(oneCharBuffer, 0, 2, 100, 90);
        HorizontalLine hl1 = new HorizontalLine(10, 50, 30, "+");
        g.drawString(hl1.sym, hl1.xStart, hl1.yStart);
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
