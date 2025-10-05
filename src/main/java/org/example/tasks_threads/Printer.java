package org.example.tasks_threads;

public class Printer {

    private volatile int i = 0;

    public Printer() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        i++;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        do {
            if(i==1){
                printSecond.run();
                i++;
                break;
            }
            Thread.sleep(100);
        } while (true);
    }

    public void third(Runnable printThird) throws InterruptedException {
        do {
            if(i==2){
                printThird.run();
                i = 0;
            }
            Thread.sleep(100);
        } while (true);
    }


}
