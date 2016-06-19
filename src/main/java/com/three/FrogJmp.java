package com.three;

public class FrogJmp {

    public int solution(int X, int Y, int D) {
        int distance = Y - X;
        double jumpsNeeded = (double) distance / D;
        return (int) Math.ceil(jumpsNeeded);
    }
}
