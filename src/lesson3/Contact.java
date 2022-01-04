package lesson3;

public class Contact {

    private String surname;
    private String phone;

    public Contact(String surname, String phone) {
        this.surname = surname;
        this.phone = phone;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPhone() {
        return this.phone;
    }
}
