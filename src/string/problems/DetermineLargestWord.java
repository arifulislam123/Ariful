package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static String getLongestString(String[] array) {
        int maxLength = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        String longestString1 = longestString;
        return longestString1;
    }

    public static void main(String[] args) {
        String[] largeword = new String[]{"Human", "a", "biological", "brain", "is", "learning", "machine"};
        String longestString = getLongestString(largeword);
        System.out.format("longest string: '%s'\n", longestString);

    }
}
