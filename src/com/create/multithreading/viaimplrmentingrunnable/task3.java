package com.create.multithreading.viaimplrmentingrunnable;

public class task3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.printf("%d%c ", i, '$');

        }
    }
}