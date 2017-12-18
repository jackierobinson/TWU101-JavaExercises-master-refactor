package com.thoughtworks.tw101.exercises.exercise3;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddSumTests {
    @Test
    public void startGreaterThanEndReturnsZero() throws Exception {
        assertEquals(0,OddSum.of(30,20));
    }
    @Test
    public void sumFromZeroToFiveReturnsFour() throws Exception {
        assertEquals(4, OddSum.of(0,5));
    }
    @Test
    public void sumFrom0To100Returns2500() throws Exception {
        assertEquals(2500, OddSum.of(0,100));
    }
    @Test
    public void sumFromNegative100To0ReturnsNegative2500() throws Exception {
        assertEquals(-2500, OddSum.of(-100,0));
    }

}