package com.theading.challange.Challange2;

import com.theading.challange.FirstThread;
import com.theading.challange.SecondThread;
import com.theading.challange.ThirdThread;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException{
        FirstThread myThread = new FirstThread();
        SecondThread myThread2 = new SecondThread();
        ThirdThread myThread3 = new ThirdThread();
        myThread.start();
        myThread2.start();
        myThread3.start();
        Thread.sleep(4000);
        System.out.println(myThread.getState());
        System.out.println(myThread2.getState());
        System.out.println(myThread3.getState());




    }
}
