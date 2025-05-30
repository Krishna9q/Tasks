import java.util.Arrays;
import java.util.HashSet;

public class program1LongestSubString {

    public static void main(String[] args) {
        String s = "  cadbzabcd";
        int lenOfLongestSubString = lengthOfLongestSubstring(s);
        System.out.println(lenOfLongestSubString);
    }

    public static int lengthOfLongestSubstring(String s) {

        int left = 0, right = 0, maxLength = 0;

        HashSet<Character> seen = new HashSet<>();

        while (right < s.length()) {
            char c = s.charAt(right);
            if (!seen.contains(c)) {
                seen.add(c);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                seen.remove(s.charAt(left));
                left++;
            }

        }

        return maxLength;
    }

    static void getAllTheSubStringPair(String s) {
        int len = s.length();

        String allPair[] = new String[len * (len + 1) / 2];
        System.out.println(allPair.length);
        int count = 0;

        for (int i = 0; i < len; i++) {
            String sub = "";
            for (int j = i; j < len; j++) {

                sub = sub + s.charAt(j);
                allPair[count] = sub;
                count++;
            }

        }

        System.out.println(Arrays.toString(allPair));
    }

}