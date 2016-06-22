package com.five;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinAvgTwoSliceTest {
    private MinAvgTwoSlice minAvgTwoSlice;

    @Before
    public void setUp(){
        this.minAvgTwoSlice = new MinAvgTwoSlice();
    }

    @After
    public void tearDown(){
        this.minAvgTwoSlice = null;
    }

    @Test
    public void shouldReturnOneForTestArray(){
        assertThat(minAvgTwoSlice.solution(new int[]{4,2,2,5,1,5,8})).isEqualTo(1);
    }

    @Test
    public void shouldReturnOneForSmallArray(){
        assertThat(minAvgTwoSlice.solution(new int[]{0,1,-5})).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroForSmallArray(){
        assertThat(minAvgTwoSlice.solution(new int[]{2,1,3})).isEqualTo(0);
    }

    @Test
    public void shouldReturnMinAvgForLastThreeValues(){
        assertThat(minAvgTwoSlice.solution(new int[]{4,2,2,5,1,5,7,-7,-5000,-2})).isEqualTo(7);
    }

    @Test
    public void shouldReturnMinAvgForLastTwoValues(){
        assertThat(minAvgTwoSlice.solution(new int[]{4,2,2,5,1,5,7,1,-5000,-2})).isEqualTo(8);
    }
}