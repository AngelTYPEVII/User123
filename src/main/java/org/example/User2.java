package org.example;
import java.util.*;

public class User2 {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> Names = new ArrayList<>(Arrays.asList("Даниил", "Максим", "Владислав", "Тимур", "Артем", "Иван", "Кирилл", "Егор", "Илья", "Андрей"));
        List<String> Ages = new ArrayList<>(Arrays.asList("10", "20", "30", "40", "50", "60", "70", "80", "90"));
        Random random = new Random(System.currentTimeMillis());
        String Name;
        String Age;
        for (int i = 0; i < 5; i++) {
            Name = getAndRemove(Names, random.nextInt(Names.size()));
            Age = getAndRemove(Ages, random.nextInt(Ages.size()));
            stringBuilder.append(String.format("Имя: %s Возраст: %s лет%n", Name, Age));
        }
        System.out.println(stringBuilder);
    }

    private static String getAndRemove(List<String> list, int index) {
        String str = list.get(index);
        list.remove(index);
        return str;
    }
}