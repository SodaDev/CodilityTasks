package com.three;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TapeEquilibriumTest {
    private TapeEquilibrium tapeEquilibrium;

    @Before
    public void setUp() throws Exception {
        this.tapeEquilibrium = new TapeEquilibrium();
    }

    @After
    public void tearDown() throws Exception {
        tapeEquilibrium = null;
    }

    @Test
    public void shouldCorrectlyReturnMinimalDivisorForTwoElementsArray() throws Exception {
        // GIVEN two elements array
        int[] elements = new int[]{3, 8};

        // WHEN minimal difference is looked for
        int minimalDiff = tapeEquilibrium.solution(elements);

        // THEN results should be correct
        assertThat(minimalDiff).isEqualTo(5);
    }

    @Test
    public void shouldCorrectlyReturnMinimalDivisorForSimpleArray() throws Exception {
        // GIVEN example array
        int[] elements = new int[]{3, 1, 2, 4, 3};

        // WHEN minimal difference is looked for
        int minimalDiff = tapeEquilibrium.solution(elements);

        // THEN results should be correct
        assertThat(minimalDiff).isEqualTo(1);
    }

    @Test
    public void shouldCorrectlyReturnMinimalDivisorForArrayWithNegativeElements() throws Exception {
        // GIVEN example array
        int[] elements = new int[]{2, 4, 7, -4, 12};

        // WHEN minimal difference is looked for
        int minimalDiff = tapeEquilibrium.solution(elements);

        // THEN results should be correct
        assertThat(minimalDiff).isEqualTo(3);
    }
}