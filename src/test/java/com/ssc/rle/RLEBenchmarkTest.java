package com.ssc.rle;

import org.junit.jupiter.api.Test;

class RLEBenchmarkTest {

    private final RLEEncoder basicEncoder = new RLEBasicEncoder();
    private final RLEEncoder optimizedEncoder = new RLEOptimized();
    private final RLETwoPointersApproach twoPointersApproach = new RLETwoPointersApproach();

    private final String fixture = generateStringForPerformanceTest(70_000);

    @Test
    void testBenchmarkBetweenSolutions() {
        long startTimeBasicEncoder = System.nanoTime();
        basicEncoder.encode(fixture);
        long endTimeBasicEncoder = System.nanoTime();
        System.out.println("Time for basic implementation " + (endTimeBasicEncoder - startTimeBasicEncoder) / 1_000_000_000.0 + " seconds");

        System.out.println("***************************************************************************");

        long startTimeOptimizedEncoder = System.nanoTime();
        optimizedEncoder.encode(fixture);
        long endTimeOptimizedEncoder = System.nanoTime();
        System.out.println("Time for optimized implementation " + (endTimeOptimizedEncoder - startTimeOptimizedEncoder) / 1_000_000_000.0 + " seconds");

        System.out.println("***************************************************************************");
        long startTimeTwoPointersEncoder = System.nanoTime();
        twoPointersApproach.encode(fixture);
        long endTimeTwoPointersEncoder = System.nanoTime();
        System.out.println("Time for optimized implementation " + (endTimeTwoPointersEncoder - startTimeTwoPointersEncoder) / 1_000_000_000.0 + " seconds");

    }


    private String generateStringForPerformanceTest(int n) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append((char) ('a' + (i % 26)));
        }

        return sb.toString();
    }
}
