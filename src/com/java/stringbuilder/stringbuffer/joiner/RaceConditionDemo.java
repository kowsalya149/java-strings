package com.java.stringbuilder.stringbuffer.joiner;

public class RaceConditionDemo implements Runnable {
    static int counter;
 
    static {
        counter = 0;
    }
 
    @Override
    public void run() {
 
        for (int i = 0; i < 20000; i++) {
            increment();
            decrement();
        }
    }
 
    public void increment() {
        counter++;
    }
 
    public void decrement() {
        counter--;
    }
 
    public static void main(String[] args) {
 
        RaceConditionDemo rcCondDmObj1 = new RaceConditionDemo();
        Thread threadOne = new Thread(rcCondDmObj1, "Thread One");
        Thread threadTwo = new Thread(rcCondDmObj1, "Thread Two");
        threadOne.start();
        threadTwo.start();
 
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Finally counter: " + counter);
    }
 
}
