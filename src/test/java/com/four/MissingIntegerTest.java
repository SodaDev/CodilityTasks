package com.four;

import org.assertj.core.api.Java6Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MissingIntegerTest {
    private MissingInteger missingInteger;

    @Before
    public void setUp() throws Exception {
        this.missingInteger = new MissingInteger();
    }

    @After
    public void tearDown() throws Exception {
        this.missingInteger = null;
    }

    @Test
    public void shouldReturnMissingValueForSimpleArray() throws Exception {
        // GIVEN any values array
        int[] values = new int[]{1, 3, 6, 4, 1, 2};

        // WHEN missing integer is looked for
        int missingValue = missingInteger.solution(values);

        // THEN it should be found correctly
        assertThat(missingValue).isEqualTo(5);
    }

    @Test
    public void shouldCorrectlyReturnMissingElementForTwoElementsArray() throws Exception {
        // GIVEN values array
        int[] values = new int[]{1, 3};

        // WHEN missing element is looked for
        int solution = missingInteger.solution(values);

        // THEN 2 should be found
        Java6Assertions.assertThat(solution).isEqualTo(2);
    }

    @Test
    public void shouldCorrectlyReturnMissingElementForCodilityExample() throws Exception {
        // GIVEN values array
        int[] values = new int[]{2, 3, 1, 5};

        // WHEN missing element is looked for
        int solution = missingInteger.solution(values);

        // THEN 4 should be found
        Java6Assertions.assertThat(solution).isEqualTo(4);
    }

    @Test
    public void shouldCorrectlyReturnMissingLastElement() throws Exception {
        // GIVEN values array
        int[] values = new int[]{2, 3, 1, 5, 4};

        // WHEN missing element is looked for
        int solution = missingInteger.solution(values);

        // THEN 6 should be found
        Java6Assertions.assertThat(solution).isEqualTo(6);
    }

    @Test
    public void shouldCorrectlyReturnMissingLastElementForEmptyArray() throws Exception {
        // GIVEN values array
        int[] values = new int[]{};

        // WHEN missing element is looked for
        int solution = missingInteger.solution(values);

        // THEN 1 should be found
        Java6Assertions.assertThat(solution).isEqualTo(1);
    }

    @Test
    public void shouldCorrectlyReturnMissingLastElementForSingleElementArray() throws Exception {
        // GIVEN values array
        int[] values = new int[]{1};

        // WHEN missing element is looked for
        int solution = missingInteger.solution(values);

        // THEN 2 should be found
        Java6Assertions.assertThat(solution).isEqualTo(2);
    }

    @Test
    public void shouldCorrectlyReturnMissingLastElementForOrderedTwoElementArray() throws Exception {
        // GIVEN values array
        int[] values = new int[]{1, 2};

        // WHEN missing element is looked for
        int solution = missingInteger.solution(values);

        // THEN 3 should be found
        Java6Assertions.assertThat(solution).isEqualTo(3);
    }

    @Test
    public void shouldCorrectlyReturnMissingLastElementForUnorderedTwoElementArray() throws Exception {
        // GIVEN values array
        int[] values = new int[]{3, 1};

        // WHEN missing element is looked for
        int solution = missingInteger.solution(values);

        // THEN 2 should be found
        Java6Assertions.assertThat(solution).isEqualTo(2);
    }

    @Test
    public void shouldReturn1ForArrayContainingValuesUpto0() throws Exception {
        // GIVEN values array
        int[] values = new int[]{-3, -1, 0};

        // WHEN missing element is looked for
        int solution = missingInteger.solution(values);

        // THEN 1 should be found
        Java6Assertions.assertThat(solution).isEqualTo(1);
    }

    @Test
    public void shouldReturnIntegerMax() throws Exception {
        // GIVEN values array
        int[] values = new int[]{-Integer.MIN_VALUE, -1231, 1, 2, 3, 4, 4, 5, 6, 6, 6, 7, 8, 9, Integer.MAX_VALUE};

        // WHEN missing element is looked for
        int solution = missingInteger.solution(values);

        // THEN 10 should be found
        Java6Assertions.assertThat(solution).isEqualTo(10);
    }
}