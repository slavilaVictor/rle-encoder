package com.ssc.rle;

public class RLEBasicEncoder implements RLEEncoder {
    /*
        Time Complexity:  O(n^2)
        Space Complexity: O(n)
     */
    @Override
    public String encode (String input) {
        if (input == null || input.isEmpty()) return "";

        String encodedInput = "";
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                /* + "" in order to force the concatenation to string */
                encodedInput += input.charAt(i - 1) + "" + count;
                count = 1;;
            }
        }

        /* ! VERY IMPORTANT: last group, otherwise the result will not be complete */
        encodedInput += input.charAt(input.length() - 1) + "" + count;

        return encodedInput;
    }
}
