package problem28;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        int increment = needle.length();
        for (int i=0; i<haystack.length(); i++) {
            if (i + increment > haystack.length()) {
                return -1;
            }

            if (haystack.substring(i, i+increment).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
