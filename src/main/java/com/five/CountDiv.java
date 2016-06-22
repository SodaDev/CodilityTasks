package com.five;

import java.util.function.Function;

public class CountDiv {
    public int solution(int A, int B, int K) {
        int start = getStartValue(A, K);
        int end = getEndValue(B, K);
        return (end-start)/K+1;
    }

    protected int getStartValue(int start, int divisor) {
        return getDivisibleValue(start, divisor, (value) -> value+1);
    }

    protected int getEndValue(int end, int divisor) {
        return getDivisibleValue(end, divisor, (value) -> value-1);
    }

    private int getDivisibleValue(int value, int divisor, Function<Integer, Integer> func) {
        while(value%divisor != 0){
            value = func.apply(value);
        }
        return value;
    }
}
