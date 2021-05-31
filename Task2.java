package Homework;

import java.util.Set;

public class Task2 {

    public static void main(String[] args) {
        InterfaceForPhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Anton", "096 065 132");
        phoneBook.add("Oleg", "821 323 496");
        phoneBook.add("Gregor", "666 210 321");
        phoneBook.add("Anton", "666 210 321");
        phoneBook.add("Sebastian", "843 088 321");
        phoneBook.add("Anton", "096 865 132");

        Set<String> allSurnames = phoneBook.getAllSurnames();
        for (String surname : allSurnames) {
            Set<String> phones = phoneBook.get(surname);
            System.out.printf("Имя - %s Номер/a: %s%n", surname, phones);
        }
    }
}
