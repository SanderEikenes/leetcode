package problem58;

public class Solution {
    public int lengthOfLastWord(String s) {
        int wordlength = 0;
        for (int i = s.length()-1; i>=0; i--) {
            System.out.println(s.charAt(i));
            if(s.charAt(i) != ' ') {
                wordlength++;
            } else if(wordlength > 0) {
                return wordlength;
            }
        }

        System.out.println("ran?");
        return 0;
    }
}