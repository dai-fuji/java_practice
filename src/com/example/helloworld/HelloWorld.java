package com.example.helloworld;

import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) {
        //標準出力
        System.out.println("普通のHello World!");
        //if文
        Random rnd = new Random();
        int a = rnd.nextInt(2);
        System.out.println(a);
        if (a == 1) {
            System.out.println("TrueのHello World!");
        } else {
            System.out.println("FalseのHello World!");
        }
        //for文
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + "回目のHello World!");
        }
        //if文+for文
        for (int j = 0; j < 20; j++) {
            if (j < 10) {
                System.out.println("Hello World!");
            } else {
                System.out.println("Hello!");
            }
        }
    }

}
