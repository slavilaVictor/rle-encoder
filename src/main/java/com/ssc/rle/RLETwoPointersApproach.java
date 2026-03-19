package com.ssc.rle;

public class RLETwoPointersApproach implements RLEEncoder {
    /*
    Time Complexity:  O(n)
    Space Complexity: O(n)
    */
    @Override
    public String encode(String input) {
        if (input == null || input.isEmpty()) return "";

        StringBuilder encodedInput = new StringBuilder();
        int i = 0;

        while (i < input.length()) {
            char current = input.charAt(i);
            int j = i;

            while (j < input.length() && input.charAt(j) == current) {
                j++;
            }

            encodedInput.append(current).append(j - i);
            /* MANDATORY */
            i = j;
        }

        return encodedInput.toString();
    }
}
