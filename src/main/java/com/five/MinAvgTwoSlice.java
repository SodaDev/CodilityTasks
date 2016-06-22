package com.five;

public class MinAvgTwoSlice {
    int[] values;
    double min = Double.MAX_VALUE;
    int minId = -1;

    public int solution(int[] A) {
        this.values = A;
        for (int id = 0; id < values.length - 2; id++) {
            double twoSlice = countAvg(id, id+1);
            double threeSlice = countAvg(id, id+2);
            checkMin(twoSlice, id);
            checkMin(threeSlice, id);
        }
        checkMin(countAvg(values.length-2, values.length-1), values.length-2);
        return minId;
    }

    private void checkMin(double value, int id) {
        if (value < min) {
            min = value;
            minId = id;
        }
    }

    private double countAvg(int from, int to){
        int sum = 0;
        for(int i = from; i<=to; i++){
            sum += values[i];
        }
        return (double) sum / (to-from+1);
    }
}
