package com.theading.challange;

import com.theading.challange.Challange2.Challange2ext1;
import com.theading.challange.Challange2.Challange2ext2;
import com.theading.challange.Challange2.Challange2ext3;

public class Challange2main {
    public static void main(String[] args) throws InterruptedException{
        Challange2ext1 newChallange1 = new Challange2ext1();
        Challange2ext2 newChallange2 = new Challange2ext2();
        Challange2ext3 newChallange3 = new Challange2ext3();
        newChallange1.start();
  //      newChallange1.join();
        newChallange2.start();
  //      newChallange2.join();
        newChallange3.start();

    }
}
