package com.create.multithreading.viaimplrmentingrunnable;

public class Task1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.printf("%d%c ", i, '*');
        }
    }
}