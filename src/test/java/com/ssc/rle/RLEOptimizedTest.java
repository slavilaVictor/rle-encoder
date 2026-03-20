package com.ssc.rle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RLEOptimizedTest {

    private final RLEEncoder optimizedEncoder = new RLEBasicEncoder();

    @Test
    void testRLEOptimizedEncoderSuccess() {
        assertEquals("w4a3d1e1x6", optimizedEncoder.encode("wwwwaaadexxxxxx"));
        assertEquals("a2b2", optimizedEncoder.encode("aabb"));
        assertEquals("y10t1y4", optimizedEncoder.encode("yyyyyyyyyytyyyy"));
        assertEquals("a1b1c1", optimizedEncoder.encode("abc"));
    }

    @Test
    void testRLEOptimizedEncoderNullInput() {
        assertEquals("", optimizedEncoder.encode(null));
    }

    @Test
    void testRLEOptimizedEncoderEmptyInput() {
        assertEquals("", optimizedEncoder.encode(""));
    }

}