package org.example;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    public static String encode(String word) {
        // Перетворюємо слово на нижній регістр для ігнорування регістру
        String lowerCaseWord = word.toLowerCase();

        // Створюємо мапу для підрахунку частоти появи кожного символу
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Рахуємо частоту кожного символу
        for (char ch : lowerCaseWord.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Формуємо новий рядок відповідно до умов завдання
        StringBuilder encodedString = new StringBuilder();
        for (char ch : lowerCaseWord.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                encodedString.append('(');
            } else {
                encodedString.append(')');
            }
        }

        return encodedString.toString();
    }

    public static void main(String[] args) {
        String input = "Success";
        String result = encode(input);
        System.out.println(result);
    }
}
