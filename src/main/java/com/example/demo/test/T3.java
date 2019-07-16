package com.example.demo.test;

public class T3 {

    static class Test {
        private String name = "xiaofei";
        public static void test() {
            System.out.println("hello world");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);

        Test t = new Test();

        t.test();

        Runtime runtime = Runtime.getRuntime();

        System.out.println("T3:" + runtime + "," + runtime.maxMemory());
    }


}
