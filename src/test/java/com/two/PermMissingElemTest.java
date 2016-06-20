package com.two;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class PermMissingElemTest {
    private PermMissingElem permMissingElem;

    @Before
    public void setUp() throws Exception {
        this.permMissingElem = new PermMissingElem();
    }

    @After
    public void tearDown() throws Exception {
        this.permMissingElem = null;
    }

    @Test
    public void shouldCorrectlyReturnMissingElementForTwoElementsArray() throws Exception {
        // GIVEN values array
        int[] values = new int[]{1, 3};

        // WHEN missing element is looked for
        int solution = permMissingElem.solution(values);

        // THEN 2 should be found
        assertThat(solution).isEqualTo(2);
    }

    @Test
    public void shouldCorrectlyReturnMissingElementForCodilityExample() throws Exception {
        // GIVEN values array
        int[] values = new int[]{2, 3, 1, 5};

        // WHEN missing element is looked for
        int solution = permMissingElem.solution(values);

        // THEN 4 should be found
        assertThat(solution).isEqualTo(4);
    }

    @Test
    public void shouldCorrectlyReturnMissingLastElement() throws Exception {
        // GIVEN values array
        int[] values = new int[]{2, 3, 1, 5, 4};

        // WHEN missing element is looked for
        int solution = permMissingElem.solution(values);

        // THEN 6 should be found
        assertThat(solution).isEqualTo(6);
    }

    @Test
    public void shouldCorrectlyReturnMissingLastElementForEmptyArray() throws Exception {
        // GIVEN values array
        int[] values = new int[]{};

        // WHEN missing element is looked for
        int solution = permMissingElem.solution(values);

        // THEN 1 should be found
        assertThat(solution).isEqualTo(1);
    }

    @Test
    public void shouldCorrectlyReturnMissingLastElementForSingleElementArray() throws Exception {
        // GIVEN values array
        int[] values = new int[]{1};

        // WHEN missing element is looked for
        int solution = permMissingElem.solution(values);

        // THEN 2 should be found
        assertThat(solution).isEqualTo(2);
    }

    @Test
    public void shouldCorrectlyReturnMissingLastElementForOrderedTwoElementArray() throws Exception {
        // GIVEN values array
        int[] values = new int[]{1, 2};

        // WHEN missing element is looked for
        int solution = permMissingElem.solution(values);

        // THEN 3 should be found
        assertThat(solution).isEqualTo(3);
    }

    @Test
    public void shouldCorrectlyReturnMissingLastElementForUnorderedTwoElementArray() throws Exception {
        // GIVEN values array
        int[] values = new int[]{3, 1};

        // WHEN missing element is looked for
        int solution = permMissingElem.solution(values);

        // THEN 2 should be found
        assertThat(solution).isEqualTo(2);
    }
}