package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(12d, "a");
        labels.put(13d, "b");
        labels.put(14d, "c");
        labels.put(15d, "d");
        labels.put(16d, "e");
    }
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
