package org.example.tasks;

public class MainSample {

    public static void main(String[] args) {

        //Работает параллельно
        TestThread thread1 = new TestThread(1);
        TestThread thread2 = new TestThread(2);
        thread1.start();
        thread2.start();

        //Работает последовательно
//        thread1.run(); - просто вызов метода без формирования потока
//        thread2.run();

    }

}
