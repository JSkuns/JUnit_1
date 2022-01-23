public class Contact {

    String name;
    String surname;
    String phone;
    String group;

    public Contact(String name, String surname, String phone, String group) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.group = group;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + surname + ", " + phone + ", " + group + "}";
    }
}
