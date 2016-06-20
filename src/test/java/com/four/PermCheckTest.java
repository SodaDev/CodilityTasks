package com.four;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class PermCheckTest {
    private PermCheck permCheck;

    @Before
    public void setUp() throws Exception {
        this.permCheck = new PermCheck();
    }

    @After
    public void tearDown() throws Exception {
        this.permCheck = null;
    }

    @Test
    public void shouldRecognizePermutation() throws Exception {
        // GIVEN permutation array
        int[] permutation = IntStream.range(1, 199).toArray();

        // WHEN checked if array is permutation
        int solution = permCheck.solution(permutation);

        // THEN permutation should be found
        assertThat(solution).isEqualTo(1);
    }

    @Test
    public void shouldNotRecognizePermutation() throws Exception {
        // GIVEN array without permutation
        int[] permutation = new int[]{4, 1, 3};

        // WHEN checked if array is permutation
        int solution = permCheck.solution(permutation);

        // THEN permutation should not be found
        assertThat(solution).isEqualTo(0);
    }

    @Test
    public void shouldNotRecognizeMissingElementPermutation() throws Exception {
        // GIVEN array without permutation
        int[] permutation = new int[]{1, 3};

        // WHEN checked if array is permutation
        int solution = permCheck.solution(permutation);

        // THEN permutation should not be found
        assertThat(solution).isEqualTo(0);
    }

    @Test
    public void shouldRecognizeCorrectlyPermutation() throws Exception {
        // GIVEN array without permutation
        int[] permutation = new int[]{1, 2};

        // WHEN checked if array is permutation
        int solution = permCheck.solution(permutation);

        // THEN permutation should not be found
        assertThat(solution).isEqualTo(1);
    }

    @Test
    public void shouldRecognizeCorrectlyPermutationWithDuplicates() throws Exception {
        // GIVEN array without permutation
        int[] permutation = new int[]{1, 1};

        // WHEN checked if array is permutation
        int solution = permCheck.solution(permutation);

        // THEN permutation should not be found
        assertThat(solution).isEqualTo(0);
    }
}