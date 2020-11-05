package com.example.calculator_1;

public interface Stack<T> {
    boolean isEmpty();
    void push(T x);
    T peek();
    T pop();
}
