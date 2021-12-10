package com.example.graphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle circle;
    private double pi = Math.PI;

    @BeforeEach
    void setup() {
        circle = new Circle(1, 1, 1);
    }

    @Test
    void computeAreaTest() {
        assertEquals(pi, circle.computeArea());
    }

    @Test
    void computeCirumferenceTest() {
        assertEquals(2*pi, circle.computeCirumference());
    }
}