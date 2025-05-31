package com.create.multithreading.join;

public class Task2 extends Thread{
    public void run(){
     for (int i = 0; i <= 100; i++) {
        System.out.printf("%d%c ",i,'%');
    }
}

}

