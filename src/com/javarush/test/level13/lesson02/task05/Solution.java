package com.javarush.test.level13.lesson02.task05;

/* 4 ошибки
Исправь 4 ошибки в программе, чтобы она компилировалась.
*/

public class Solution
{

    private static Hobbie HOBBIE = new Hobbie();
    public static void main(String[] args) throws Exception
    {

        System.out.println(HOBBIE.toString());
        System.out.println(new Hobbie().toString());

    }

        interface Desire
        {
        }

        interface Dream
        {

        }

        static class Hobbie implements Dream, Desire
        {
            static int INDEX = 1;

            @Override
            public String toString()
            {
                INDEX++;
                return "" + INDEX;
            }
        }

}
