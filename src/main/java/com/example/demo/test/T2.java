package com.example.demo.test;

import java.util.Arrays;

public class T2 {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);
        System.out.println(Arrays.toString(args));
        Runtime runtime = Runtime.getRuntime();
        System.out.println("T2:" + runtime + "," + runtime.maxMemory());
    }
}
