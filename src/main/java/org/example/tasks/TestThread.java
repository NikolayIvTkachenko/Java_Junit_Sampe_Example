package org.example.tasks;

public class TestThread extends Thread {

    private final int threadNum;

    public TestThread(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(i + " from thread N " + threadNum);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
