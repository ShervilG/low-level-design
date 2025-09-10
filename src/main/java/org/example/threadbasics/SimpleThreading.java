package org.example.threadbasics;

public class SimpleThreading {

    public static void main(String[] args) {
        System.out.println("In Thread: " + Thread.currentThread().getName());

        Thread thread = new Thread(() -> {
            System.out.println("Printed via thread: " + Thread.currentThread().getName());
        });
        thread.start();
    }
}
