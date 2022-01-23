import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Contacts contacts = new Contacts();
        MissedCalls missedCalls = new MissedCalls();
        Scanner scanner = new Scanner(System.in);

        exit:
        while (true) {
            System.out.print("\n" +
                    "Меню:\n" +
                    "1. Добавить контакт\n" +
                    "2. Добавить пропущенный вызов\n" +
                    "3. Вывести все пропущенные вызовы\n" +
                    "4. Очистить пропущенные вызовы\n" +
                    "5. Выход\n" +
                    "Выберите пункт из меню (1-4): ");

            String input = scanner.nextLine();

            if (isInteger(input)) {
                int inputInt = Integer.parseInt(input);
                switch (inputInt) {
                    case 1:
                        System.out.println("Введите через пробел -> имя, фамилия, телефон, группа (WORK, FRIENDS, FAMILY): ");
                        String inputFIO = scanner.nextLine();
                        contacts.addContact(inputFIO);
                        break;
                    case 2:
                        System.out.println("Введите номер пропущенного: ");
                        String inputPhone = scanner.nextLine();
                        missedCalls.addMissedCalls(missedCalls.getStorage(), inputPhone);
                        break;
                    case 3:
                        System.out.println("Пропущенные вызовы:");
                        //contacts.printMap(); // для проверки
                        missedCalls.printMissedCalls(contacts);
                        break;
                    case 4:
                        System.out.println(4);
                        missedCalls.clearMissedCalls(missedCalls.getStorage());
                        break;
                    case 5:
                        System.out.println("Выход");
                        break exit;
                    default:
                        System.out.println("Такого пункта нет! Попробуйте ещё...");
                }
            } else {
                System.out.println("Это не является числом! Введите число!");
            }

        }
        scanner.close();
    }

    static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}