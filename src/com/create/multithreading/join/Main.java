package com.create.multithreading.join;

public class Main {
    public static void main(String[] args)throws InterruptedException {
        Task1 myTask1 = new Task1();
        Task2 myTask2 = new Task2();
        myTask2.start();
        myTask2.join();
        myTask1.start();
    }
}
