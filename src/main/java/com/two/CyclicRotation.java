package com.two;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class CyclicRotation {
    /**
     *
     * @param A - array elements to rotate
     * @param K - rotation counter
     * @return
     */
    public int[] solution(int[] A, int K) {
        List<Integer> integers = IntStream.of(A).boxed().collect(toList());
        Collections.rotate(integers, K);
        return integers.stream().mapToInt(x -> x).toArray();
    }
}
