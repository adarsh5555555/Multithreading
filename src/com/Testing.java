package com;

import com.create.multithreading.BankAccount;

public class Testing {
    public static void main(String[] args) {
        BankAccount mybank = new BankAccount();
        Test myTest1 = new Test(mybank);
        Test myTest2 = new Test(mybank);
        myTest1.start();
        myTest2.start();
    }
}
