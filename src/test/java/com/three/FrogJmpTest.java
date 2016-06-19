package com.three;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrogJmpTest {
    private FrogJmp frogJmp;

    @Before
    public void setUp() throws Exception {
        frogJmp = new FrogJmp();
    }

    @After
    public void tearDown() throws Exception {
        frogJmp = null;
    }

    @Test
    public void shouldReturnedRoundedJumpValue() throws Exception {
        // GIVEN start point
        int start = 10;
        // AND end point
        int end = 85;
        // AND jump length
        int jumpLength = 30;

        // WHEN number of jumps is calculated
        int jumps = frogJmp.solution(start, end, jumpLength);

        // THEN jump should be correctly rounded
        assertThat(jumps).isEqualTo(3);
    }

    @Test
    public void shouldReturnedEqualJumpsValue() throws Exception {
        // GIVEN start point
        int start = 10;
        // AND end point
        int end = 90;
        // AND jump length
        int jumpLength = 10;

        // WHEN number of jumps is calculated
        int jumps = frogJmp.solution(start, end, jumpLength);

        // THEN jump should be correct
        assertThat(jumps).isEqualTo(8);
    }
}