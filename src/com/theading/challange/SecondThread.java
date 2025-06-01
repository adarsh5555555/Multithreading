package com.theading.challange;

public class SecondThread extends Thread{
    String name = "SecondThread";

    @Override
    public void run() {
        System.out.printf("I am %s and currently i am %s \n",this.name,getState());

    }
}
