package com.theading.challange.Challange2;

public class Challange2ext1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=100;i++){
            System.out.printf("%c ",'$');
        }
    }
}