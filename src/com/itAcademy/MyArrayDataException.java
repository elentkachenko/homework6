package com.itAcademy;

public class MyArrayDataException extends Exception {
    public int i;
    public int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }

//
//    public MyArrayDataException(String message) {
//        super("Ошибка");
//    }
//
//    public MyArrayDataException(String s, int i, ) {
//    }


}