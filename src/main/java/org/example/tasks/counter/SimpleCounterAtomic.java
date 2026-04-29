package org.example.tasks.counter;

import java.util.concurrent.atomic.AtomicInteger;

public class SimpleCounterAtomic {
    private final AtomicInteger counter;
    private final Object object = new Object();

    public SimpleCounterAtomic() {
        this.counter = new AtomicInteger();
    }

    public void increment() {
        synchronized (object) {
            counter.incrementAndGet();
        }
    }

    public int getCounter() {
        return counter.get();
    }
}
