package com.helloworld.src.test.java.com.helloworld;

import org.junit.Assert;
import org.junit.Test;
import com.helloworld.Calculator; // added comments

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator test = new Calculator();
        Assert.assertEquals("The output should be 15", 15, test.addition(5,10));
    }

    @Test
    public void testSubtraction() {
        Calculator test = new Calculator();
        Assert.assertEquals("The output should be 3", 3, test.subtraction(5,2));
    }

    @Test
    public void testMultiplication() {
        Calculator test = new Calculator();
        Assert.assertEquals("The output should be 6", 6, test.multiplication(2,3));
    }

    @Test
    public void testDivision() {
        Calculator test = new Calculator();
        Assert.assertEquals("The output should be 2", 2, test.division(8,4));
    }
}
