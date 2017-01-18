package ru.geekbrains.mks;

import java.util.*;

/**
 * Created by moiseev on 17.01.2017.
 */
public class HorizontalLine {
    public static int xStart, yStart, hlLength;
    public static String sym;

    public HorizontalLine(int xStart, int yStart, int hlLength, String sym) {
        String a = new String();
        // берем символ и повторяем его hlLength раз в строке - получается строка заданной длины символов
        for (int x = xStart; x <= hlLength; x++) {
            a += sym;
        }
        this.sym = a;
        this.hlLength = hlLength;
        this.xStart = xStart;
        this.yStart = yStart;
    }
// Для проверок
//    public static void main(String[] args) {
//        HorizontalLine ln1 = new HorizontalLine(10, 20, 12, "+");
//        System.out.println(sym);
//    }
}
