package com.itAcademy;

public class Main {

//    private static Object Integer;

    public static void main(String[] args) {

        Object[][] arr = new Object[][]{
                {"cat", 3, "5", 4},
                {3, "2", 2, 1},
                {3, 4, "1", 1},
                {2, 4, 1, "dog"}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    try {
                        someMethod(arr);
                    } catch (MyArraySizeException e) {
                        System.out.println("Недопустимый размер массива! Размермассива должен быть равен четырём!");
                    }
                } catch (MyArrayDataException e) {
                    System.out.println("Недопустимое значение в ячейке массива. Ошибка в ячейке: " + e.i + "*" + e.j);
                    System.out.println("Для дальшейших расчетов мы заменим значение в ячейке на 1.");
                    arr[e.i][e.j] = 1;
                }
            }

        }

    }

    public static void someMethod(Object[][] arr) throws MyArrayDataException, MyArraySizeException {

        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    int value = (Integer) arr[i][j];
                } catch (ClassCastException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
    }


    }



