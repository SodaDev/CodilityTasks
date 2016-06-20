package com.four;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrogRiverOneTest {
    private FrogRiverOne frogRiverOne;

    @Before
    public void setUp() throws Exception {
        this.frogRiverOne = new FrogRiverOne();
    }

    @After
    public void tearDown() throws Exception {
        frogRiverOne = null;
    }

    @Test
    public void shouldReturnCorrectPathTime() throws Exception {
        // GIVEN leaf path
        int[] path = new int[]{1, 3, 1, 4, 2, 3, 5, 4};

        // WHEN path through river is checked
        int solution = frogRiverOne.solution(5, path);

        // THEN travel time should be equal to 6
        assertThat(solution).isEqualTo(6);
    }
}