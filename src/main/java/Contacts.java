import java.util.HashMap;
import java.util.Map;

public class Contacts {

    Map<String, Contact> storage = new HashMap<>();

    public void addContact(String inputFullName) {
        String[] partsFullName = inputFullName.split(" ");
        boolean isGroup = false;
        if (partsFullName.length != 4) {
            System.out.println("Вы ввели неправильные данные, попробуйте ещё раз...");
        } else {
            for (Group group : Group.values()) {
                if (partsFullName[3].equals(group.name())) {
                    // partsFIO[0] - name, [1] - surname, [2] - phone, [3] - group
                    storage.put(partsFullName[2], new Contact(partsFullName[0], partsFullName[1], partsFullName[2], partsFullName[3]));
                    System.out.println("Контакт добавлен");
                    isGroup = true;
                }
            }
            if (!isGroup) {
                System.out.println("Данной группы нет в списке, поэтому контакт не добавился!");
            }
        }
    }

    public Contact findContact(String phone) {
        return storage.get(phone);
    }


    // для проверки вывод списка контактов
    public void printMap() {
        System.out.println("Список контактов:");
        listContacts(storage);
    }

    private void listContacts(Map<String, Contact> map) {
        for (Map.Entry<String, Contact> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }


}

