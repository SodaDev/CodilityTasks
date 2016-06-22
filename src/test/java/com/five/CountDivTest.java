package com.five;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CountDivTest {
    private CountDiv countDiv;

    @Before
    public void setUp() throws Exception {
        countDiv = new CountDiv();
    }

    @After
    public void tearDown() throws Exception {
        countDiv = null;
    }

    @Test
    public void shouldStartFromFive(){
        assertThat(countDiv.getStartValue(2,4)).isEqualTo(4);
    }

    @Test
    public void shouldStartFromSeven(){
        assertThat(countDiv.getStartValue(0, 7)).isEqualTo(0);
    }

    @Test
    public void shouldStartFromFifty(){
        assertThat(countDiv.getStartValue(51,50)).isEqualTo(100);
    }

    @Test
    public void shouldFinishOnNinety(){
        assertThat(countDiv.getEndValue(99, 15)).isEqualTo(90);
    }

    @Test
    public void shouldFinishOnFive(){
        assertThat(countDiv.getEndValue(1, 5)).isEqualTo(0);
    }

    @Test
    public void shouldReturnThreeFor6To11Range(){
        assertThat(countDiv.solution(6, 11, 2)).isEqualTo(3);
    }
}