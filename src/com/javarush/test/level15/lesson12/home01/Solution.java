package com.javarush.test.level15.lesson12.home01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Object obj = null;

        while(true) {
            obj = reader.readLine();

            try {
                String s = obj.toString();
                if (s.equals("exit")) {
                    break;
                }
                if (s.contains(".")) {
                    double d = Double.parseDouble(s);
                    print(d);
                } else if ((Integer.parseInt(s) > 0) & (Integer.parseInt(s) < 128)) {
                    short sh = Short.parseShort(s);
                    print(sh);
                } else if (Integer.parseInt(s) >= 128) {
                    int i = Integer.parseInt(s);
                    print(i);
                }
            } catch (NumberFormatException e) {
                print(obj.toString());
            }

        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
