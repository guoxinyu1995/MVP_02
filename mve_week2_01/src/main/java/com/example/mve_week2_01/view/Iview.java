package com.example.mve_week2_01.view;

public interface Iview<E> {
    void success(E e);
    void error(String str);
}
