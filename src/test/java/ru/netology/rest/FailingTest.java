package ru.netology.rest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FailingTest {
    @Test
    void testThatFails() {
        assertTrue(false, "Этот тест должен упасть!");
    }
}
