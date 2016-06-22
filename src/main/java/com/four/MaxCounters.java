package com.four;

import java.util.Optional;
import java.util.stream.IntStream;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxCounter = -Integer.MIN_VALUE;
        Optional<Integer> updateValue = Optional.empty();

        for (int counterId : A) {
            if (counterId > N) {
                updateValue = Optional.of(maxCounter);
            } else {
                updateValue.ifPresent((Integer syncValue) -> {
                    if (counters[counterId - 1] < syncValue) {
                        counters[counterId - 1] = syncValue;
                    }
                });
                int newCounterValue = ++counters[counterId - 1];
                maxCounter = Math.max(maxCounter, newCounterValue);
            }
        }

        Integer lastSyncValue = updateValue.orElseGet(() -> 0);
        return IntStream.of(counters).map(v -> Math.max(v, lastSyncValue)).toArray();
    }
}
