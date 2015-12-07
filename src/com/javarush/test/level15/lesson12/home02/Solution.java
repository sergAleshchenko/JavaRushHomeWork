package com.javarush.test.level15.lesson12.home02;

/* Тренировка мозга
Найти логическую ошибку: метод doAction в реализации интерфейса Movable должен выдавать "moving".
Исправьте ошибку, при необходимости измените (отрефакторите) интерфейс Movable.
Результат вывода в консоль должен быть:
flying
moving
*/

public class Solution {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Util.fly(duck);
        Util.move(duck);
    }

    public static class Duck implements Flyable, Movable {

        public void doAction1() {
            System.out.println("flying");
        }
        public void doAction2() {
            System.out.println("moving");
        }

    }

    public static class Util {
        static void fly(Flyable animal) {
            animal.doAction1();
        }

        static void move(Movable animal) {
            animal.doAction2();
        }
    }

    public static interface Flyable {
        void doAction1();
    }

    public static interface Movable {
        void doAction2();
    }
}
