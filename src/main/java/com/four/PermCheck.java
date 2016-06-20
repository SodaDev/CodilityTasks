package com.four;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class PermCheck {
    private static final int NOT_PERMUTATION = 0;
    private static final int PERMUTATION = 1;

    public int solution(int[] A) {
        IntSummaryStatistics stats = IntStream.of(A).distinct().summaryStatistics();
        return containsAll(stats.getCount(), stats.getMax()) && isDistinct(stats.getCount(), A.length) ? PERMUTATION : NOT_PERMUTATION;
    }

    private boolean isDistinct(long distinctElements, int inputElements) {
        return distinctElements == inputElements;
    }

    private boolean containsAll(long distinctElements, int maxValue) {
        return distinctElements == maxValue;
    }
}
