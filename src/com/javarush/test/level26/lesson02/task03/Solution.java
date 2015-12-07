package com.javarush.test.level26.lesson02.task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* Убежденному убеждать других не трудно.
В таблице есть колонки, по которым можно сортировать.
Пользователь имеет возможность настроить под себя список колонок, которые будут сортироваться.
Напишите public static компаратор CustomizedComparator, который будет:
1. в конструкторе принимать список компараторов
2. сортировать данные в порядке, соответствующем последовательности компараторов.
Все переданные компараторы сортируют дженерик тип Т
В конструктор передается как минимум один компаратор
*/
public class Solution {
    public static class CustomizedComparator<T> implements Comparator<T> {
        ArrayList<Comparator<T>> comparators ;
        public CustomizedComparator(Comparator<T>... comparators) {
            this.comparators = new ArrayList<>(comparators.length);
            Collections.addAll(this.comparators, comparators);
        }

        @Override
        public int compare(T t, T t1) {
            for (int i = 0; i < comparators.size();) {
                if (comparators.get(i).compare(t, t1) != 0) {
                    return comparators.get(i).compare(t, t1);
                } else {
                    i++;
                }
            }
            return 0;
        }
    }
}
