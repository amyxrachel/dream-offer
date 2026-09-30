import java.util.*;

class Solution {
    // Map to store previously computed results for substrings
    private Map<String, Boolean> memo = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        int n = s1.length();

        // If the two strings are equal, they are scrambled versions of each other
        if (s1.equals(s2)) {
            return true;
        }

        // Check if the result for the current pair of substrings is already computed
        String key = s1 + "#" + s2; // Use a delimiter to avoid ambiguity
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        // Arrays to count the frequency of characters in s1, s2, and the current split
        int[] countS1 = new int[26];
        int[] countS2 = new int[26];
        int[] countS2Reversed = new int[26];

        // Iterate through all possible split points
        for (int i = 1; i < n; i++) {
            int j = n - i;

            // Update frequency counts for the current split
            countS1[s1.charAt(i - 1) - 'a']++;
            countS2[s2.charAt(i - 1) - 'a']++;
            countS2Reversed[s2.charAt(j) - 'a']++;

            // Check if the current split results in scrambled versions
            if (Arrays.equals(countS1, countS2) &&
                isScramble(s1.substring(0, i), s2.substring(0, i)) &&
                isScramble(s1.substring(i), s2.substring(i))) {
                memo.put(key, true);
                return true;
            }

            // Check if the reversed split results in scrambled versions
            if (Arrays.equals(countS1, countS2Reversed) &&
                isScramble(s1.substring(0, i), s2.substring(j)) &&
                isScramble(s1.substring(i), s2.substring(0, j))) {
                memo.put(key, true);
                return true;
            }
        }

        // If no valid split is found, the strings are not scrambled versions
        memo.put(key, false);
        return false;
    }
}