package com.ssc.rle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/* !! Due to the lack of time, other tests were not constructed (check README.md)*/
class RLEOptimizedTest {

    private final RLEEncoder optimizedEncoder = new RLEBasicEncoder();

    @Test
    void testRLEOptimizedEncoderSuccess() {
        assertEquals("w4a3d1e1x6", optimizedEncoder.encode("wwwwaaadexxxxxx"));
    }

}