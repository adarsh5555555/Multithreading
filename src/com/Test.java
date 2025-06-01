package com;

import com.create.multithreading.BankAccount;

public class Test extends Thread{
    int curr;
    public Test(BankAccount account){
       this.curr = account.getCurrentbalance();
    }

    @Override
    public void run() {
        for(int i=0;i<=100;i++){
            System.out.printf("%d ",curr);
            curr++;

        }
    }
}
