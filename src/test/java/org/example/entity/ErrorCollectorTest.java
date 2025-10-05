package org.example.entity;

import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorCollectorTest {

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void fails_after_execution() {
        collector.checkThat("a", CoreMatchers.equalTo("b"));
        collector.checkThat(1, CoreMatchers.equalTo(2));
        collector.checkThat("ae", CoreMatchers.equalTo("g"));
    }

}
