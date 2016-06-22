package com.five;

public class PassingCars {
    private static final int EAST = 0;
    private static final int LIMIT = 1_000_000_000;

    public int solution(int[] A) {
        int multiplier = 0;
        int counter = 0;

        for (int carDirection : A) {
            if(carDirection == EAST) {
                multiplier++;
            } else {
                counter += multiplier;
                if(counter > LIMIT) {
                    return -1;
                }
            }
        }

        return counter;
    }
}
