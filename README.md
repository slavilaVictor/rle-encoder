RLEBasicEncoder
  Time Complexity: O(n^2)
    Why? -> Strings in Java are immutable: String result = "" and result += "a" does not modify the existing String => a new object is created in memory
    Relevant piece of code: encodedInput += input.charAt(i - 1) + "" + count;
    At each concatenation, a new String is created => the old content is copied and the new character is added
    Real cost: "a" -> "aa" -> "aaa" -> ... => at each step, the cost is increasing by 1 => 1 + 2 + 3 + ... + n => O(n ^ 2).
  Space Complexity: O(n) -> the extra memory used
     Why? input: aaaabbbc => output: a3b2c1 -> constructing a new String, which, in the worst case scenario, is proportional with the length of the input
     (there are temporary allocation, indeed, but it's not relevant in this case)


RLEOptimizedEncoder
  Time Complexity: O(n)
    Why? -> there is only one loop, in which every character is processed only one time AND append() is O(1)
         -> IMPORTANT: keeping the same logic and using StringBuilder instead of String reduces the time complexity from O(n^2) to O(n)
  Space Complexity: O(n)

RLETwoPointersApproach -> another solution for the RLE Problem
  Time Complexity: O(n) -> even if there are two separate whiles, each element is processed once
                           (the second pointer does not reiterate through the already processed elements)
  Space Complexity: O(n)

Check RLEBenchmarkTest to see the importance of performance (especially what a small change in the code can do to impact the final result

!!! For unit tests, I wanted to follow CONFORMANCE and Right BICEP principles, but I did not have enough time to deep dive into it
      (we can discuss this in details at the interview)