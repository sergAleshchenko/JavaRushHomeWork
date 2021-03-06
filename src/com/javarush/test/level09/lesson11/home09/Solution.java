package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //Напишите тут ваш код
        Map<String, Cat> catMap = new HashMap<String, Cat>();
        catMap.put("Name1", new Cat("Cat1"));
        catMap.put("Name2", new Cat("Cat2"));
        catMap.put("Name3", new Cat("Cat3"));
        catMap.put("Name4", new Cat("Cat4"));
        catMap.put("Name5", new Cat("Cat5"));
        catMap.put("Name6", new Cat("Cat6"));
        catMap.put("Name7", new Cat("Cat7"));
        catMap.put("Name8", new Cat("Cat8"));
        catMap.put("Name9", new Cat("Cat9"));
        catMap.put("Name10", new Cat("Cat10"));

        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //Напишите тут ваш код
        Set<Cat> set = new HashSet<Cat>();

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            String key = pair.getKey();
            Cat value = pair.getValue();
            set.add(value);
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
