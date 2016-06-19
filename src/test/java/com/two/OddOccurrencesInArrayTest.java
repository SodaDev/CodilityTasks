package com.two;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OddOccurrencesInArrayTest {
    private OddOccurrencesInArray oddOccurrencesInArray;

    @Before
    public void setUp() throws Exception {
        this.oddOccurrencesInArray = new OddOccurrencesInArray();
    }

    @After
    public void tearDown() throws Exception {
        this.oddOccurrencesInArray = null;
    }

    @Test
    public void shouldFindUnmatchedElementOnFirstPosition() throws Exception {
// GIVEN an array to check
        int[] values = new int[] { 7, 9, 3, 9, 3, 9, 9 };

        // WHEN odd occurence is found
        int oddNumber = oddOccurrencesInArray.solution(values);

        // THEN only existing value should be found
        assertThat(oddNumber).isEqualTo(7);
    }

    @Test
    public void shouldFindUnmatchedElementOnLastPosition() throws Exception {
        // GIVEN an array to check
        int[] values = new int[] { 9, 3, 9, 9, 9, 3, 7 };

        // WHEN odd occurence is found
        int oddNumber = oddOccurrencesInArray.solution(values);

        // THEN only existing value should be found
        assertThat(oddNumber).isEqualTo(7);
    }

    @Test
    public void shouldFindUnmatchedWithMoreThanOneOddExistence() throws Exception {
        // GIVEN an array to check
        int[] values = new int[] { 9, 3, 9, 9, 9, 3, 7, 5, 3, 5, 5, 3, 7 };

        // WHEN odd occurence is found
        int oddNumber = oddOccurrencesInArray.solution(values);

        // THEN only existing value should be found
        assertThat(oddNumber).isEqualTo(5);
    }

    @Test
    public void shouldFindUnmatchedElementOnSingleElementArray() throws Exception {
        // GIVEN an array to check
        int[] values = new int[] { 921 };

        // WHEN odd occurence is found
        int oddNumber = oddOccurrencesInArray.solution(values);

        // THEN only existing value should be found
        assertThat(oddNumber).isEqualTo(921);
    }
}