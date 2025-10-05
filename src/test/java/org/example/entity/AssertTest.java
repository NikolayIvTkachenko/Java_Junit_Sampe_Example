package org.example.entity;



import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class AssertTest {

    @Test
    public void assertTrueAndFalseTest() throws Exception {
        Assert.assertTrue(true);
        Assert.assertFalse(false);
    }

    @Test
    public void assertNullAndNotTest() throws Exception {
        Object testObject = null;
        Assert.assertNull(testObject);

        testObject = new String("Some value");
        Assert.assertNotNull(testObject);
    }


    //Тест выполнится, но ошибки внутри равны
    @Test
    public void assertErrorsEqualsTest() throws Exception {
        Integer i = new Integer("5");
        Integer j = new Integer("5");
        Assert.assertEquals(i, j);
    }

    @Test
    public void assertIntegerEqualsTest() throws Exception {
        Integer i = 5;
        Integer j = 5;
        Assert.assertEquals(i, j);
    }

    @Test
    public void assertNotSameTest() throws Exception {
        Integer i = new Integer("5");
        Integer j = new Integer("5");
        Assert.assertNotSame(i, j); //methods fails only when the expected object and the actual
        // object refers to the same memory location
    }

    @Test
    public void assertSameTest() throws Exception {
        Integer i = new Integer("5");
        Integer j = i;
        Assert.assertSame(i, j);
    }

    @Test
    @Ignore
    public void when_taday_is_holiday_then_stop_alarm() {

    }

}
