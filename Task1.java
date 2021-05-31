package Homework;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {

    private static final String[] INPUT_DATA = {
            "ananas", "banana", "banana", "orange", "rage",
            "legit", "rage", "bananas", "ananas", "legit", "bay",
            "boll", "rage", "fsdfdsfsd", "two", "legit", "bay",
            "boll", "rage", "two"
    };


    public static void main(String[] args) {
        Map<String, Integer> frequencyByWord = new LinkedHashMap<>();
        for (String word : INPUT_DATA) {
            Integer frequency = frequencyByWord.get(word);
            if (frequency == null) {
                frequency = 0;
            }
            frequencyByWord.put(word, ++frequency);
        }

        frequencyByWord.forEach((word, frequency) -> {
            System.out.println(word + ": " + frequency);
        });


    }
}
