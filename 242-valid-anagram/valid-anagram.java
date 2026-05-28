class Solution {
    public boolean isAnagram(String s, String t) {

        // Check length
        if (s.length() != t.length()) {
            return false;
        }

        // Array to store character count
        int[] count = new int[26];

        // Count characters
        for (int i = 0; i < s.length(); i++) {

            count[s.charAt(i) - 'a']++;

            count[t.charAt(i) - 'a']--;
        }

        // Check all counts are 0
        for (int i = 0; i < 26; i++) {

            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}