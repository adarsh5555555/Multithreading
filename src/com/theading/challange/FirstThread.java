package com.theading.challange;

import com.Testing;

public class FirstThread extends Thread {
    String name = "Firstaatahread";



    @Override
    public void run() {
        System.out.printf("I am %s and currently i am %s\n ",this.name,getState());
    }
}
