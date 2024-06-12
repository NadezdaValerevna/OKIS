package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Class1 {
    public static List<Integer> IntegersFromFile(String filePath) {
        List<Integer> integers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Разбиваем строку на слова с использованием разделителей, не являющихся цифрами
                String[] words = line.split("[^0-9]+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        try {
                            // Преобразуем слово в Integer и добавляем в список
                            integers.add(Integer.parseInt(word));
                        } catch (NumberFormatException e) {
                            // В случае, если строка не может быть преобразована в число
                            System.out.println(word + " is not an integer.");
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return integers;
    }

    // Метод, удваивающий целое число
    public static int doubleValue(int value) {
        return value * 2;
    }

    // Метод, вычисляющий факториал целого числа
    public static int factorial(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен.");
        }
        int result = 1;
        for (int i = 2; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    // Метод, инвертирующий порядок цифр в целом числе
    public static int reverseDigits(int value) {
        int reversed = 0;
        while (value != 0) {
            reversed = reversed * 10 + value % 10;
            value /= 10;
        }
        return reversed;
    }

    // Метод, проверяющий, является ли целое число простым
    public static boolean isPrime(int value) {
        if (value < 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String filePath = "VV";
        List<Integer> integers = IntegersFromFile(filePath);
        System.out.println("Integers extracted from the file:");

        for (Integer integer : integers) {

            int number = integer;
            System.out.println("Исходное число: " + number);
            System.out.println("Удвоенное значение: " + doubleValue(number));
            System.out.println("Факториал числа " + number + ": " + factorial(number));
            System.out.println("Число с обратным порядком цифр: " + reverseDigits(number));
            System.out.println("Число " + number + " является простым? " + isPrime(number));
            System.out.println(integer);
        }
    }
}
