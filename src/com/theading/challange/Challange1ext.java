package com.theading.challange;

public class Challange1ext extends Thread{
    @Override
    public void run() {
for(int i=0;i<=100;i++){
    System.out.printf("%d ",i);
}
    }
}
