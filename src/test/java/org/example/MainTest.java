package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testAddition() {
        int resultat = 2 + 2;
        assertEquals(5, resultat); // Test correct au début
    }
}
