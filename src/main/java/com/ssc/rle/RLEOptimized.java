package com.ssc.rle;

public class RLEOptimized implements RLEEncoder {
    /*
        Time Complexity:  O(n)
        Space Complexity: O(n)
     */
    @Override
    public String encode (String input) {
        if (input == null || input.isEmpty()) return "";

        StringBuilder encodedInput = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                encodedInput.append(input.charAt(i - 1)).append(count);
                count = 1;;
            }
        }

        /* ! VERY IMPORTANT: last group, otherwise the result will not be complete */
        encodedInput.append(input.charAt(input.length() - 1)).append(count);

        return encodedInput.toString();
    }
}
