package org.example.tasks.counter;

public class SimpleCounter {

    private int counter;
    private final Object object = new Object();

    public SimpleCounter() {
        this.counter = 0;
    }

    public void increment() {
        synchronized (object) {
            counter++;
        }
    }

    public int getCounter() {
        return counter;
    }

}
