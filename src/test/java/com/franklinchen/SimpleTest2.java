package com.franklinchen;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleTest2 {
    @Test
    public void additionWorks() {
        assertEquals(4, 2+2);
    }

    @Test
    public void minusWorks() {
        assertEquals(5, 2+2);
    }

    @Test
    @Ignore
    public void multiplicationWorks() {
        assertEquals(5, 2+2);
    }
}
