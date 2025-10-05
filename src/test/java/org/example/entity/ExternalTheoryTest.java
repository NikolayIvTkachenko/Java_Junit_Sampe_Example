package org.example.entity;

import org.example.Adder;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.testng.Assert;

@RunWith(Theories.class)
public class ExternalTheoryTest {

    @Theory
    public void adds_number(
        @ParametersSuppliedBy(NumberSupplier.class) Number num1,
        @ParametersSuppliedBy(NumberSupplier.class) Number num2
    ) {
        System.out.println(num1 + " and " + num2);
    }

    @Theory
    public void adds_number_v2(
            @ParametersSuppliedBy(NumberSupplier.class) Number num1,
            @ParametersSuppliedBy(NumberSupplier.class) Number num2
    ) {
        Adder anAdder = new Adder();
        double expectedSum = num1.doubleValue() + num2.doubleValue();
        double actualResult = (Double) anAdder.add(num1, num2);
        Assert.assertEquals(actualResult, expectedSum, 0.01);
    }
}
