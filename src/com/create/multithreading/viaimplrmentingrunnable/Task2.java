package com.create.multithreading.viaimplrmentingrunnable;

public class Task2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.printf("%d%c ", i, '%');
        }
    }
}