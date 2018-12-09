package com.example.mvp_verification.view;

public interface Iview<E> {
    void success(E e);
    void error(String str);
}
