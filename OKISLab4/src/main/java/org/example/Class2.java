package org.example;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Class2 {

    public static String readFirstLineFromFile(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            return br.readLine(); // Читаем и возвращаем первую строку файла
        }
    }

    // Метод, возвращающий строку с перевернутыми словами
    public static String reverseWords(String str) {
        String[] words = str.split("\\s");
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word);
            reversedString.append(reverseWord.reverse().toString()).append(" ");
        }
        return reversedString.toString().trim();
    }


    // Метод, преобразующий строку в "змеиный_регистр" из "CamelCase"
    public static String camelCaseToSnakeCase(String str) {
        return str.replaceAll("([a-z])([A-Z]+)", "$1_$2").toLowerCase();
    }

    // Метод, удаляющий все гласные из строки
    public static String removeVowels(String str) {
        return str.replaceAll("[аяуюоеёэиыАЯУЮОЕЁЭИЫ]", "");
    }

    // Метод, генерирующий анаграмму строки
    public static String generateAnagram(String str) {
        List<Character> characters = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        Collections.shuffle(characters);
        StringBuilder anagram = new StringBuilder();
        for (Character c : characters) {
            anagram.append(c);
        }
        return anagram.toString();
    }

    public static void main(String[] args) {

        String filePath = "UU.txt";
        try {
            String originalString = readFirstLineFromFile(filePath);
            System.out.println("Первая строка из файла: " + originalString);
            System.out.println("Original string: " + originalString);
            System.out.println("Reversed words: " + reverseWords(originalString));
            System.out.println("CamelCase to snake_case: " + camelCaseToSnakeCase(originalString));
            System.out.println("Removed vowels: " + removeVowels(originalString));
            System.out.println("Anagram: " + generateAnagram(originalString));

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Произошла ошибка при чтении файла.");
        }
    }
}
