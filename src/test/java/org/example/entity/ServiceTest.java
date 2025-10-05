package org.example.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Test
    void getNameNegativeTest() {
        Service service = new Service();
        String result = service.getName(-1);

        Assertions.assertEquals("a", result);
    }

    @Test
    void getNamePositiveTest() {
        Service service = new Service();
        String result = service.getName(1);

        Assertions.assertEquals("b", result);
    }

    @Test
    void getNameZeroTest() {
        Service service = new Service();
        String result = service.getName(0);

        Assertions.assertEquals("b", result);
    }

}