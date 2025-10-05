package org.example.entity;

import org.junit.Assume;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class Assumption {

    boolean isSonarRunning = false;

    @Test
    public void very_critical_test() throws Exception {
        isSonarRunning = true;

        Assume.assumeFalse(isSonarRunning);
        Assert.assertTrue(true);
    }

    @Test
    public void very_critical_test_v2() throws Exception {
        isSonarRunning = false;

        Assume.assumeFalse(isSonarRunning);
        Assert.assertTrue(true);
    }

}
