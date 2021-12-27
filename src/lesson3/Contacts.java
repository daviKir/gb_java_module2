package lesson3;

import java.util.ArrayList;
import java.util.List;

public class Contacts {

    List<Contact> book = new ArrayList<>();

    public void add(String surname, String phone) {
        book.add(new Contact(surname, phone));
    }

    public List<String> get(String surname) {
        List<String> phones = new ArrayList<>();
        for (Contact contact : book) {
            if (contact.getSurname().equals(surname)) {
                phones.add(contact.getPhone());
            }
        }
        return phones;
    }
}
