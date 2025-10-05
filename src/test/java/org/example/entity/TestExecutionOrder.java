package org.example.entity;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


public class TestExecutionOrder {
    @Test
    public void edit() throws Exception {
        System.out.println("edit executed");
    }

    @Test
    public void create() throws Exception {
        System.out.println("create executed");
    }

    @Test
    public void remove() throws Exception {
        System.out.println("remove executed");
    }
}
