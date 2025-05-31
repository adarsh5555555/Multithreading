package com.theading.challange;

public class Challange1 extends Thread {
    public static void main(String[] args)throws InterruptedException {
        Challange1ext challange1  = new Challange1ext();
        System.out.println(challange1.getState());
        challange1.start();
        Thread.sleep(5000);
        System.out.println(challange1.getState());

        System.out.println(challange1.getState());


    }

}
