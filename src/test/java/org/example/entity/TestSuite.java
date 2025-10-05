package org.example.entity;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;


//Групполвой запуск но не работает, нужно совместимость версий библиотек
@RunWith(Suite.class)
@Suite.SuiteClasses({AssertTest.class, TestExecutionOrder.class, Assumption.class})
public class TestSuite {
//    AssertTest assertTest = new AssertTest();
//
//    TestExecutionOrder testExecutionOrder = new TestExecutionOrder();
//
//    Assumption assumption = new Assumption();
}
