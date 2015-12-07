package com.javarush.test.level27.lesson15.big01.kitchen;

/**
 * Created by sergey on 05.10.15.
 */
public enum Dish {
    Fish(25),
    Steak(30),
    Soup(15),
    Juice(5),
    Water(3);

    private int duration;

    Dish (int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public static String allDishesToString()
    {
        String availableDishes = "";
        for (Dish s : Dish.values()){
            availableDishes += s + ", ";
        }
        availableDishes = availableDishes.substring(0, availableDishes.length() - 2);
        return availableDishes;
    }
}
