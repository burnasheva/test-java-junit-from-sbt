package com.franklinchen;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class SimpleTest {
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
