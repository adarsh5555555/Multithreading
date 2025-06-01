package com.create.multithreading;

public class BankAccount {
   private int currentbalance;
   public BankAccount(){
       currentbalance = 0;
   }

    public void setCurrentbalance(int currentbalance) {
        this.currentbalance = currentbalance;
    }

    public int getCurrentbalance() {
        return currentbalance;
    }

}
