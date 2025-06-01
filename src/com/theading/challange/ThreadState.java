package com.theading.challange;

public class ThreadState extends Thread {
    @Override
    public void run() {
        try {
            ThreadState.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.getState());
        
    } 
}
