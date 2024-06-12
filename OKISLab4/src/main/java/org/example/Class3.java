package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Class3 {

    public static String[] readLinesFromFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        // Преобразуем ArrayList в массив и возвращаем его
        return lines.toArray(new String[0]);
    }


    public static String[] addPlusToStrings(String[] strings) {
        String[] noisyStrings = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            StringBuilder sb = new StringBuilder();
            char[] chars = strings[i].toCharArray();

            for (char c : chars) {
                sb.append(c);
                // Добавляем символ '+' после каждого символа
                sb.append('+');
            }

            noisyStrings[i] = sb.toString();
        }

        return noisyStrings;
    }


    public static String[] caesarCipherStrings(String[] strings) {

        int shift = 5;
        String[] cipheredStrings = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            StringBuilder ciphered = new StringBuilder();
            for (char c : strings[i].toCharArray()) {
                if (Character.isLetter(c)) {
                    char base = Character.isUpperCase(c) ? 'A' : 'a';
                    c = (char) ((c - base + shift) % 26 + base);
                }
                ciphered.append(c);
            }
            cipheredStrings[i] = ciphered.toString();
        }

        return cipheredStrings;
    }


    public static String joinAndReverse(String[] strings) {
        String delimiter  = "-";
        // Объединяем строки с помощью разделителя
        String joined = String.join(delimiter, strings);
        // Инвертируем и возвращаем результат
        return new StringBuilder(joined).reverse().toString();
    }

    public static void main(String[] args) {
        String filePath = "UU.txt";

        try {
            String[] lines = readLinesFromFile(filePath);
            System.out.println("Содержимое файла в виде массива:");
            for (String line : lines) {
                System.out.println(line);
            }

            String joinedAndReversed = joinAndReverse(lines);
            System.out.println(joinedAndReversed);

            String[] noisyStrings = addPlusToStrings(lines);
            for (String line : noisyStrings) {
                System.out.println(line);
            }

            String[] cSC = caesarCipherStrings(lines);
            for (String line : cSC) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Произошла ошибка при чтении файла.");
        }
    }


}
