package com.ssc.rle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/* !! Due to the lack of time, other tests were not constructed (check README.md)*/
class RLETwoPointersApproachTest {
    private final RLETwoPointersApproach twoPointersApproach = new RLETwoPointersApproach();

    @Test
    void testRLEOptimizedEncoderSuccess() {
        assertEquals("w4a3d1e1x6", twoPointersApproach.encode("wwwwaaadexxxxxx"));
    }
}