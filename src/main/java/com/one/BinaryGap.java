package com.one;

public class BinaryGap  {
    private static final String STOP_SIGN = "1";

    public int solution(int N) {
        String binaryRepresentation = Integer.toBinaryString(N);

        int maxCounter = 0;
        int prevOneOccurence = 0;
        int nextOneOccurence = binaryRepresentation.indexOf(STOP_SIGN);

        while (nextOneOccurence != -1) {
            maxCounter = Math.max(maxCounter, nextOneOccurence - prevOneOccurence - 1);
            prevOneOccurence = nextOneOccurence;
            nextOneOccurence = binaryRepresentation.indexOf(STOP_SIGN, prevOneOccurence+1);
        }

        return maxCounter;
    }
}
