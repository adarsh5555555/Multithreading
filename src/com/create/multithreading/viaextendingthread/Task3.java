package com.create.multithreading.viaextendingthread;

public class Task3 extends Thread{
    public  void run(){
        for (int i = 0; i <= 100; i++) {
            System.out.printf("%d%c ",i,'$');
        }
    }
}
