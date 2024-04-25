package ru.turing.courses.lesson5;

import java.util.Arrays;

/**
 * Класс для запуска тестовых примеров сортировки пузырьком с разными параметрами
 */
public class Main {
    public static void main(String[] args) {
        try {
            int[] testInt = new int[10];
            for (int i = 0; i < testInt.length; i++) {
                testInt[i] = ((int) (Math.random() * 100));
            }
            System.out.println("Вывод примера для int[]: " + Arrays.toString(testInt));
            Sort.bubbleSort(testInt);
            System.out.println("Отсортированный int[]: " + Arrays.toString(testInt) + "\n");

            String[] testString = new String[]{"Всем", "привет", "это", "тестовый", "пример"};
            System.out.println("Вывод примера для String[]: " + Arrays.toString(testString));
            Sort.bubbleSort(testString);
            System.out.println("Отсортированный String[]: " + Arrays.toString(testString) + "\n");

            Human[] testHuman = new Human[4];
            testHuman[0] = new Human(3L, "Nick", 5);
            testHuman[1] = new Human(2L, "Ann", 33);
            testHuman[2] = new Human(1L, "Den", 2);
            testHuman[3] = new Human(2L, "Bob", 9);
            System.out.println("Вывод примера для Human[]: " + Arrays.toString(testHuman));
            Sort.bubbleSort(testHuman);
            System.out.println("Отсортированный Human[]: " + Arrays.toString(testHuman) + "\n");

            String[] testString2 = new String[]{"Всем", null, "это", "тестовый", null};
            System.out.println("Вывод примера для String[] с null элементами: " + Arrays.toString(testString2));
            Sort.bubbleSort(testString2);
            System.out.println("Отсортированный String[] с null: " + Arrays.toString(testString2) + "\n");

            testString = null;
            System.out.println("Пример когда массив null: " + Arrays.toString(testString));
            Sort.bubbleSort(testString);
            System.out.println("Отсортированный String[] с null: " + Arrays.toString(testString) + "\n");
        } catch (NullPointerException e) {
            System.out.println("Ошибка пустого массива: " + e.getMessage());
        }
    }
}
