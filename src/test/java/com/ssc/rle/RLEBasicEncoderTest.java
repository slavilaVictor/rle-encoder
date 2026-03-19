package com.ssc.rle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/* !! Due to the lack of time, other tests were not constructed (check README.md)*/
class RLEBasicEncoderTest {

    private final RLEEncoder basicEncoder = new RLEBasicEncoder();

    @Test
    void testRLEBasicEncoderSuccess() {
        assertEquals("w4a3d1e1x6", basicEncoder.encode("wwwwaaadexxxxxx"));
    }

}