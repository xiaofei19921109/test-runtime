package com.example.demo.test;

import java.util.Arrays;

public class T3 {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);
        System.out.println(Arrays.toString(args));
        Runtime runtime = Runtime.getRuntime();
        System.out.println("T3:" + runtime + "," + runtime.maxMemory());
    }
}
