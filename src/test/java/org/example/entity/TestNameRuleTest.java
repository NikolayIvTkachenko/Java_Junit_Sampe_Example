package org.example.entity;

import org.junit.Rule;
import org.junit.Test;
import org.testng.Assert;

public class TestNameRuleTest {

    @Rule
    public TestName name = new TestName();


    @Test
    public void testA() {
        Assert.assertEquals("testA", name.getName());
    }

    @Test
    public void testB() {
        Assert.assertEquals("testB", name.getName());
    }

}
