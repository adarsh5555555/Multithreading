package com.create.multithreading.viaimplrmentingrunnable;



public class Main {
    public static void main(String[] args) {
        Task1 myTask1 = new Task1();
        Task2 myTask2 = new Task2();
        task3 myTask3 = new task3();
        Thread t1 = new Thread(myTask1);
        Thread t2= new Thread(myTask2);
        Thread t3 = new Thread(myTask3);
        t1.start();
        t2.start();
        t3.start();

    }
}
