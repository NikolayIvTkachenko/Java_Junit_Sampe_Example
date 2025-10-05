package org.example.entity;


import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AssertThatTest {

    @Test
    public void verify_matcher() throws Exception {
        int age = 30;
        Assert.assertThat(age, CoreMatchers.equalTo(30));
        Assert.assertThat(age, CoreMatchers.is(30));

        Assert.assertThat(age, CoreMatchers.not(CoreMatchers.equalTo(33)));
        Assert.assertThat(age, CoreMatchers.is(CoreMatchers.not(33)));
    }

    @Test
    public void verify_multiple_values() throws Exception {
        double marks = 100.00;

        Assert.assertThat(marks,
                CoreMatchers.either(CoreMatchers.is(100.00)).or(CoreMatchers.is(90.9)));

        Assert.assertThat(marks,
                CoreMatchers.both(CoreMatchers.not(99.99)).and(CoreMatchers.not(60.0)));

        Assert.assertThat(marks,
                CoreMatchers.anyOf(
                        CoreMatchers.is(100.00),
                        CoreMatchers.is(1.00),
                        CoreMatchers.is(55.00),
                        CoreMatchers.is(88.00),
                        CoreMatchers.is(67.8)
                ));

        Assert.assertThat(marks,
                CoreMatchers.not(CoreMatchers.anyOf(
                        CoreMatchers.is(0.00),
                        CoreMatchers.is(200.00),
                        CoreMatchers.is(50.00)
                )));

        Assert.assertThat(marks,
                CoreMatchers.not(CoreMatchers.allOf(
                        CoreMatchers.is(1.00),
                        CoreMatchers.is(100.00),
                        CoreMatchers.is(30.00)
                )));
    }

    @Test
    public void verify_collection_values() throws Exception {
        List<Double> salary = Arrays.asList(50.0, 200.0, 500.00);

        Assert.assertThat(salary, CoreMatchers.hasItem(50.0));
        Assert.assertThat(salary, CoreMatchers.hasItems(50.0, 200.0));
        Assert.assertThat(salary, CoreMatchers.not(CoreMatchers.hasItem(1.00)));
    }

    @Test
    public void verify_strings() throws Exception {
        String name = "John Jr Jonhs";
        Assert.assertThat(name, CoreMatchers.startsWith("John"));
        Assert.assertThat(name, CoreMatchers.endsWith("Jonhs"));
        Assert.assertThat(name, CoreMatchers.containsString("Jr"));
    }


}
