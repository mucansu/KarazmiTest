package org.example;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {
    public static int countDuplicate(int[] numbers) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : numbers) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (int freq : freqMap.values()) {
            if (freq > 1) {
                count++;
            }
        }
        return count;
        //The aim of the code is to count the total number of elements that occur more than once in the input array.
        //It is not trying to find the number that is repeated the most in the array or the frequency of the most frequently repeated element
    }

    public static int findMostFrequent(int[] numbers) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        int mostFrequent = 0;
        for (int num : numbers) {
            int freq = freqMap.getOrDefault(num, 0) + 1;
            freqMap.put(num, freq);
            if (freq > maxFreq) {
                maxFreq = freq;
                mostFrequent = num;
            }
        }
        return mostFrequent;
    }
    //Review this code, this is to find most frequent one

}
