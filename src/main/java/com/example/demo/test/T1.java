package com.example.demo.test;

public class T1 {

    static class Person {

        private String name;

        Person(String name) {
            this.name = name;
        }

    }

    public static void main(String[] args) {
        Person p = new Person("Chris");
        Runtime runtime = Runtime.getRuntime();
        System.out.println("T1:" + runtime);
    }
}
