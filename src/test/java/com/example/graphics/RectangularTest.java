package com.example.graphics;

import javafx.scene.shape.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangularTest {

    private Rectangular rectangular;

    @BeforeEach
    void setUp() {
        rectangular = new Rectangular(1,1,1,2);
    }

    @Test
    void computeAreaTest() {
        assertEquals(2,rectangular.computeArea());
    }

    @Test
    void computeCirumferenceTest() {
        assertEquals(6, rectangular.computeCirumference());
    }
}