package com.three;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TapeEquilibrium {

    public int solution(int[] A) {
        List<Integer> integral = countIntegral(A);
        int sum = integral.get(integral.size()-1);

        Optional<Integer> min = integral.stream()
                .limit(integral.size()-1)
                .map(value -> Math.abs(value - (sum - value)))
                .min(Integer::compare);

        return min.get();
    }

    private List<Integer> countIntegral(int[] A) {
        List<Integer> sums = new ArrayList<>(A.length);

        sums.add(A[0]);
        for (int i = 1; i < A.length; i++) {
            sums.add(A[i] + sums.get(i-1));
        }

        return sums;
    }
}
