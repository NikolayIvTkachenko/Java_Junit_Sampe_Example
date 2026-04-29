package org.example.tasks.counter;

public class SampleThread extends Thread {

    private final SimpleCounter counter;

    private final int threadNum;

    public SampleThread(SimpleCounter counter, int threadNum) {
        this.counter = counter;
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        System.out.println("Thread started num = " + threadNum);
        for (int i = 0; i < 5; i++) {
            counter.increment();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread ended num = " + threadNum);
    }
}

//----------------------------------------------------------------------------------
//1) synchronized блок, монитор - object
//synchronized(object) { }
//
//2) synchronized метод, монитор - this
//void synchronized doFun(User user) { }
//
//3) static метод, монитор - User.class (монитором служит сам класс)
//public class User {
//  static synchronized void staticMethod() {
//
//  }
//}
//
//----------------------------------------------------------------------------------
//Volatile
//Ключевое слово vklatile гарантирует, что каждый раз при чтении этой переменной поток будет
// видеть самое последнее значение, записанное другим потоком
// private volatile int x;
// private volatile boolean flag;
// private volatile Object ob;
//