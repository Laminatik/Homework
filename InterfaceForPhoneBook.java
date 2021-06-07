package Homework;

import java.util.Set;

public interface InterfaceForPhoneBook {

    void add(String surname, String phoneNumber);

    Set<String> get(String surname);

    Set<String> getAllSurnames();
}
