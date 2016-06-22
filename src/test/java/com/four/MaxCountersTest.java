package com.four;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxCountersTest {
    private MaxCounters maxCounters;

    @Before
    public void setUp() throws Exception {
        this.maxCounters = new MaxCounters();
    }

    @After
    public void tearDown() throws Exception {
        this.maxCounters = null;
    }

    @Test
    public void shouldCorrectlyCountValuesFromCodilityExample() throws Exception {
        // GIVEN control array
        int[] params = new int[]{3, 4, 4, 6, 1, 4, 4};
        // AND counters value
        int counters = 5;

        // WHEN counters are calculated
        int[] solution = maxCounters.solution(counters, params);

        // THEN counter values should be correct
        assertThat(solution).isEqualTo(new int[]{ 3, 2, 2, 4, 2 });
    }



    @Test
    public void shouldCorrectlyCountValuesWithoutSync() throws Exception {
        // GIVEN control array
        int[] params = new int[]{3, 4, 4, 1, 4, 4};
        // AND counters value
        int counters = 5;

        // WHEN counters are calculated
        int[] solution = maxCounters.solution(counters, params);

        // THEN counter values should be correct
        assertThat(solution).isEqualTo(new int[]{ 1, 0, 1, 4, 0 });
    }

}