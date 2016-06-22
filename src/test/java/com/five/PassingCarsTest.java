package com.five;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PassingCarsTest {
    private PassingCars passingCars;

    @Before
    public void setUp() throws Exception {
        this.passingCars = new PassingCars();
    }

    @After
    public void tearDown() throws Exception {
        this.passingCars = null;
    }

    @Test
    public void codilityTest() throws Exception {
        // GIVEN car directions
        int[] directions = new int[]{0, 1, 0, 1, 1};

        // WHEN cars are counter
        int solution = passingCars.solution(directions);

        // THEN there should be 5 cars
        assertThat(solution).isEqualTo(5);
    }

    @Test
    public void notPassingCars() throws Exception {
        // GIVEN car directions
        int[] directions = new int[]{0, 0, 0, 0, 0};

        // WHEN cars are counter
        int solution = passingCars.solution(directions);

        // THEN there should be no passing by cars
        assertThat(solution).isEqualTo(0);
    }

    @Test
    public void onePassingAll() throws Exception {
        // GIVEN car directions
        int[] directions = new int[]{0, 0, 0, 0, 1};

        // WHEN cars are counter
        int solution = passingCars.solution(directions);

        // THEN there should be 4 cars
        assertThat(solution).isEqualTo(4);
    }

}