package org.example.tasks.counter;

import java.util.ArrayList;
import java.util.List;

public class SampleMain {

    public static void main(String[] args) throws InterruptedException {

        List<Thread> threadList = new ArrayList<>();

        var counter = new SimpleCounter();

        for(int i = 0; i<5;i++) {
            SampleThread thread = new SampleThread(counter, i);
            thread.start();
            threadList.add(thread);
        }
        System.out.println("Цикл завершился");
        for(Thread thread: threadList) {
            thread.join();
        }

        System.out.println("Counter = " + counter.getCounter());

    }

}
