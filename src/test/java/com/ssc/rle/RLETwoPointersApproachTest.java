package com.ssc.rle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RLETwoPointersApproachTest {
    private final RLETwoPointersApproach twoPointersApproach = new RLETwoPointersApproach();

    @Test
    void testRLEOptimizedEncoderSuccess() {
        assertEquals("w4a3d1e1x6", twoPointersApproach.encode("wwwwaaadexxxxxx"));
        assertEquals("a2b2", twoPointersApproach.encode("aabb"));
        assertEquals("y10t1y4", twoPointersApproach.encode("yyyyyyyyyytyyyy"));
        assertEquals("a1b1c1", twoPointersApproach.encode("abc"));
    }

    @Test
    void testRLETwoPointersApproachNullInput() {
        assertEquals("", twoPointersApproach.encode(null));
    }

    @Test
    void testRLETwoPointersApproachEmptyInput() {
        assertEquals("", twoPointersApproach.encode(""));
    }
}