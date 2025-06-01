package com.theading.challange;

public class ThirdThread extends Thread{
    String name = "ThirdThread";

    public ThirdThread() {
        this.getState();

    }

    @Override
    public void run() {
        System.out.printf("I am %s and currently i am %s \n",this.name,getState());

    }
}
