package com.create.multithreading.viaextendingthread;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Task1 myTask = new Task1();
        Task2 myTast2 = new Task2();
        Task3 mytask3 = new Task3();

       myTask.start();
        myTast2.start();
        mytask3.start();



    }
}