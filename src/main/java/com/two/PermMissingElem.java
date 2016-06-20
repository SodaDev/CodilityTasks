package com.two;

import java.util.Arrays;

public class PermMissingElem {

    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            int expectedValue = (i+1);
            if(A[i] != expectedValue) {
                return expectedValue;
            }
        }
        return A.length+1;
    }
}
