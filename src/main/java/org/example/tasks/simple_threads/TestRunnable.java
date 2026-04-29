package org.example.tasks.simple_threads;

public class TestRunnable implements Runnable { //для возможности наследования от другх классов
    private final int threadNum;

    public TestRunnable(int threadNum) {
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
