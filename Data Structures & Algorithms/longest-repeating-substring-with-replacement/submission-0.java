class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            int index = s.charAt(right) - 'A';
            count[index]++;

            maxFreq = Math.max(maxFreq, count[index]);

            // Number of characters that need to be replaced
            int replacements = (right - left + 1) - maxFreq;

            // Shrink the window if more than k replacements are needed
            if (replacements > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}