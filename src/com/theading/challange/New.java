package com.theading.challange;

public class New extends Thread{
    final int threadNo;
    public New(int threadNo){
        this.threadNo =threadNo;
    }

    public int getThreadNo() {
        return threadNo;
    }

    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.printf("hello from thread %d\n",getThreadNo());
        }
    }
}
