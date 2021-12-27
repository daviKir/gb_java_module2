package lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task 1");

        Words words = new Words(new String[]{
                "from", "name", "down", "family", "order", "five", "trouble", "smile", "industry", "crowd",
                "family", "trouble", "post", "smile", "dollar", "offer", "trouble", "degree", "nature", "shell",
                "offer", "sugar", "solution", "fail", "order", "message", "mass", "coat", "smile"
        });

        System.out.println("Source array: " + Arrays.toString(words.getSourceArray()));
        System.out.println("Source array length: " + words.getSourceArrayLength());
        System.out.println("Unique words: " + words.getUnique().toString());
        System.out.println("Unique words list length: " + words.getUnique().size());
        System.out.println();
        for (Map.Entry<String, Integer> wordEntry : words.getWordsCount().entrySet()) {
            System.out.printf("{ word: %s, count: %s }%n", wordEntry.getKey(), wordEntry.getValue());
        }

        System.out.println();
        System.out.println("=============================");
        System.out.println();

        System.out.println("Task 2");

        Contacts contacts = new Contacts();
        contacts.add("Попов", "+79171324151");
        contacts.add("Иванов", "+79562348822");
        contacts.add("Сидоров", "+79170923422");
        contacts.add("Петров", "+79107543922");
        contacts.add("Иванов", "+79118736192");

        System.out.println("Поиск по фамилии Иванов...");
        System.out.println("Результаты:");
        List<String> phones = contacts.get("Иванов");
        if (phones.isEmpty()) {
            System.out.println("По заданным параметрам ничего не найдено");
        } else {
            System.out.printf("Найдено номеров (%d)%n", phones.size());
            for (String phone : phones) {
                System.out.println(phone);
            }
        }
    }

}
