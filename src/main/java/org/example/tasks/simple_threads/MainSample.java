package org.example.tasks.simple_threads;

public class MainSample {

    public static void main(String[] args) throws InterruptedException {

        //Работает параллельно
//        TestThread thread1 = new TestThread(1);
//        TestThread thread2 = new TestThread(2);
//        thread1.start();
//        thread2.start();

        //Работает последовательно
//        thread1.run(); - просто вызов метода без формирования потока
//        thread2.run();

//        for (int i = 1; i < 5; i++) {
//            TestThread thread3 = new TestThread(i);
//            thread3.start();
//        }

        for (int i = 1; i < 5; i++) {
            var runnable = new TestRunnable(i);
            var thread = new Thread(runnable);
            thread.start();
            System.out.println(i + " alive " + thread.isAlive());
            thread.join(); //ожидает пока поток закончит работу //потоки будут работать друг за другом
            System.out.println(i + " after join alive " + thread.isAlive());
        }

        var thread4 = new Thread(() -> {
            System.out.println("Hello from thread ");
        });
        thread4.start();

    }

}
