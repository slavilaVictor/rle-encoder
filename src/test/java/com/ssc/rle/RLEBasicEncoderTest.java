package com.ssc.rle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RLEBasicEncoderTest {

    private final RLEEncoder basicEncoder = new RLEBasicEncoder();

    @Test
    void testRLEBasicEncoderSuccess() {
        assertEquals("w4a3d1e1x6", basicEncoder.encode("wwwwaaadexxxxxx"));
        assertEquals("a2b2", basicEncoder.encode("aabb"));
        assertEquals("y10t1y4", basicEncoder.encode("yyyyyyyyyytyyyy"));
        assertEquals("a1b1c1", basicEncoder.encode("abc"));
    }

    @Test
    void testRLEBasicEncoderNullInput() {
        assertEquals("", basicEncoder.encode(null));
    }

    @Test
    void testRLEBasicEncoderEmptyInput() {
        assertEquals("", basicEncoder.encode(""));
    }

}