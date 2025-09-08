package com.leevilaune.probability;

public class AgeDistributionSim {

    public static void main(String[] args) {
        double[][] dist = {
                {20, 0.17},
                {21, 0.44},
                {22, 0.77},
                {23, 0.90},
                {24, 1.00}
        };
        int N = 1000;
        int[] samples = new int[N];

        for(int i = 0; i<N;i++){
            double r = Math.random();
            for (double[] doubles : dist) {
                if (r <= doubles[1]) {
                    samples[i] = (int) doubles[0];
                    System.out.println(samples[i]);
                    break;
                }
            }
        }
    }
}
