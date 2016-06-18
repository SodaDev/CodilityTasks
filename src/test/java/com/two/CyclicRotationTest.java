package com.two;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CyclicRotationTest {
    private CyclicRotation cyclicRotation;

    @Before
    public void setUp() throws Exception {
        cyclicRotation = new CyclicRotation();
    }

    @After
    public void tearDown() throws Exception {
        cyclicRotation = null;
    }

    @Test
    public void shouldDidNothingToSingleElementArray() throws Exception {
        // GIVEN array to rotate
        int[] ints = new int[]{5};

        // WHEN array is rotated
        int[] solution = cyclicRotation.solution(ints, 10);

        // THEN array should be the same
        assertThat(solution).isEqualTo(new int[]{5});
    }

    @Test
    public void shouldRotateSimpleArray() throws Exception {
        // GIVEN array to rotate
        int[] ints = new int[]{3, 8, 9, 7, 6};
        int rotations = 3;

        // WHEN array is rotated
        int[] solution = cyclicRotation.solution(ints, rotations);

        // THEN array should be rotated by three fields
        assertThat(solution).isEqualTo(new int[]{9, 7, 6, 3, 8});
    }

    @Test
    public void shouldCorrectlyRotateArray() throws Exception {
        // GIVEN array to rotate
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int rotations = 7;

        // WHEN array is rotated
        int[] solution = cyclicRotation.solution(ints, rotations);

        // THEN array should be rotated by three fields
        assertThat(solution).isEqualTo(new int[]{ 3, 4, 5, 6, 7, 8, 9, 1, 2 });
    }

    @Test
    public void shouldRotateArrayByTheNumberOfItsMembers() throws Exception {
        // GIVEN array to rotate
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int rotations = ints.length;

        // WHEN array is rotated
        int[] solution = cyclicRotation.solution(ints, rotations);

        // THEN array should be rotated by three fields
        assertThat(solution).isEqualTo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }
}