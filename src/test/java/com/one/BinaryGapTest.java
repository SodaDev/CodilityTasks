package com.one;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BinaryGapTest {
    private BinaryGap binaryGapSolver;

    @Before
    public void setUp() throws Exception {
        this.binaryGapSolver = new BinaryGap();
    }

    @After
    public void tearDown() throws Exception {
        this.binaryGapSolver = null;
    }

    @Test
    public void shouldReturn0ForSingle1Sign() throws Exception {
        // GIVEN value count gaps
        int value = 1;

        // WHEN 1 is counted
        int zeros = binaryGapSolver.solution(value);

        // THEN result should be 0
        assertThat(zeros).isEqualTo(0);
    }

    @Test
    public void shouldReturn0ForSingle0Sign() throws Exception {
        // GIVEN value count gaps
        int value = 0;

        // WHEN 0 is counted
        int zeros = binaryGapSolver.solution(value);

        // THEN result should be 0
        assertThat(zeros).isEqualTo(0);
    }

    @Test
    public void shouldReturn2ForValueWithTwoZerosWithEndOne() throws Exception {
        // GIVEN value count gaps
        int value = 4;

        // WHEN 0 is counted
        int zeros = binaryGapSolver.solution(value);

        // THEN result should be 2 for 100
        assertThat(zeros).isEqualTo(0);
    }

    @Test
    public void shouldReturn5ForValueWithFiveZeros() throws Exception {
        // GIVEN value count gaps
        int value = 1041;

        // WHEN 0 is counted
        int zeros = binaryGapSolver.solution(value);

        // THEN result should be 2 for 10000010001
        assertThat(zeros).isEqualTo(5);
    }

    @Test
    public void shouldReturnCorrectValueFor529() throws Exception {
        // GIVEN value count gaps
        int value = 529;

        // WHEN 0 is counted
        int zeros = binaryGapSolver.solution(value);

        // THEN result should be 2 for 10000010001
        assertThat(zeros).isEqualTo(4);
    }

    @Test
    public void shouldReturnCorrectValueFor20() throws Exception {
        // GIVEN value count gaps
        int value = 20;

        // WHEN 0 is counted
        int zeros = binaryGapSolver.solution(value);

        // THEN result should be 2 for 10000010001
        assertThat(zeros).isEqualTo(1);
    }

    @Test
    public void shouldReturnCorrectValueFor9() throws Exception {
        // GIVEN value count gaps
        int value = 9;

        // WHEN 0 is counted
        int zeros = binaryGapSolver.solution(value);

        // THEN result should be 2 for 10000010001
        assertThat(zeros).isEqualTo(2);
    }
}
