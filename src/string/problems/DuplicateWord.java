package string.problems;

import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    // public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        public static void main(String[] args) {

            String text =  "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

            List<String> list = Arrays.asList(text.split(" "));

            Set<String> uniqueWords = new HashSet<String>(list);
            for (String word : uniqueWords) {
                System.out.println(word + ": " + Collections.frequency(list, word));
            }
        }
    }





