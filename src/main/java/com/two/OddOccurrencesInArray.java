package com.two;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        Optional<Integer> unMatched = IntStream.of(A)
                .boxed().parallel()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().parallel()
                .filter(value -> value.getValue() % 2 == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        return unMatched.get();
    }
}
