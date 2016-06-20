package com.four;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class MissingInteger {
    public int solution(int[] A) {
        List<Integer> collect = IntStream.of(A)
                .filter(value -> value > 0)
                .distinct()
                .sorted()
                .boxed()
                .collect(toList());
        for (int i = 0; i < collect.size(); i++) {
            if(collect.get(i) != i+1) {
                return i+1;
            }
        }
        return collect.size()+1;
    }
}
