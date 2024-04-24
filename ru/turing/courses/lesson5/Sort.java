package ru.turing.courses.lesson5;

import java.util.Arrays;
import java.util.Objects;

/**
 * Класс содержащий функции сортировки пузырьком для массивов разных типов данных (int[], String[], MyClass[])
 */
public class Sort {
    /**
     * Функция сортировки пузырьком для массива int[], с проверкой подачи пустого массива в качестве параметра
     *
     * @param array
     * @throws NullPointerException
     */
    public static void bubbleSort(int[] array) throws NullPointerException {
        if (array == null) {
            throw new NullPointerException("нельзя отсортировать пустой массив");
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Функция сортировки пузырьком для массива String[] по длине слов, с проверкой подачи пустого массива в качестве параметра
     *
     * @param array
     * @throws NullPointerException
     */
    public static void bubbleSort(String[] array) throws NullPointerException {
        if (array == null) {
            throw new NullPointerException("нельзя отсортировать пустой массив");
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] == null) {
                    if (array[j + 1] != null) {
                        String temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                } else {
                    if (array[j + 1] != null) {
                        if (array[j].length() > array[j + 1].length()) {
                            String temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        }
                    }
                }
            }
        }
    }

    /**
     * Функция сортировки пузырьком для массива MyClass[] по всем параметрам с последовательной
     * проверкой нового поля в случае совпадения, с проверкой подачи пустого массива в качестве параметра
     *
     * @param array
     * @throws NullPointerException
     */
    public static void bubbleSort(MyClass[] array) throws NullPointerException {
        if (array == null) {
            throw new NullPointerException("нельзя отсортировать пустой массив");
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] == null) {
                    if (array[j + 1] != null) {
                        MyClass temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                } else {
                    if (array[j + 1] != null) {
                        if (array[j].getId() > array[j + 1].getId()) {
                            MyClass temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        } else {
                            if (Objects.equals(array[j].getId(), array[j + 1].getId())) {
                                if (array[j].getName().length() > array[j + 1].getName().length()) {
                                    MyClass temp = array[j];
                                    array[j] = array[j + 1];
                                    array[j + 1] = temp;
                                } else {
                                    if (array[j].getName().length() == array[j + 1].getName().length()) {
                                        if (array[j].getRating() > array[j + 1].getRating()) {
                                            MyClass temp = array[j];
                                            array[j] = array[j + 1];
                                            array[j + 1] = temp;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
