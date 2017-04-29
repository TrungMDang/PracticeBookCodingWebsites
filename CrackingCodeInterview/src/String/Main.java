package String;

import java.util.*;

/**
 * Created by Trung on 2/20/2017.
 *
 * Anagrams: two strings to be anagrams of each other if the first string's letters can be rearranged to form the
 * second string. In other words, both strings must contain the same exact letters in the same exact frequency.
 */
public class Main {
    public static void main(String...args) {

        //Test strings
        String s = "fcrxzwscanmligyxyvym";

        String s2 = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        System.out.println(numberNeeded(s, s2));
        System.out.println(numberNeeded_Better(s, s2));

    }

    /***
     * Find the number of deletions totaled from both strings to make an anagram.
     *
     * @param a     first string
     * @param b    second string
     * @return      An integer indicating the number of deletions from both strings
     * to make an anagram.
     */
    private static int numberNeeded(String a, String b) {
        int result = 0;
        Map<Character, Integer> aData = new HashMap<>();
        Map<Character, Integer> bData = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            aData.put(a.charAt(i), aData.get(a.charAt(i)) == null ? 1 : aData.get(a.charAt(i)) + 1);
        }
        for (int i = 0; i < b.length(); i++) {
            bData.put(b.charAt(i), bData.get(b.charAt(i)) == null ? 1 : bData.get(b.charAt(i)) + 1);
        }

        //Get smaller smaller map, larger map.
        Map<Character, Integer> smallerM = aData.size() >= bData.size() ? bData : aData;
        Map<Character, Integer> largerM = aData.size() >= bData.size() ? aData : bData;

        Set<Character> keySet = smallerM.keySet();
        Object[] arr = keySet.toArray();
        for (int i= 0; i < arr.length; i++) {
            Object val = aData.get((arr[i]));
            Object val2 = bData.get(arr[i]);
            if (val != null && val2 != null) {
                result += Math.abs((int)val - (int)val2);
            } else {
                    //One of them is null, i.e a char does not appear in either string
                    // -> it must be deleted to make anagrams.
                    if (val == null) result += (int)val2;
                    else if (val2 == null) result += (int) val;
                }

            aData.remove(arr[i]);
            bData.remove(arr[i]);
        }
        //Get remaining deletions
        Set<Character> keySet2 = largerM.keySet();
        Object[] arr2 = keySet2.toArray();
        for (int i = 0; i < arr2.length; i++) {
            result += largerM.get(arr2[i]);
        }
        return result;
    }

    public static int NUMBER_LETTERS = 26;
    /**
     * Editorial Solution on HackerRank
     * @see <a href="https://www.hackerrank.com/challenges/ctci-making-anagrams/editorial">HackerRank solution</a>
     */
    public static int numberNeeded_Better(String a, String b) {
        int[] charCount1 = getCharCount(a);
        int[] charCount2 = getCharCount(b);
        return getDelta(charCount1, charCount2);
    }

    private static int[] getCharCount(String s) {
        int[] charCounts = new int[NUMBER_LETTERS];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int offset = (int)'a';                  //KEY TO SOLVE the PROBLEM RIGHT HERE
            int code = c - offset;
            charCounts[code]++;
        }
        return charCounts;
    }
    private static int getDelta(int[] array1, int[] array2) {
        int delta = 0;
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Two arrays do not have the same number of letters.");
        }
        for (int i = 0; i < array1.length; i++) {
            int difference = Math.abs(array1[i] - array2[i]);
            delta+=difference;
        }
        return delta;
    }

}

