package com.four;

import java.util.HashMap;
import java.util.Map;

public class FrogRiverOne {
    private static final int NO_RESULT = -1;

    public int solution(int X, int[] A) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int leaf = A[i];
            if (leaf <= X) {
                occurrences.putIfAbsent(leaf, i);

                if(occurrences.size() == X) {
                    return occurrences.values().stream().max(Integer::compare).get();
                }
            }
        }

        return NO_RESULT;
    }
}
